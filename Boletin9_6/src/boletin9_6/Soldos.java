package boletin9_6;
//Yasmin

import java.util.Scanner;

public class Soldos {
    int traballadorMaisSoldo,traballadorMenosSoldo, soldo;
    public void soldoTraballador(){
        Scanner mayorSoldo=new Scanner(System.in);
        System.out.println("Introduce soldo: ");
       do{
           soldo=mayorSoldo.nextInt();
           if(soldo>=1000&&soldo<=1750){
               traballadorMaisSoldo=traballadorMaisSoldo+1;
           }
           else{
               traballadorMenosSoldo=traballadorMenosSoldo+1;
           }
       }while(soldo!=0);
       System.out.println("A cantidade de empregados que ganan entre 1000 e 1750€ é: " +traballadorMaisSoldo);
       System.out.println("A porcentaxe de empregados que ganan menos de 1000€ é: " 
       +((traballadorMenosSoldo*100)/(traballadorMenosSoldo+traballadorMaisSoldo))+" %");
   
    }
    }

