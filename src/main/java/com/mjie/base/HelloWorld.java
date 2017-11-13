package com.mjie.base;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/11
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger helloLogger = LoggerFactory.getLogger("Hello");
        helloLogger.debug("my name is hello");

        Logger logger = LoggerFactory.getLogger("hello");
        System.out.println(logger == helloLogger);

        LoggerContext loggerContext = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);

        Logger rootLogger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);//获取rootLogger

    }
}
