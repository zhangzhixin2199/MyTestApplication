package com.wuba.test.mytestapplication;

import android.text.TextUtils;

/**
 * Created by jasonzhang on 17/11/24.
 */

public class StrUtils {
    public static void setValueNorNull(Bean target,String value){
        if (!TextUtils.isEmpty(value)){
            target.abc = value;
        }
    }
}
