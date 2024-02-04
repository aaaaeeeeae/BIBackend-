package com.yupi.springbootinit.constant;

public interface ChartStatus {
//
    /**
     * 排队中
     */
    String WAIT_STATUS = "wait";

    /**
     * 分析中
     */
    String RUNNING_STATUS = "running";

    /**
     * 分析成功
     */
    String SUCCEED_STATUS = "succeed";

    /**
     * 分析失败
     */
    String FAILD_STATUS = "failed";

}
