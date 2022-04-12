/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um Programa que converta metros para centímetros.
        /*Scanner in = new Scanner( System.in );
        System.out.print("Metros:");
        float met = in.nextFloat();
        float cen = 100 * met;
        System.out.println("Centimetros:" + cen);*/
        
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
       /* Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do Raio:");
        double raio = ler.nextDouble();
        double area = Math.PI * raio * raio;
        String format = String.format("%.2f", area);
        System.out.println("A area do circulo é: "+format);*/
       
       //Faça um Programa que calcule e mostre a área de um quadrado.
       /*Scanner in = new Scanner(System.in);
        System.out.print("Informe a largura do quadrado: ");
        float lar = in.nextFloat();
        System.out.print("Informe a altura do quadrado: ");
        float alt = in.nextFloat();
        float area = lar * alt;
        String format = String.format("%.2f", area);
        System.out.println("A area do quadrado é: " + format);
        */
       
       //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
      
       /*Scanner in = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        float hora = in.nextFloat();
        System.out.println("Quantas horas você trabalha no mês? ");
        float mes = in.nextFloat();
        float salario = hora * mes;
        String form = String.format("%.2f", salario);
        System.out.println("O seu salario no mês é: " + form);
        */
       
       //Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
       /*Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fº");
        int f = in.nextInt();
        float c =  (5 * (f - 32) / 9);  //C = (5 * (F-32) / 9)
        int cr = Math.round(c);
        System.out.println("A temperatura em Cº: " + cr);
        */
       
       
       /*10.Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
     /*  Scanner in = new Scanner(System.in);
        System.out.print("Informe DOIS números inteiros: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.print("Informe UM número real: ");
        double n3 = in.nextFloat();
        float pr = (n1*2) * (n2 / 2);
        System.out.print("Letra A: " );
        System.out.println(String.format("%.2f", pr));
        double b = (n1*3) + n3;
        System.out.print("Letra B: ");
        System.out.println(String.format("%.2f", b));
        double c = Math.pow(n3, 3);
        System.out.print("Letra C: ");
        System.out.println(String.format("%.2f", c));
        */
     
    //11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
    /*
       Scanner in = new Scanner(System.in);
        System.out.print("Informe a sua altura: ");
        float alt = in.nextFloat();
        double pi = (72.7*alt) - 58;
        System.out.print("Seu peso ideal é: ");
        System.out.println(String.format("%.1f",pi));
        */
    
    /*13.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na
variável excesso e na variável multa o valor da multa que João deverá pagar. Caso
contrário mostrar tais variáveis com o conteúdo ZERO OU NEGATIVO.


     Scanner in = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        int peso = in.nextInt();
        int ex;
        float val;
        String exs = "ZERO";
        String vals ="ZERO";
        if (peso>50){
            ex = peso - 50;
            val = ex * 4;
            System.out.println("A quantidade de peso execida é:" + ex);
            System.out.print("O valor da multa é: ");
            System.out.print(String.format("%.2f",val));
            System.out.println("R$");
        }
        else{
            System.out.println("O peso excedido é: "+exs);
            System.out.println("O valor da multa é: "+vals);
        }
          */
    
    /*14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
f. + Salário Bruto : R$
g. - IR (11%) : R$
h. - INSS (8%) : R$
i. - Sindicato ( 5%) : R$
j. = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/
    
    Scanner in = new Scanner(System.in);
     System.out.print("Quanto você ganha por hora? ");
     float hora = in.nextFloat();
     System.out.println("Quantas horas você trabalha no mês? ");
     float nmes = in.nextFloat();
     float salb = hora*nmes;
     double ir = 0.11*salb;
     double inss = 0.08*salb;
     double sind = 0.05*salb;
     double sall = salb - ir - inss - sind;
     String formsalb = String.format("%.2f", salb);
     String formir = String.format("%.2f",ir);
     String forminss = String.format("%.2f", inss);
     String formsind = String.format("%.2f", sind);
     String formsall = String.format("%.2f", sall);
     System.out.println("Salário Bruto: "+ formsalb +"R$");
     System.out.println("IR: "+formir+"R$");
     System.out.println("INSS: "+forminss+"R$");
     System.out.println("Sindicato: "+formsind+"R$");
     System.out.println("Sálario Liquido: "+formsall+"R$");
     
     
    
    }
    
}
