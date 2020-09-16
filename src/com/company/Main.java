package com.company;

public class Main {

    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        float weight = 53F;
        float height = 1.58F;

        float bmi = bodyMassIndex.calculate(weight, height);
        System.out.print(bmi);
    }
}
