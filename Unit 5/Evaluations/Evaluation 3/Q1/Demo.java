package com.masai_Evaluation3_Q1;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		// any social media strategy.
		SocialMediaContext context = new SocialMediaContext();
		
		System.out.println("Enter your friend name with you want to connect");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		// Setting Facebook strategy.
		context.setSocialMediaStrategy(new FacebookStrategy());
		context.connect(name);
		
		// Setting Twitter strategy.
		context.setSocialMediaStrategy(new TwitterStrategy());
		context.connect(name);
		
		// Setting GooglePlus strategy.
		context.setSocialMediaStrategy(new GooglePlusStrategy());
		context.connect(name);
		
		// Setting Orkut strategy.
		context.setSocialMediaStrategy(new OrkutStrategy());
		context.connect(name);
	}
}