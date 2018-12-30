import java.util.Arrays;

public class DireccionIP {

    public static final int LONGITUD_IP=4;
    private final int[] direccionIP = new int[LONGITUD_IP];
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

    public String categoriaIP(int[] direccionIP){
        if(direccionIP[0]<128){
            return "La clase de "+toString()+" es A";
        }else if(direccionIP[0]<192){
            return "La clase de "+toString()+" es B";
        }else if(direccionIP[0]<224){
            return "La clase de "+toString()+" es C";
        }
        return "";
    }

    public String toString(int[] direccionIP){
        return Arrays.toString(direccionIP);
    }
}

