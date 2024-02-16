public class Triangle {

    private  int a;
    private  int b;
    private  int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public   int area(){

        int i = a + b + c * 3;
        return (int) Math.sqrt(i);
    }
}
