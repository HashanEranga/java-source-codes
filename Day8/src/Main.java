//private method
class A{
    int a;
    private int b;
    void mDef(){}
    private void mPri(){}
    public void mPub(){}

    //private public default
    public void myMethod(){
        System.out.println(a);
        System.out.println(b);
        mPri();
        mDef();
        mPub();
    }
}

//access modifiers
//public private default protected
