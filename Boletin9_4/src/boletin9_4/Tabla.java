package boletin9_4;
//Yasmin

import javax.swing.JOptionPane;

public class Tabla {
    int numero;
    int i=1;
   public void pedirNumero(){
   numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
   for(i=1;i<=10;i++){
       JOptionPane.showMessageDialog(null,"Tabla: "+numero+"*"+i+"="+(numero*i));
       if(numero!=0){
       }
   }
       
   }
}
   

