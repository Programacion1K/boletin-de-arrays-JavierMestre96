import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("Hola, Mundo");
        DireccionIP ip1;
        ip1 = new DireccionIP(192,168,3,20);
        DireccionIP ip2 = new DireccionIP(192,168,3,5);
        System.out.println(Arrays.toString(DireccionIP.DireccionesIPEnMismaRed(ip1,15)));

        //System.out.println(ip1.toString());
        //System.out.println(ip1.infoIP());

    }
}
