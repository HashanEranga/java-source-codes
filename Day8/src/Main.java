//static initialization (static variables and static methods)
class MyClass {
    int x; //instance variable
    static int y = 10; // class variables, class variables and template variables.
}

class Example {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.x = 1;
        c1.y = 2;

        MyClass c2 = new MyClass();
        c2.x = 10;
        c2.y = 20;

        MyClass c3 = new MyClass();
        c3.x = 100;
        c3.y = 23;

        System.out.println("C1 : " + c1.x + " " + c1.y);
        System.out.println("C2 : " + c2.x + " " + c2.y);
        System.out.println("C3 : " + c3.x + " " + c3.y);
    }
}