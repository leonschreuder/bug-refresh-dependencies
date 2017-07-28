package com.bug.refresh.dependencies;

import en.bug.refresh.dependencies.Sample;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SampleTest {

    @Test
    public void hello_ShouldPrintHelloWorld() throws Exception {
        PrintStream out = mock(PrintStream.class);
        new Sample().hello(out);
        verify(out).println("Hello world!");
    }
}
