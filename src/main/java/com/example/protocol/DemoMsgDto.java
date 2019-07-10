package com.example.protocol;

import java.io.Serializable;

public class DemoMsgDto implements Serializable {


    private static final long serialVersionUID = -8499097458264241516L;

    private String demoMsg = "";

    public String getDemoMsg() {
        return demoMsg;
    }

    public void setDemoMsg(String demoMsg) {
        this.demoMsg = demoMsg;
    }
}
