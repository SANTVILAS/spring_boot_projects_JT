package com.javatechie.bean;

public class FacebookService implements SocialMediaService{

    @Override
    public void getUserFeeds() {
        System.out.println("Loading userFeeds from facebook");
    }
}
