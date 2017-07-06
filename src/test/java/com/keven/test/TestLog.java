package com.keven.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by Keven on 2017/7/3.
 */
public class TestLog extends BaseTest {

    public  static Logger logger = LoggerFactory.getLogger(TestLog.class);

    @Test
    public void log() {
        logger.info("this is first log testing by console,time is {}",new Date());
    }
}
