package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final int ITERATIONS = 1000;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayList.add(i);
        }
        long addArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            arrayList.get(i);
        }
        long getArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = ITERATIONS - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        long deleteArrayListTime = System.nanoTime() - startTime;

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedList.add(i);
        }
        long addLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            linkedList.get(i);
        }
        long getLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = ITERATIONS - 1; i >= 0; i--) {
            linkedList.removeLast();
        }
        long deleteLinkedListTime = System.nanoTime() - startTime;

        System.out.println("Method\t\t\tIterations\tTime (ns)");
        System.out.println("ArrayList Add\t\t" + ITERATIONS + "\t\t" + (addArrayListTime ));
        System.out.println("ArrayList Get\t\t" + ITERATIONS + "\t\t" + (getArrayListTime ));
        System.out.println("ArrayList Delete\t" + ITERATIONS + "\t\t" + (deleteArrayListTime ));
        System.out.println("LinkedList Add\t\t" + ITERATIONS + "\t\t" + (addLinkedListTime ));
        System.out.println("LinkedList Get\t\t" + ITERATIONS + "\t\t" + (getLinkedListTime ));
        System.out.println("LinkedList Delete\t" + ITERATIONS + "\t\t" + (deleteLinkedListTime));
    }
}
