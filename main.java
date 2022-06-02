package pk01;

public class main {
    public static void main(String[] args) {
        CuadroLatino cl = new CuadroLatino(5);
        cl.printSquare();
        System.out.println("_____________");
        cl.rotateSquareLatin();
        cl.printSquare();
    }
}
