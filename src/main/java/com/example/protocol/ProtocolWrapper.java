package com.example.protocol;

import java.io.Serializable;

public class ProtocolWrapper<T> implements Serializable {


    private static final long serialVersionUID = -1626071224604065959L;

    //命令字，代替原来框架中的魔法数字
    private String CMD = "";

    private T t;

    public String getCMD() {
        return CMD;
    }

    public void setCMD(String CMD) {
        this.CMD = CMD;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
