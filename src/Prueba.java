import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("Hola, Mundo");
        DireccionIP ip1;
        ip1 = new DireccionIP(10,50,30,20);
        DireccionIP ip2;
        ip2 = new DireccionIP(10,165,3,5);
        DireccionIP ip3 = new DireccionIP("171.168.6.3");

        //System.out.println(ip3.toString());
        System.out.println(ip3.infoIP());
        //System.out.println(Arrays.toString(DireccionIP.DireccionesIPEnMismaRed(ip2,10)));
        System.out.println(DireccionIP.estanEnLaMismaRed(ip1, ip2));

    }
}
