import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("Hola, Mundo");
        DireccionIP ip1;
        ip1 = new DireccionIP(172,50,30,20);
        DireccionIP ip2 = new DireccionIP(192,165,3,5);

        System.out.println(ip1.infoIP());
        System.out.println(Arrays.toString(DireccionIP.DireccionesIPEnMismaRed(ip1,15)));

        //System.out.println(ip1.toString());
        //System.out.println(ip1.infoIP());

    }
}
