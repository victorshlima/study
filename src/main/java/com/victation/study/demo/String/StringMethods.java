package com.victation.study.demo.String;

public class StringMethods {

    public static String stringBufferTest() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1").append("2").append("3");

        return stringBuffer.toString();
    }

}
