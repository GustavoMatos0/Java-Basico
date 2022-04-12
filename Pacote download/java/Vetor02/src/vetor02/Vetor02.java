/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner in = new Scanner(System.in);
        System.out.println("Qual ano estamos?");
        int ano = in.nextInt();
        if(ano%4==0){              //conferir se o é ano bissexto
            tot[1] = 29;
        }
       for(int c=0; c<mes.length; c++){
           System.out.println("O mês de "+ mes[c]+" tem o total de "+tot[c]+" dias.");
       }
        
    }
    
}
