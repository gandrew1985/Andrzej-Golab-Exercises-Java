package com.exercises;

import java.util.*;

class SumRace {

    public static void main(String[] args) {

        int sumaA = 1000;
        int sumaB = 0;
        int tryCounter = 0;

        Random generator = new Random();

        while (sumaA > sumaB) {
            sumaA += generator.nextInt(9);
            sumaB += generator.nextInt(49);
            tryCounter++;
            System.out.println("try: " + tryCounter + " sumaA: " + sumaA + "  SumaB: " + sumaB);
        }
    }
}
