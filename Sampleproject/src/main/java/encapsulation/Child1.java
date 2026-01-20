package encapsulation;

public class Child1 {

    public static void main(String[] args) {

        Parent1 obj = new Parent1();
        obj.setLength(100);
        obj.setBreadth(33);

        System.out.println("Length: " + obj.getLength());
        System.out.println("Breadth: " + obj.getBreadth());
    }
}


