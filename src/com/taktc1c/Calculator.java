package com.taktc1c;

/**
 * Created by Taktic on 03.01.2017.
 */
public class Calculator {

    private int result;

    public void add(int ... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    public void deduct(int ... params){
        this.result = params[0] - params[1];
    }

    public void cleanResult(){
        this.result = 0;
    }

    public int getResult(){
        return this.result;
    }
}
