package com.base.lock;

/**
 * @author  tanglijuan
 * @date 2021/10/30
 */
public interface BusinessProcess<T> {

    T doProcess() throws Exception;

}
