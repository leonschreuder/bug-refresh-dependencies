package com.bug.refresh.dependencies;

import java.io.PrintStream;

import com.bug.refresh.dependencies.api.ISdk;

public class Sample implements ISdk {

    public String getSomeString() {
        return "some string";
    }

    // public String getSomeOtherString() {
    //     return "some other string";
    // }

    public void hello(PrintStream out) {
        out.println("Hello world!");
    }
}
