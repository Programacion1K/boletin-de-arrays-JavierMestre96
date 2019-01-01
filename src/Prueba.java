import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("Hola, Mundo");
        DireccionIP ip1;

        ip1 = new DireccionIP(192,168,0,5);
        System.out.println(ip1.infoIP());

    }
}
