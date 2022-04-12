/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeurna;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TesteUrna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.print("Ano de Nascimento:");
        int n = ler.nextInt();
        int i = 2022 - n;
        System.out.println("Idade:" + i);
        if (i<16){
            System.out.println("Não Vota"); 
        } else{ if ((i>=16 && i<18) || ( i>70)){
            System.out.println("Opcional");
        } else {
            System.out.println("Obrigatório");
        }
            
        }
       
    }

    private static void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
