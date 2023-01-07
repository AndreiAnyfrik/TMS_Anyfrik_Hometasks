package by.teachmeskills.hometask8.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstphone = new Phone(111, "iphone", 200);
        Phone secondphone = new Phone(112, "samsungs20", 300);
        Phone thirdphone = new Phone(122, "xiomi8", 400);
        System.out.println(firstphone.getInfo());
        System.out.println(secondphone.getInfo());
        System.out.println(thirdphone.getInfo());
        secondphone.receiveCall("ALeksandr");
        firstphone.sendMessage(11, 22);
        firstphone.receiveCall("Andrew", 2222);
    }
}
