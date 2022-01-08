package org.ninad;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SampleLog4jExample {
    private static final Logger logger = LogManager.getLogger(SampleLog4jExample.class);

    public static void main(String[] args){
        logger.debug("Sample Log4j 2 logging");
    }
}
