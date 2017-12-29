package com.bug.refresh.dependencies;

import java.io.PrintStream;

import com.bug.refresh.dependencies.api.ISdk;

public class Sample implements ISdk {

    public String getSomeString() {
        return "some string";
    }

    public String rootString() {
        return "rootString";
    }

    public String rootString2() {
        return "rootString";
    }

    // public String getSomeOtherString() {
    //     return "some other string";
    // }

    public void hello(PrintStream out) {
        out.println("Hello world!");
    }
}
