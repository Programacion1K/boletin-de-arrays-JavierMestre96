import java.util.Arrays;

public class DireccionIP {

    public static final int LONGITUD_IP=4;
    private final int[] direccionIP = new int[LONGITUD_IP];
    private char clase;
    private String direccionIPTexto;


    public DireccionIP(String direccionIPTexto){
        this.direccionIPTexto=direccionIPTexto;
    }

    public DireccionIP(int primerNumeroIP, int segundoNumeroIP, int tercerNumeroIP, int cuartoNumeroIP){
        direccionIP[0]=primerNumeroIP;
        direccionIP[1]=segundoNumeroIP;
        direccionIP[2]=tercerNumeroIP;
        direccionIP[3]=cuartoNumeroIP;
    }



    public String getDireccionIPTexto(){
        return direccionIPTexto;
    }

    private int[] direccionIPTextoEnArray(){
        String numero="";
        int numerosIP;
        int posicionIP=0;
        for(int i=0;i<direccionIPTexto.length();i++){
            if(getDireccionIPTexto().charAt(i)!=',') {
                numero += direccionIPTexto.charAt(i);
            }else{
                numerosIP=Integer.parseInt(numero);
                direccionIP[posicionIP]=numerosIP;
                posicionIP++;
            }
        }
        return direccionIP;
    }
}

