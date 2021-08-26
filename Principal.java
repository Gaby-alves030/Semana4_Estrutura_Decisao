import java.util.Scanner;
public class Principal{

    public static void main(String [] args){
    
     ExerFor1 e1= new ExerFor1();
     ExerFor2 e2= new ExerFor2();
     ExerFor3 e3= new ExerFor3();
     ExerFor4 e4= new ExerFor4();
     ExerFor5 e5= new ExerFor5();
     int opcao;
     System.out.println("Digite 1 para imprimir");
     System.out.println("Digite a soma");
     System.out.println("Digite os multiolos");
     System.out.println("Digite o fatorial");
     System.out.println("Digite par_impar");
     e1.imprimir();
     e2.soma();
     e3.multiplo();
     e4.fatorial();
     e5.par_impar();

 }
}