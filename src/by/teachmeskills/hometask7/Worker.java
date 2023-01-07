package by.teachmeskills.hometask7;

public class Worker implements Printable {
    String name;

    public Worker() {
        this.name = "worker";
    }

    @Override
    public void print() {
        System.out.printf("Position is %s  ", name);

    }
}
