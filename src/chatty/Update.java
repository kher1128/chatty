package chatty;

import chatty.util.DateTime;
import chatty.util.StringUtil;

public abstract class Update {
	public String getInfo(ChannelState chstate) {
		String result = "";
		String sep = "|";
		result = appendSlowMode(chstate.slowMode(),result);
		result = appendByBool(chstate.subMode(), result, sep, "sub");
		result = appendFollowersOnly(chstate.getFollowersOnly(), result, sep);
		result = appendByBool(chstate.r9kMode(), result, sep, "r9k");
		result = appendByBool(chstate.emoteOnly(), result, sep, "sub");
		result = appendByString(chstate.getHosting(), result, sep, "Hosting: "+chstate.getHosting());
		result = appendByString(chstate.getLang(), result, sep, chstate.getLang());
		result = appendEmpty(result);
		
		return result;
	}
	public abstract String appendSlowMode(int slowMode, String result);
	public abstract String appendFollowersOnly(int followersOnly, String result, String sep);
	public abstract String appendByBool(boolean boolMode,String result, String sep, String b);
	public abstract String appendByString(String criteria, String result, String sep, String b);
	public abstract String appendEmpty(String result);
}
