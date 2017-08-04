package org.zk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        try {
            int i = 0;
            int b = 5/i;
        }catch (Exception e) {
            logger.error("error happened:", e);
        }
    }

}
