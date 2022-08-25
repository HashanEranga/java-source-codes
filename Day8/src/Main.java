class MyClass {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    MyClass(){
        System.out.println("Constructor block");
    }
}

class Example{
    public static void main(String[] args) {
        MyClass a1 = new MyClass();
        System.out.println("==========================");
        MyClass a2 = new MyClass();
    }
}

//static block run once when the class loads in to the ran and not after other objects are initialized
//instance block runs at every time an object is created
