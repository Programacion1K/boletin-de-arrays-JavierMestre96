import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class ProgramaInterativoIPs {
    public static void main(String[] args){
        Object[] botones={"Cadena normal","Cuatro Bytes","Salir"};
        ImageIcon icono = new ImageIcon("IP.jpg");
        int opcionSalida=0;
        do{
            int botonElegido = JOptionPane.showOptionDialog(null,"Elija un método para introducir la dirección IP",
                    "Introducir IP",
                    JOptionPane.YES_OPTION,
                    JOptionPane.QUESTION_MESSAGE,icono,
                    botones,
                    botones[2]);
            DireccionIP ip;
            if(botonElegido==0){
                String direccionIPTexto=JOptionPane.showInputDialog(null,
                        "Introduce una IP separada por puntos:",
                        "Entrada",
                        JOptionPane.QUESTION_MESSAGE);
                ip=new DireccionIP(direccionIPTexto);
                JOptionPane.showMessageDialog(null,ip.infoIP(),
                        "Información IP",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (botonElegido==1){
                int[] octetos = new int[4];
                for(int i=0;i<octetos.length;i++){
                    octetos[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el byte:"+(i+1)));
                }
                ip=new DireccionIP(octetos[0],octetos[1],octetos[2],octetos[3]);
                JOptionPane.showMessageDialog(null,
                        ip.infoIP(),
                        "Información IP",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if(botonElegido==2){
                Object[] salida={"Si","No"};
                opcionSalida = JOptionPane.showOptionDialog(null,"¿Desea salir?",
                        "Salida",
                        JOptionPane.YES_OPTION,
                        JOptionPane.QUESTION_MESSAGE,icono,
                        salida,
                        salida[0]);
            }
        }while(opcionSalida!=0);
    }

}