package com.mjie.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author panmingjie
 * @create 2017/11/13
 */
public class Foo {
    static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        logger.debug("Did it again!");
    }
}