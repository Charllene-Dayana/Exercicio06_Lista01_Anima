import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio;
        double pi = 3.14;
        double area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("qual o raio do circulo");
        raio = teclado.nextDouble();
        area = raio * pi;

        System.out.println("área é " + area);
        teclado.close();
    }
}
