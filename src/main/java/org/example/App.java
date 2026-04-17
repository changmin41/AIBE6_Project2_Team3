package org.example;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String input = scanner.nextLine().trim();
            if (input.equals("종료")) return;
        }
    }
}
