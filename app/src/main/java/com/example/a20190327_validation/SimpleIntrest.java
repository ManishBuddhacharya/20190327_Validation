package com.example.a20190327_validation;

public class SimpleIntrest {
    private float principle;
    private float time;
    private float rate;


    public float getPrinciple() {
        return principle;
    }

    public void setPrinciple(float principle) {
        this.principle = principle;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float si(){
        return (this.principle*this.time*this.rate)/100;
    }
}
