package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Article> articles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    void run() {
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String input = scanner.nextLine().trim();
            if (input.equals("종료")) return;
            if (input.equals("등록")) cmdRegister();
        }
    }

    private void cmdRegister() {
        System.out.print("명언 : ");
        String content = scanner.nextLine().trim();
        System.out.print("작가 : ");
        String author = scanner.nextLine().trim();
        int id = articles.size() + 1;
        articles.add(new Article(id, content, author));
        System.out.println(id + "번 명언이 등록되었습니다.");
    }
}
