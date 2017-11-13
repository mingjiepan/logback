package com.mjie.base;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/13
 */
public class MyApp2 {
    public static void main(String[] args) {
        LoggerContext loggerContent = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContent);
    }
}
