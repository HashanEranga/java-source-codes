//parsing object to an method
class Value {
    int a;
    Value(int a) {
        this.a = a;
    }
}

class ChangeValue{
    public static void increaseValue(int a){
        a++;
    }

    public static void increaseValueByRef(Value v){
        v.a++;
    }
}

class Demo {
    public static void main(String[] args) {
        Value v1 = new Value(100);
        System.out.println(v1.a);
        // call by value
        ChangeValue.increaseValue(v1.a);
        System.out.println(v1.a);
//        call by reference
        ChangeValue.increaseValueByRef(v1);
        System.out.println(v1.a);
    }
}