package com.base.lock;

import com.base.lock.AcquireLockException;

import java.util.concurrent.TimeUnit;

/**
 * @author  tanglijuan
 * @date 2021/10/30
 */
public interface Lock {

    String getLockName();


    String getRealLockName();

    /**
     * try to get lock, wait if not get the lock
     * 尝试获取锁，如果获取不到，会一直阻塞
     *
     * @throws : 连接断开、interrupt等均会抛出CannotAcquireLockException
     */
    void lock() throws AcquireLockException;

    /**
     * @param waitTime: 尝试获取锁，若在waitTime时间内获取到了，返回true；否则，在waitTime时间后返回false。
     *                  方法也有可能在waitTime时间内返回，如果中间发生异常。
     * @param unit:     时间单位
     */
    boolean tryLock(int waitTime, TimeUnit unit);

    /**
     * 释放锁。如果是可重入锁，在重入次数减为0时释放锁
     */
    void unlock();
    
}
