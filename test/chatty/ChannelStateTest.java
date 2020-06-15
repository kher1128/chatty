package chatty;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import chatty.util.settings.Settings;

/**
 *
 * @author Seo-Gwanghyeon
 */

public class ChannelStateTest {
	private ChannelState cs;

	public ChannelStateTest() {

	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		cs = new ChannelState("new Channel");
	}

	@After
	public void tearDown() {
	}

	// TODO reset test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}

	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(true);
	 * 	setSlowMode(-1);
	 *  setR9kMode(false);
	 *	setEmoteOnly(false);
	 *	setHosting(null);
	 *	setFollowersOnly(-1);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */
	
	@Test
	public void testReset1() {
		cs.setSubMode(true);
		cs.setSlowMode(-1);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setFollowersOnly(-1);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}
	
	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(false);
	 * 	setSlowMode(0);
	 *  setR9kMode(true);
	 *	setEmoteOnly(false);
	 *	setHosting("somestring");
	 *	setFollowersOnly(0);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */

	@Test
	public void testReset2() {
		cs.setSubMode(false);
		cs.setSlowMode(0);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setFollowersOnly(0);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}
	
	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(true);
	 *	setSlowMode(0);
	 *	setR9kMode(true);
	 *	setEmoteOnly(false);
	 *	setHosting(null);
	 *	setFollowersOnly(-1);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */

	@Test
	public void testReset3() {
		cs.setSubMode(true);
		cs.setSlowMode(0);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setFollowersOnly(-1);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}

	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(true);
	 *	setSlowMode(-1);
	 *	setR9kMode(true);
	 *	setEmoteOnly(true);
	 *	setHosting("somestring");
	 *	setFollowersOnly(0);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */
	@Test
	public void testReset4() {
		cs.setSubMode(true);
		cs.setSlowMode(-1);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setFollowersOnly(0);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}

	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(false);
	 *	setSlowMode(0);
	 *	setR9kMode(false);
	 *	setEmoteOnly(true);
	 *	setHosting(null);
	 *	setFollowersOnly(0);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */
	@Test
	public void testReset5() {
		cs.setSubMode(false);
		cs.setSlowMode(0);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setFollowersOnly(0);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}

	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(false);
	 *	setSlowMode(-1);
	 *	setR9kMode(false);
	 *	setEmoteOnly(false);
	 *	setHosting("somestring");
	 *	setFollowersOnly(-1);
	 * Expected:
	 *		Return true
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */
	@Test
	public void testReset6() {
		cs.setSubMode(false);
		cs.setSlowMode(-1);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setFollowersOnly(-1);
		assertEquals(cs.reset(), true);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}

