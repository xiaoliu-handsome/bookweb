package com.offcn.pojo;

/**
 * 全局结果
 * author:rengl
 * 2023-04-08 7:25
 */
public class Result {
    private boolean code;
    private String msg;
    private Object data;

    public Result(boolean code, String msg,Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }



    public Result() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(boolean code) {
        this.code = code;
    }
}
