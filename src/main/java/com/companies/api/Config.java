package com.companies.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sanchit on 24/1/16.
 */

@Configuration
public class Config {

    @Bean
    public BrowserAndOSUtil browserAndOSUtil() {
        return new BrowserAndOSUtil();
    }
}
