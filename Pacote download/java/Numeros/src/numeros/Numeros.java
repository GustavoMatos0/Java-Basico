/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int n,s=0;
        String resp;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = in.nextInt();
            s += n;
            System.out.println("Quer continuar? [s/n]");
            resp = in.next();
        } while(resp.equals("s"));
        System.out.println("A soma dos números é igual a: " + s);
    }
    
}
