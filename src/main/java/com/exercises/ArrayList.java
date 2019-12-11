package com.exercises;
import java.util.*;

class DividedList {

    private ArrayList <String> evenList;
    private ArrayList <String> oddList;

    public DividedList() {
        evenList = new ArrayList<String>();
        oddList = new ArrayList<String>();
    }

    public void divideList(Deque<String> divList) {
        String tempObj = null;
        while (divList.size() >0) {
            tempObj = divList.poll();
            if (tempObj.length() % 2 == 0) {
                evenList.add(tempObj);
            } else {
                oddList.add(tempObj);
            }
        }
        System.out.println("Even List: " + evenList + "\n Size is: " + evenList.size());
        System.out.println("\n Odd List: " + oddList + "\n Size: " + oddList.size());
    }
}

class ArrayListExercise {

    public static void main(String[] args) {

        Random generator = new Random();

        Deque<String> list = new ArrayDeque<>();
        for(int i = 0; i < 50; i++) {
            StringBuilder builder = new StringBuilder();
            int quantity = generator.nextInt(50) + 1;
            for(int n = 0; n<quantity; n++) {
                builder.append('a');
            }
            list.offer(builder.toString());
        }
        DividedList dividor = new DividedList();
        dividor.divideList(list);
    }
}
