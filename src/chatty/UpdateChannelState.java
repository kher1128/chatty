package chatty;

import chatty.util.DateTime;
import chatty.util.StringUtil;

public class UpdateChannelState extends Update {

	public String appendSlowMode(int slowMode, String result) {
		if (slowMode == ChannelState.SLOWMODE_ON_INVALID || slowMode > 86400) {
            result += "Slow: >day";
        } else if (slowMode > 999) {
            result += "Slow: "+DateTime.duration(slowMode*1000, 1, 0);
        } else if (slowMode > 0) {
            result += "Slow: "+slowMode;
        }
		return result;
	}

	public String appendFollowersOnly(int followersOnly,String result, String sep) {
		if (followersOnly == ChannelState.SLOWMODE_ON_INVALID) {
            result = StringUtil.append(result, sep, "Followers: ?");
        } else if (followersOnly > 0) {
            result = StringUtil.append(result, sep, "Followers: "+DateTime.duration((long)followersOnly*60*1000, 1, DateTime.S, DateTime.Formatting.COMPACT));
        } else if (followersOnly == 0) {
            result = StringUtil.append(result, sep, "Followers");
        }
		return result;
	}

	public String appendByBool(boolean boolMode,String result, String sep, String b) {
		if (boolMode) {
            result = StringUtil.append(result, sep, b);
        }
		return result;
	}
	
	public String appendByString(String criteria, String result, String sep, String b) {
		if (criteria != null && !criteria.isEmpty()) {
            result = StringUtil.append(result, sep, b);
        }
		return result;
	}

	public String appendEmpty(String result) {
		if (!result.isEmpty()) {
			result = "[" + result + "]";
		}
		return result;
	}

}
