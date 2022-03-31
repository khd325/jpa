package hellojpa;

public class ValueMain {
    public static void main(String[] args) {
        Address a = new Address("city", "street", "10000");
        Address b = new Address("city", "street", "10000");


        System.out.println("a == b: " + (a == b));
        System.out.println("a equals b: " + (a.equals(b)));
    }
}
