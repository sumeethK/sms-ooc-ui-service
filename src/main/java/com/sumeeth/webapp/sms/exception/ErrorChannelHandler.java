package com.sumeeth.webapp.sms.exception;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * Created by daljit on 12-Nov-16.
 */
@Component
public class ErrorChannelHandler {
    Logger LOGGER = Logger.getLogger(ErrorChannelHandler.class);
    public void error(String name)
    {
        LOGGER.warn("Filtered out Message : " +name);
    }

}
