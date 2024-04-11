package com.javatechie.bean;

public class InstagramService implements SocialMediaService{

    @Override
    public void getUserFeeds() {
        System.out.println("Loading userFeeds from Instagram");
    }
}
