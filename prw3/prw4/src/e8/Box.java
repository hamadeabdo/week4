package e8;

public class Box {
    private String content;
@Override
    public String toString() {
        return "Optional[" +
                "content=" + content +"]";
    }

    public String getContent() {
        return content;
    }

    public Box(String content) {
        this.content = content;
    }
}
