package com.example.angelo.mbelateste1;

/**
 * Created by Nameless on 12/17/2018.
 */

public class Authentication {
    private static final Authentication ourInstance = new Authentication();

    public static Authentication getInstance() {
        return ourInstance;
    }

    private Authentication() {
    }
}
