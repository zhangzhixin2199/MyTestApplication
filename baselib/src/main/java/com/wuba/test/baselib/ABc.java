package com.wuba.test.baselib;

/**
 * Created by jasonzhang on 17/11/8.
 */

public class ABc {
    private static final ABc ourInstance = new ABc();

    public static ABc getInstance() {
        return ourInstance;
    }

    private ABc() {
    }
}
