package com.xmyr.product.contants;

public interface Constants {


    interface RESULT_STATUS {
        Integer CODE_SUCC = 1000;    //成功
        Integer CODE_FAIL = 2000;    //失败
        Integer CODE_FAIL_TOKEN = 3000;    //token失效
        Integer CODE_FAIL_AUTHORITY = 4000;    //无权限
        String DESC_SUCC = "成功";
        String DESC_FAIL = "失败";
    }

}
