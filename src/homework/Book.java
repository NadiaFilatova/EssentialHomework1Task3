package homework;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        System.out.println("Введіть ім'я автора : ");
        author.setAuthor(scanner.next());

        System.out.println("Введіть заголовок книги : ");
        title.setTitle(scanner.next());

        System.out.println("Введіть текст книги : ");
        content.setContent(scanner.next());

        author.show();
        title.show();
        content.show();
    }

}
