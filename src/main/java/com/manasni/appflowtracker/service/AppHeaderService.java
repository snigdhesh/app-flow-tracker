package com.manasni.appflowtracker.service;

import com.manasni.appflowtracker.config.AppHeaderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppHeaderService {
    private final List<String> appHeaders;

    @Autowired
    public AppHeaderService(AppHeaderConfig appHeaderConfig){
        System.out.println("Setting app config: "+appHeaderConfig.getHeaders());
        this.appHeaders = appHeaderConfig.getHeaders();
    }

    public List<String> getAppHeaders(){
        return this.appHeaders;
    }

}
