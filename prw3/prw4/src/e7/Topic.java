package e7;

import java.util.Objects;

public class Topic {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topic)) return false;
        Topic topic = (Topic) o;
        return Objects.equals(getName(), topic.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return
                "text=" + name ;
    }

    public String getName() {
        return name;
    }

    public Topic(String name) {
        this.name = name;
    }
}
