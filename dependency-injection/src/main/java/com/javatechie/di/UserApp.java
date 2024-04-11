package com.javatechie.di;

import com.javatechie.bean.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Repository
@Service
@Controller
public class UserApp{
//this is setter injection , jahan property k upper @Autiwired annotation lkikhte hai
    @Autowired
  //  @Qualifier("tikTokService")
    @Qualifier("whatsappService")
// private SocialMediaService service;

    //==================================================================================
    //=============constructor injection======================================

    private SocialMediaService service;
  //  @Autowired
    public UserApp(@Qualifier("whatsappService") SocialMediaService service) {
        this.service = service;
    }
//=======================================================================
    public void loadUserFeed(){
    service.getUserFeeds();
    }

}
