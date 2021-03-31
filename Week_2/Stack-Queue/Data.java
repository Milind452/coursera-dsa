public class Data {
    String s;
    int x;

    Data(String s, int x) {
        this.s = s;
        this.x = x;
    }

    public void display() {
        System.out.println("***************************");
        System.out.println("String: " + s);
        System.out.println("Int: " + x);
        System.out.println("***************************");
    }
}
