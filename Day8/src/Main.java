class Box {
    int length;
    int width;
    int height;

    { // instance block
        this.length = 12;
        this.width = 5;
        this.height = 3;
        System.out.println("Instance Block...");
    }
    public void printVolume() {
        int volume = length * width * height;
        System.out.println("Volume : " + volume);
    }

    public void setSize(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Main {
    public static void main(String[] args) {
        Box b1= new Box();
        b1.printVolume();
    }
}