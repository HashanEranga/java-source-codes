import java.sql.SQLOutput;

class MyClass{
    int x = 100;
    static int y = 200;
}

class Example{
    public static void main(String[] args) {
        MyClass a1 = new MyClass();

        System.out.println(a1.x);
        System.out.println(MyClass.y);
        // cannot access non-static variables using MyClass

        MyClass a2 = null;
        System.out.println(a2.y);
        try{
            System.out.println(a2.x);
        }
        catch (NullPointerException ex){
            System.out.println("Error : Null pointer exception occured");
            System.out.println("Error : " + ex.getMessage().toString());
        }
    }
}
