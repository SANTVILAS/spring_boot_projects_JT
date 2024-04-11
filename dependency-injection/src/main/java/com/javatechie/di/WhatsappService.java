package com.javatechie.di;

import com.javatechie.bean.SocialMediaService;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService implements SocialMediaService {

    public WhatsappService() {
        System.out.println("Whatapp object created......");
    }

    @Override
    public void getUserFeeds() {
        System.out.println("Load feeds from whatsapp");
    }
}
