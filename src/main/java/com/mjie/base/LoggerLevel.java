package com.mjie.base;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/11
 */
public class LoggerLevel {
    public static void main(String[] args) {

        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger(LoggerLevel.class);
        logger.setLevel(Level.INFO);
        logger.setAdditive(false);

        // This request is enabled, because WARN >= INFO
        logger.warn("Low fuel level.");

        // This request is disabled, because DEBUG < INFO.
        logger.debug("Starting search for nearest gas station.");
    }
}
