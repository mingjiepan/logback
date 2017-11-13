package com.mjie.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/13
 */
public class MyApp1 {
    final static Logger logger = LoggerFactory.getLogger(MyApp1.class);

    public static void main(String[] args) {
        logger.info("Entering application.");
        Foo foo = new Foo();
        foo.doIt();
        logger.info("Exiting application.");
    }
}
