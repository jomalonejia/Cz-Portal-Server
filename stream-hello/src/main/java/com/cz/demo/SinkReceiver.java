package com.cz.demo;

import com.cz.StreamApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * Created by jomalone_jia on 2017/9/14.
 */
@EnableBinding(Sink.class)
@Component
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(StreamApplication.class);

    @StreamListener(Sink.INPUT)
    public void receice(Object payload){
        logger.info("Received: " + payload);
    }
}
