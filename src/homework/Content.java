package homework;

public class Content {
    public String content;

    public void setContent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println("Текст книги : " + content);
    }
}
