package com.sideeffectideas.android.caramel.tests.twitter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter4jTests {

	private void configureTwitter() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				.setOAuthConsumerKey("LHcU8bprCnTRfxsxTUjWQ")
				.setOAuthConsumerSecret(
						"yR4rMbbsegOY2nfLCuXNifXOIx0bmItXfCIQzpik")
				.setOAuthAccessToken(
						"**************************************************")
				.setOAuthAccessTokenSecret(
						"******************************************");

		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
	}

	@Test
	public void testGetTimeLine() throws TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		ResponseList<Status> timeLine = twitter.getUserTimeline();
		for (Status status : timeLine) {
			System.out.println(status.getText());
		}
		assertTrue(timeLine.size() > 0);
	}

}
