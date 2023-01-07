package by.teachmeskills.hometask7;

public class Director implements Printable {
    String name;

    public Director() {
        this.name = "director";
    }

    @Override
    public void print() {
        System.out.printf("Position is %s  ", name);
    }
}
