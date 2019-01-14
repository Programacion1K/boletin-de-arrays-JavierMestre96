import javax.swing.*;
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        //System.out.println("Hola, Mundo");
        DireccionIP ip1 = new DireccionIP(10,50,30,20);
        DireccionIP ip2 = new DireccionIP(10,30,3,90);
        DireccionIP ip3 = new DireccionIP("192.168.6.0");
        DireccionIP[] conjuntoIPs={
                new DireccionIP("192.168.3.3"),
                new DireccionIP("192.168.3.4"),
                new DireccionIP("192.168.3.2")
        };

        //System.out.println(ip3.toString());
        System.out.println(ip3.infoIP());
//        System.out.println(DireccionIP.todasLasIPSMismaRed(conjuntoIPs));
//        System.out.println(Arrays.toString(DireccionIP.DireccionesIPEnMismaRed(ip2,20)));
//        System.out.println(DireccionIP.estanEnLaMismaRed(ip1, ip2));
    }
}
