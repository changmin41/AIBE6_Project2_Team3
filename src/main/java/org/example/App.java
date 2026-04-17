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
            Rq rq = new Rq(input);
            switch (rq.getCmd()) {
                case "종료": return;
                case "등록": cmdRegister(); break;
                case "목록": cmdList(); break;
                case "삭제": cmdDelete(rq); break;
            }
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

    private void cmdList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (int i = articles.size() - 1; i >= 0; i--) {
            Article a = articles.get(i);
            System.out.println(a.getId() + " / " + a.getAuthor() + " / " + a.getContent());
        }
    }

    private void cmdDelete(Rq rq) {
        int id = rq.getIntParam("id", -1);
        Article target = findById(id);
        articles.remove(target);
        System.out.println(id + "번 명언이 삭제되었습니다.");
    }

    private Article findById(int id) {
        for (Article a : articles) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}
