package com.base.lock;

/**
 * @author  tanglijuan
 * @date 2021/10/30
 */
public class AcquireLockException extends RuntimeException{
    public AcquireLockException(Throwable e) {
        super(e);
    }

}
