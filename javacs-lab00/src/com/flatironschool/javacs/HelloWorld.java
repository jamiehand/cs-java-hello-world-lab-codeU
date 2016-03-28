package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        Double myVersion = Double.parseDouble(System.getProperty("java.version"));
        return myVersion;
    }

    public static void main(String[] args) {
	    // TODO look into: what to put here/how to see the output for myself
    }
}
