package com.company;

public class BodyMassIndex {
    public float calculate(float weight, float height) {
        float bmi = weight / (height * height);
        return bmi;
    }
}
