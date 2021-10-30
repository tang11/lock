package com.base.lock;

import java.util.concurrent.TimeUnit;

/**
 * @author  tanglijuan
 * @date 2021/10/30
 */
public class AbstractLock {
    public <T> T doWithLockProtect(int waitTime, BusinessProcess<T> businessProcess) {
        return null;
    }
    }
