class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Employee extends Person {
    Employee() {
        super(); 
        System.out.println("Employee constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}