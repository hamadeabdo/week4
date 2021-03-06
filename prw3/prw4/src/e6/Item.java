package e6;

import java.util.Objects;

public class Item {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getName(), item.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "name=" + name;
    }

    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
    }
}
