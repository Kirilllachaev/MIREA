package Lab12;

public class Main {

    public static void main(String[] args) {
        ArrayContainer array = new ArrayContainer();
        int a = 1;
        boolean b = false;
        double c = 1.2;
        String d = "Hello world!";
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
    }
}
