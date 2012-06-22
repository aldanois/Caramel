package com.sideeffectideas.android.caramel.tests.twitter;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter4jTests {

	private Twitter twitter;

	@Before
	public void configureTwitter() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				.setOAuthConsumerKey("HMUYg4Joe2lO0uc740tVQ")
				.setOAuthConsumerSecret(
						"Hvxy9VDZ1fmONVZTHSxZcIlShjB4kSVfb893Wg8Zk")
				.setOAuthAccessToken(
						"614865099-eTGvqxrtExkt1ryre9u0Hqmz5Yu7wpmxvxiMj78D")
				.setOAuthAccessTokenSecret(
						"A6324qhZYtlPEzrZk9B14bR8fhk5e7zL22vejwH6Gn0");

		TwitterFactory tf = new TwitterFactory(cb.build());
		this.twitter = tf.getInstance();
	}

	@Test
	public void testGetTimeLine() throws TwitterException {
		ResponseList<Status> timeLine = this.twitter.getUserTimeline();
		for (Status status : timeLine) {
			System.out.println(status.getText());
		}
		assertTrue(timeLine.size() > 0);
	}

	@Test
	public void testGetMyHomeTimelineWithData() throws TwitterException {
		ResponseList<Status> timeLine = this.twitter.getHomeTimeline();
		for (Status status : timeLine) {
			System.out.println(status.getText());
		}
		assertTrue(timeLine.size() > 0);
	}

//	 @Test
//	 public void testICanUpdateMyStatus() throws TwitterException {
//	 String statusUpdate = String.valueOf(new Date().getTime()) +
//	 " #todosPutos";
//	 Status status = this.twitter.updateStatus(statusUpdate);
//	 ResponseList<Status> timeline = this.twitter.getUserTimeline();
//	 assertTrue(timeline.contains(status));
//	 }

}
