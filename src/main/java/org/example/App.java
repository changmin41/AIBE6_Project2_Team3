package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Article> articles = new ArrayList<>();
    private int nextId = 1;
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
        Article article = new Article(nextId++, content, author);
        articles.add(article);
        System.out.println(article.getId() + "번 명언이 등록되었습니다.");
    }
}
