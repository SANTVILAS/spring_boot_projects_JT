package com.javatechie.bean;

public class SocialMediaServiceFactory {
    //it will return me the instance of social media service
    //facebook ,instgram

    public static SocialMediaService getInstance(String socialMediaType){
        if(socialMediaType.equals("facebook")){
            return new FacebookService();
        }
        if(socialMediaType.equals("instagram")){
            return new InstagramService();
        }
       return null;
    }

}
