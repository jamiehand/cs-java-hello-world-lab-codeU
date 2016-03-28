package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String strVersion = System.getProperty("java.specification.version");
        System.out.println(strVersion);
        Double numVersion = Double.parseDouble(strVersion);
        return numVersion;
    }

    public static void main(String[] args) {
        getVersion();
	    // System.out.println(Double.toString(getVersion()));
    }
}
