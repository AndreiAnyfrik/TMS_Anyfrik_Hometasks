package by.teachmeskills.hometask7;

public class Bookkeeper implements Printable {
    String name;

    public Bookkeeper() {
        this.name = "bookkeper";
    }

    @Override
    public void print() {
        System.out.printf("Position is %s  ",name);
    }
}
