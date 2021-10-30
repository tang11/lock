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
     * @throws : 连接断开、interrupt等均会抛出AcquireLockException
     */
    void lock() throws AcquireLockException;

    /**
     * @param waitTime:
     *                try to get lock, if get the lock in waitTime, returrn true, else return fasle
     * @param unit:     时间单位
     */
    boolean tryLock(int waitTime, TimeUnit unit);

    /**
     *release lock
     */
    void unlock();
    
}
