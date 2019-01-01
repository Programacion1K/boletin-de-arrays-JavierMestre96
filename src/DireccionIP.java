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

    public String infoIP(){
        String salida="";
        salida+="Dirección IP: "+toString(direccionIP)+"\n";
        salida+="¿Es dirección de red? "+esDireccionRed()+"\n";
        salida+="Dirección red: "+direccionRed()+"\n";
        salida+="Máscara de red: "+mascaraRed()+"\n";
        salida+="Clase "+claseIP();

        salida+="";
        return salida;
    }

    public int[] direccionIPTextoEnArray(){
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

    public String mascaraRed(){ ;
        if(claseIP()=='A'){
            return "255.0.0.0";
        }
        if(claseIP()=='B'){
            return "255.255.0.0";
        }
        if(claseIP()=='C'){
            return "255.255.255.0";
        }
        return "";
    }


    public String direccionRed(){ ;
        if(claseIP()=='A'){
            return direccionIP[0]+".0.0.0";
        }
        if(claseIP()=='B'){
            return direccionIP[0]+"."+direccionIP[1]+".0.0";
        }
        if(claseIP()=='C'){
            return direccionIP[0]+"."+direccionIP[1]+"."+direccionIP[2]+".0";
        }
        return "";
    }

    public char claseIP(){
        if(direccionIP[0]<128){
            return 'A';
        }else if(direccionIP[0]<192){
            return 'B';
        }else if(direccionIP[0]<224){
            return 'C';
        }
        return 'n';
    }

    public boolean esDireccionRed(){
        if(direccionIP[3]==0){
            return true;
        }
        return false;
    }

    public String toString(int[] direccionIP){
        return direccionIP[0]+"."+direccionIP[1]+"."+direccionIP[2]+"."+direccionIP[3];
    }
}

