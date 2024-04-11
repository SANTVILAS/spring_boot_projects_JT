package com.javatechie.di;

import com.javatechie.bean.SocialMediaService;
import org.springframework.stereotype.Service;

@Service

public class TikTokService implements SocialMediaService {

    @Override
    public void getUserFeeds() {
        System.out.println("Feeds loaded from tiktok");
    }
}

