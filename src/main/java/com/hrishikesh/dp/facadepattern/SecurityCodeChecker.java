package com.hrishikesh.dp.facadepattern;

/**
 * @author hrishikesh.mishra
 */
public class SecurityCodeChecker {

    private final int securityCode = 321;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCode ){
        return getSecurityCode() == securityCode;
    }
}
