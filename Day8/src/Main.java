class A {
    int a = 100;
    static int b = 200;
    public static void main(String[] args) {
//        System.out.println(a); // error
        System.out.println(b);
        System.out.println(A.b);
        System.out.println(new A().a);
        new A().get();
    }

    public void get(){
        System.out.println(a);
        System.out.println(b);
    }
}
