class A{
    int a;

//    constructor
    A(){
        System.out.println("Constructor");
        a = 100;
    }

//    instance variable
    {
        a=10;
    }
    /* compiler inserts
    A(){
        a=10;
    }
     */
}
class Example{
    public static void main(String[] args) {
        A a1= new A();
        System.out.println(a1.a);// 10
    }
}

// compiler get the instance variable and
//compiler added accordingly
//compiler found constructor first but then look for instance valiables added them first
//first run the whole file added instance variable
//then run the constructor