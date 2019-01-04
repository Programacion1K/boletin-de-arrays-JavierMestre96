import java.util.Arrays;

public class DireccionIP {

    public static final int LONGITUD_IP=4;
    private int[] direccionIP = new int[LONGITUD_IP];
    private String direccionIPTexto;

    public DireccionIP(String direccionIPTexto){
        this.direccionIPTexto=direccionIPTexto;
    }

    public DireccionIP(int[] direccionIP){
        this.direccionIP=direccionIP;
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
// Método que muestra la información completa de una dirección IP
    public String infoIP(){
        String salida="";
        salida+="Dirección IP: "+toString()+"\n";
        salida+="¿Es dirección de red? "+esDireccionRed(direccionIP)+"\n";
        salida+="Dirección red: "+direccionRed()+"\n";
        salida+="Máscara de red: "+mascaraRed()+"\n";
        salida+="Clase "+claseIP();
        salida+="\n"+esPublica();
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

    // Método que saca la máscara de red de una dirección IP
    private String mascaraRed(){ ;
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

    // Método que saca la dirección de red de una dirección IP
    private String direccionRed(){ ;
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

    // Método para sacar a que clase pertenece una dirección IP
    private char claseIP(){
        if(direccionIP[0]<128){
            return 'A';
        }else if(direccionIP[0]<192){
            return 'B';
        }else if(direccionIP[0]<224){
            return 'C';
        }
        return 'n';
    }

    // Método para comprobar si una dirección IP es una dirección de Red
    private boolean esDireccionRed(int[] direccionIP){
        if(direccionIP[3]==0){
            return true;
        }
        return false;
    }

    // Método para comprobar si una dirección IP es pública o si es privada
    private String esPublica(){
        if(claseIP() == 'A'){
            if(direccionIP[0] < 11){
                return "Es privada.";
            }
        }
        if(claseIP() == 'B'){
            if(direccionIP[0] == 172 && direccionIP[1] > 15 && direccionIP[1]<32){
                return "Es privada";
            }
        }
        if(claseIP() == 'C'){
            if(direccionIP[0]==192 && direccionIP[1]==168){
                return "Es privada";
            }
        }

        return "Es pública";
    }

    //Método que devuelva un array con n direcciones IP todas en la misma red (que se le pasa como argumento). N puede ser muy grande.
    public static String[] DireccionesIPEnMismaRed(DireccionIP direccionIPInicial, int numeroEquipos){
        String[] direccionesIPEnMismaRed=new String[numeroEquipos];
        for(int i=0; i<numeroEquipos;i++){
            String direccionIP=direccionIPInicial.toString();
            int numeroEquipo=Integer.parseInt(direccionIP.substring(direccionIP.length()-2))+i;
            direccionIP=direccionIP.substring(0,direccionIP.length()-2);
            direccionesIPEnMismaRed[i]=direccionIP+numeroEquipo;
        }
        return direccionesIPEnMismaRed;
    }

    @Override
    public String toString(){
        return direccionIP[0]+"."+direccionIP[1]+"."+direccionIP[2]+"."+direccionIP[3];
    }
}

