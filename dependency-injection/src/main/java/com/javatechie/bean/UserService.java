package com.javatechie.bean;

public class UserService {
//socialMediaApp is dependency , we need to inject in User service

    private SocialMediaService socialMediaService;

    public SocialMediaService getSocialMediaService() {// spring use these two type of depemdency injection one is constructor
        return socialMediaService;
    }

    public UserService() {
    }

    public UserService(SocialMediaService socialMediaService) {//spring use these two type of depemdency injection one is setter
        this.socialMediaService = socialMediaService;
    }

    public void setSocialMediaService(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    public void displayFeeds(){
  //===============================//this the approach -1==================================//

//        SocialMediaApp app = new SocialMediaApp();
//        FacebookService facebookService =new FacebookService();
//        InstagramService instagramService =new InstagramService();
//        app.getUserFeeds();

        //===============================//this the approach -2==================================//

        //apprach -2 with interface referece I can create the objects that is also called run time polymorphism
//        SocialMediaService service = new FacebookService();
//        service.getUserFeeds();
//        //now tomorrow if user want to use InstagramService then he just chanmge the implemetation
//        service = new InstagramService();
//        service.getUserFeeds();

        //===============================//this the approach -3 factory class=====depend on the name of class==>facebook=============================//

//        SocialMediaService instance=SocialMediaServiceFactory.getInstance("facebook");//ye sift object return krke dega runtime pe
//        instance.getUserFeeds();

        //=============================approach -4 now we are injecting dependency at runtime=========================================

        socialMediaService.getUserFeeds();

    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.setSocialMediaService(new InstagramService());//if tomorrow is reuirement for different service then you can dynamically allocate dependency during run time of code,
        userService.displayFeeds();
    }

}
