package com.company;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(4);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=1; i<=10000; i++){
            arrayList.add(i);
        }

        ThreadRace threadRace = new ThreadRace(arrayList);
        execute.execute(threadRace);

    }

    public static class ThreadRace extends Thread {
        private final Object LOCK = new Object();

        private ArrayList<Integer> odd = new ArrayList<>();
        private ArrayList<Integer> even = new ArrayList<>();
        private ArrayList<Integer> general = new ArrayList<>();

        public ThreadRace(ArrayList<Integer> general) {
            this.general = general;
        }

        @Override
        public void run() {
            for (int i=0; i < general.size(); i++) {
                if (general.get(i) % 2 == 0) {
                    even.add(general.get(i));
                } else {
                    odd.add(general.get(i));
                }
            }
            printOdd();
            printEven();
        }

        public synchronized void printOdd() {
            System.out.println(this.odd);

        }

        public synchronized void printEven() {
            System.out.println(this.even);
        }
    }
}
