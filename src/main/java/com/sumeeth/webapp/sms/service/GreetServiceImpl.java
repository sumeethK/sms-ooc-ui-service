package com.sumeeth.webapp.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;


/**
 * Created by daljit on 12-Nov-16.
 */
@Service
public class GreetServiceImpl implements GreetService {
    @Autowired
    MessageChannel channell;
    @Override
    public void greet(String name) {
        channell.send(MessageBuilder.withPayload(name).build());
    }

}
