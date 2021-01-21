package com.lacivita.authprovider;

import org.springframework.stereotype.Component;

@Component
public class ThirdPartyAuthProviderClient {

    public boolean shouldAuthenticate(String username, Object password){
        return username.length() == 4;
    }
}
