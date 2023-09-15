package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.print();
        Mother mom = new Mother();
        mom.setName("Glenda");
        System.out.println(mom.getName() + " is a "+ mom.getGender());
        Square square = new Square();
        square.print("square");
        Employee employee = new Employee();
    }
}