	/*
	 * Purpose: Reset Attributes
	 * State: 
	 * 	setSubMode(false);
	 *	setSlowMode(-1);
	 *	setR9kMode(false);
	 *	setEmoteOnly(false);
	 *	setHosting(null);
	 *	setFollowersOnly(-1);
	 * Expected:
	 *		Return false
	 *		subMode = false
	 *		slowMode = -1
	 *		r9kMode = false
	 *		emoteOnly = false
	 *		hosting = null
	 *		followersOnly = -1
	 */
	@Test
	public void testReset7() {
		cs.setSubMode(false);
		cs.setSlowMode(-1);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setFollowersOnly(-1);
		assertEquals(cs.reset(), false);

		assertEquals(cs.subMode(), false);
		assertEquals(cs.slowMode(), -1);
		assertEquals(cs.r9kMode(), false);
		assertEquals(cs.emoteOnly(), false);
		assertEquals(cs.getHosting(), null);
		assertEquals(cs.getFollowersOnly(), -1);
	}
	
	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 * 	setSlowMode(-1);
	 *	setSubMode(true);
	 *	setFollowersOnly(-1);
	 *	setR9kMode(false);
	 *	setEmoteOnly(false);
	 *	setHosting(null);
	 *	setLang(null);
	 * Expected:
	 *		Return "[sub]"
	 */
	@Test
	public void testUpdateInfo1() {
		cs.setSlowMode(-1);
		cs.setSubMode(true);
		cs.setFollowersOnly(-1);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setLang(null);
		
		cs.updateInfo();
		String result="[sub]";		
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 * 	setSlowMode(-2);
	 *	setSubMode(false);
	 *	setFollowersOnly(-10);
	 *	setR9kMode(true);
	 *	setEmoteOnly(true);
	 *	setHosting("somestring");
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: >day|r9k|EmoteOnly|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo2() {
		cs.setSlowMode(-2);
		cs.setSubMode(false);
		cs.setFollowersOnly(-10);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setLang("somestring");
		
		cs.updateInfo();
		String result="[Slow: >day|r9k|EmoteOnly|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(86500);
	 *	setSubMode(true);
	 *	setFollowersOnly(-2);
	 *	setR9kMode(false);
	 *	setEmoteOnly(true);
	 *	setHosting(null);
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: >day|sub|Followers: ?|EmoteOnly|somestring]"
	 */
	@Test
	public void testUpdateInfo3() {
		cs.setSlowMode(86500);
		cs.setSubMode(true);
		cs.setFollowersOnly(-2);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: >day|sub|Followers: ?|EmoteOnly|somestring]";
		assertEquals(cs.getInfo(),result);
		
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(86500);
	 *	setSubMode(true);
	 *	setFollowersOnly(-2);
	 *	setR9kMode(false);
	 *	setEmoteOnly(true);
	 *	setHosting(null);
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: >day|sub|Followers: ?|EmoteOnly|somestring]"
	 */
	@Test
	public void testUpdateInfo4() {
		cs.setSlowMode(100);
		cs.setSubMode(false);
		cs.setFollowersOnly(0);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang(null);
		
		cs.updateInfo();
		String result="[Slow: 100|Followers|r9k|Hosting: somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(1000);
	 *	setSubMode(true);
	 *	setFollowersOnly(0);
	 *	setR9kMode(true);
	 *	setEmoteOnly(true);
	 *	setHosting(null);
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: 16m|sub|Followers|r9k|EmoteOnly|somestring]"
	 */
	@Test
	public void testUpdateInfo5() {
		cs.setSlowMode(1000);
		cs.setSubMode(true);
		cs.setFollowersOnly(0);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setLang("somestring");
		
		cs.updateInfo();
		String result="[Slow: 16m|sub|Followers|r9k|EmoteOnly|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(100);
	 *	setSubMode(true);
	 *	setFollowersOnly(-2);
	 *	setR9kMode(false);
	 *	setEmoteOnly(false);
	 *	setHosting("somestring");
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: 100|sub|Followers: ?|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo6() {
		cs.setSlowMode(100);
		cs.setSubMode(true);
		cs.setFollowersOnly(-2);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: 100|sub|Followers: ?|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-10);
	 *	setSubMode(false);
	 *	setFollowersOnly(5);
	 *	setR9kMode(false);
	 *	setEmoteOnly(true);
	 *	setHosting(null);
	 *	setLang(null);
	 * Expected:
	 *		Return "[Followers: 5m|EmoteOnly]"
	 */
	@Test
	public void testUpdateInfo7() {
		cs.setSlowMode(-10);
		cs.setSubMode(false);
		cs.setFollowersOnly(5);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setLang(null);

		cs.updateInfo();
		String result="[Followers: 5m|EmoteOnly]";
		assertEquals(cs.getInfo(),result);

	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-10);
	 *	setSubMode(true);
	 *	setFollowersOnly(-10);
	 *	setR9kMode(true);
	 *	setEmoteOnly(false);
	 *	setHosting("somestring");
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[sub|r9k|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo8() {
		cs.setSlowMode(-10);
		cs.setSubMode(true);
		cs.setFollowersOnly(-10);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang("somestring");
		
		cs.updateInfo();
		String result="[sub|r9k|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-10);         
	 *	setSubMode(false);        
	 *	setFollowersOnly(0);      
	 *	setR9kMode(false);        
	 *	setEmoteOnly(true);       
	 *	setHosting("somestring"); 
	 *	setLang(null);            
	 * Expected:
	 *		Return "[Followers|EmoteOnly|Hosting: somestring]"
	 */
	@Test
	public void testUpdateInfo9() {
		cs.setSlowMode(-10);
		cs.setSubMode(false);
		cs.setFollowersOnly(0);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setLang(null);

		cs.updateInfo();
		String result="[Followers|EmoteOnly|Hosting: somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-10);         
	 *	setSubMode(false);        
	 *	setFollowersOnly(-2);     
	 *	setR9kMode(true);         
	 *	setEmoteOnly(false);      
	 *	setHosting("somestring"); 
	 *	setLang(null);            
	 * Expected:
	 *		Return "[Followers: ?|r9k|Hosting: somestring]"
	 */
	@Test
	public void testUpdateInfo10() {
		cs.setSlowMode(-10);
		cs.setSubMode(false);
		cs.setFollowersOnly(-2);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang(null);

		cs.updateInfo();
		String result="[Followers: ?|r9k|Hosting: somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(86500);      
	 *	setSubMode(false);       
	 *	setFollowersOnly(5);     
	 *	setR9kMode(true);        
	 *	setEmoteOnly(false);     
	 *	setHosting("somestring");
	 *	setLang(null);           
	 * Expected:
	 *		Return "[Slow: >day|Followers: 5m|r9k|Hosting: somestring]"
	 */
	@Test
	public void testUpdateInfo11() {
		cs.setSlowMode(86500);
		cs.setSubMode(false);
		cs.setFollowersOnly(5);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang(null);

		cs.updateInfo();
		String result="[Slow: >day|Followers: 5m|r9k|Hosting: somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(100);     
	 *	setSubMode(true);     
	 *	setFollowersOnly(5);  
	 *	setR9kMode(true);     
	 *	setEmoteOnly(true);   
	 *	setHosting(null);     
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: 100|sub|Followers: 5m|r9k|EmoteOnly|somestring]"
	 */
	@Test
	public void testUpdateInfo12() {
		cs.setSlowMode(100);
		cs.setSubMode(true);
		cs.setFollowersOnly(5);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: 100|sub|Followers: 5m|r9k|EmoteOnly|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-2);    
	 *	setSubMode(true);   
	 *	setFollowersOnly(5);
	 *	setR9kMode(false);  
	 *	setEmoteOnly(false);
	 *	setHosting(null);   
	 *	setLang(null);      
	 * Expected:
	 *		Return "[Slow: >day|sub|Followers: 5m]"
	 */
	@Test
	public void testUpdateInfo13() {
		cs.setSlowMode(-2);
		cs.setSubMode(true);
		cs.setFollowersOnly(5);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setLang(null);

		cs.updateInfo();
		String result="[Slow: >day|sub|Followers: 5m]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(1000);       
	 *	setSubMode(false);       
	 *	setFollowersOnly(5);     
	 *	setR9kMode(true);        
	 *	setEmoteOnly(true);      
	 *	setHosting("somestring");
	 *	setLang("somestring");   
	 * Expected:
	 *		Return "[Slow: 16m|Followers: 5m|r9k|EmoteOnly|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo14() {
		cs.setSlowMode(1000);
		cs.setSubMode(false);
		cs.setFollowersOnly(5);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: 16m|Followers: 5m|r9k|EmoteOnly|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(1000);       
	 *	setSubMode(true);        
	 *	setFollowersOnly(-2);    
	 *	setR9kMode(true);        
	 *	setEmoteOnly(true);      
	 *	setHosting("somestring");
	 *	setLang("somestring");   
	 * Expected:
	 *		Return "[Slow: 16m|sub|Followers: ?|r9k|EmoteOnly|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo15() {
		cs.setSlowMode(1000);
		cs.setSubMode(true);
		cs.setFollowersOnly(-2);
		cs.setR9kMode(true);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: 16m|sub|Followers: ?|r9k|EmoteOnly|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(100);         
	 *	setSubMode(true);         
	 *	setFollowersOnly(-10);    
	 *	setR9kMode(true);         
	 *	setEmoteOnly(false);      
	 *	setHosting("somestring"); 
	 *	setLang("somestring");    
	 * Expected:
	 *		Return "[Slow: 100|sub|r9k|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo16() {
		cs.setSlowMode(100);
		cs.setSubMode(true);
		cs.setFollowersOnly(-10);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting("somestring");
		cs.setLang("somestring");

		
		cs.updateInfo();
		String result="[Slow: 100|sub|r9k|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(86500);       
	 *	setSubMode(false);        
	 *	setFollowersOnly(-10);    
	 *	setR9kMode(false);        
	 *	setEmoteOnly(true);       
	 *	setHosting("somestring"); 
	 *	setLang("somestring");    
	 * Expected:
	 *		Return "[Slow: >day|EmoteOnly|Hosting: somestring|somestring]"
	 */
	@Test
	public void testUpdateInfo17() {
		cs.setSlowMode(86500);
		cs.setSubMode(false);
		cs.setFollowersOnly(-10);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting("somestring");
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: >day|EmoteOnly|Hosting: somestring|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-2);     
	 *	setSubMode(false);   
	 *	setFollowersOnly(-2);
	 *	setR9kMode(false);   
	 *	setEmoteOnly(true);  
	 *	setHosting(null);    
	 *	setLang(null);       
	 * Expected:
	 *		Return "[Slow: >day|Followers: ?|EmoteOnly]"
	 */
	@Test
	public void testUpdateInfo18() {
		cs.setSlowMode(-2);
		cs.setSubMode(false);
		cs.setFollowersOnly(-2);
		cs.setR9kMode(false);
		cs.setEmoteOnly(true);
		cs.setHosting(null);
		cs.setLang(null);

		cs.updateInfo();
		String result="[Slow: >day|Followers: ?|EmoteOnly]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-2);        
	 *	setSubMode(true);       
	 *	setFollowersOnly(0);    
	 *	setR9kMode(false);      
	 *	setEmoteOnly(false);    
	 *	setHosting(null);       
	 *	setLang("somestring");  
	 * Expected:
	 *		Return "[Slow: >day|sub|Followers|somestring]"
	 */
	@Test
	public void testUpdateInfo19() {
		cs.setSlowMode(-2);
		cs.setSubMode(true);
		cs.setFollowersOnly(0);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: >day|sub|Followers|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(86500);   
	 *	setSubMode(false);    
	 *	setFollowersOnly(0);  
	 *	setR9kMode(true);     
	 *	setEmoteOnly(false);  
	 *	setHosting(null);     
	 *	setLang("somestring");
	 * Expected:
	 *		Return "[Slow: >day|Followers|r9k|somestring]"
	 */
	@Test
	public void testUpdateInfo20() {
		cs.setSlowMode(86500);
		cs.setSubMode(false);
		cs.setFollowersOnly(0);
		cs.setR9kMode(true);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setLang("somestring");

		cs.updateInfo();
		String result="[Slow: >day|Followers|r9k|somestring]";
		assertEquals(cs.getInfo(),result);
	}

	/*
	 * Purpose: Update Info by Attributes
	 * State: 
	 *	setSlowMode(-10);        
	 *	setSubMode(false);       
	 *	setFollowersOnly(-10);   
	 *	setR9kMode(false);       
	 *	setEmoteOnly(false);     
	 *	setHosting(null);        
	 *	setLang(null);           
	 * Expected:
	 *		Return ""
	 */
	@Test
	public void testUpdateInfo21() {
		cs.setSlowMode(-10);
		cs.setSubMode(false);
		cs.setFollowersOnly(-10);
		cs.setR9kMode(false);
		cs.setEmoteOnly(false);
		cs.setHosting(null);
		cs.setLang(null);

		cs.updateInfo();
		String result="";
		assertEquals(cs.getInfo(),result);
	}

}
