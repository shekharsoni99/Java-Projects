package com.masai_Evaluation3_Q1;

public class SocialMediaContext {
	
	SocialMediaStrategy socialMediaStrategy;

	public void setSocialMediaStrategy(SocialMediaStrategy socialMediaStrategy) {
		this.socialMediaStrategy = socialMediaStrategy;
	}

	public void connect(String name) {
		socialMediaStrategy.connect(name);
		
		// Friend is searched in given platform database
		// If friend found in database then connect else no found
		System.out.println("Connected..");
	}
	
}
