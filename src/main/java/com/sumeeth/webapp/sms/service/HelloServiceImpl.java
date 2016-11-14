package com.sumeeth.webapp.sms.service;

import org.springframework.stereotype.Service;

/**
 * Created by daljit on 12-Nov-16.
 */
@Service
public class HelloServiceImpl implements HelloService {

    public void hello(String name){
        System.out.println( "Hello, " + name );
    }
    public void error(String name){
        System.out.println( "Error occured" );
    }

}
