

import java.io.PrintStream;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Zadanie1 {
    public Zadanie1() {
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            LocalTime start = LocalTime.now();
            ArrayList evens = new ArrayList();

            for(Integer i = 1000; i <= 2000; i = i + 2) {
                evens.add(i);
            }

            PrintStream var10000 = System.out;
            int var10001 = Duration.between(start, LocalTime.now()).getNano();
            var10000.println("1000 - 2000 " + var10001 + "ns\n" + evens);
        });
        Thread thread2 = new Thread(() -> {
            LocalTime start = LocalTime.now();
            ArrayList evens = new ArrayList();

            for(Integer i = 14300; i <= 17800; i = i + 2) {
                evens.add(i);
            }

            PrintStream var10000 = System.out;
            int var10001 = Duration.between(start, LocalTime.now()).getNano();
            var10000.println("14300 - 17800 " + var10001 + "ns\n" + evens);
        });
        thread1.start();
        thread2.start();
    }
}


