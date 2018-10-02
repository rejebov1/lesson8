package by.it.academy.lesson8;

import java.util.Objects;

public class Key implements Comparable {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id &&
                Objects.equals(name, key.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Key(int id, String string) {
        this.id = id;
        this.name = string;

    }

    @Override
    public int compareTo(Object o) {
        Key mykey = (Key) o;
        if (this.equals(o)) {
            return 0;
        } else {
            int result1 = (this.id - mykey.id)/Math.abs(this.id - mykey.id);
            int result2 = this.name.compareTo(mykey.name);
            return (this.id==mykey.id)?result2:result1;
        }

    }

}



