package com.mjie.listener;

import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;

/**
 * @author panmingjie
 * @create 2017/11/13
 */
public class MyLogbackListener implements StatusListener {
    @Override
    public void addStatusEvent(Status status) {
        System.out.println("hello world welcome");
    }
}
