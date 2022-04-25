package com.masai_Evaluation3_Q1;

interface SocialMediaStrategy {
	public boolean connect(String name);
}

class FacebookStrategy implements SocialMediaStrategy {

	@Override
	public boolean connect(String name) {
		// find this friend of given name
		
		//Search in Database for friend and send request
		// If friend presend in Db return true else return false
		System.out.println("Connecting with " + name + " through Facebook");
		return false;
	}
	
}

class TwitterStrategy implements SocialMediaStrategy {

	@Override
	public boolean connect(String name) {
		// find this friend of given name
		
		//Search in Database for friend and send request
		// If friend presend in Db return true else return false
		System.out.println("Connecting with " + name + " through Twitter");
		return false;
	}
	
}

class GooglePlusStrategy implements SocialMediaStrategy {

	@Override
	public boolean connect(String name) {
		// find this friend of given name
		
		//Search in Database for friend and send request
		// If friend presend in Db return true else return false
		System.out.println("Connecting with " + name + " through GooglePlus");
		return false;
	}
	
}

class OrkutStrategy implements SocialMediaStrategy {

	@Override
	public boolean connect(String name) {
		// find this friend of given name
		
		//Search in Database for friend and send request
		// If friend presend in Db return true else return false
		System.out.println("Connecting with " + name + " through Orkut");
		System.out.println("Friend not found on Orkut");
		return false;
	}
	
}