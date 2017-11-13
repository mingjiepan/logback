package com.mjie.base;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/13
 */
public class MyApp3 {
    public static void main(String[] args) {
        //You may also attach a StatusListener to a StatusManager so that you can take immediate action in
        // response to status messages, especially to messages occurring after logback configuration.
        // Registering a status listener is a convenient way to supervise logback's internal state without human intervention
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusManager statusManager = lc.getStatusManager();
        OnConsoleStatusListener onConsoleListener = new OnConsoleStatusListener();
        statusManager.add(onConsoleListener);
    }
}
