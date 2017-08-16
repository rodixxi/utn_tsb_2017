
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author federico
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("1_ suma números 1 a 100");
            System.out.println("2_ Hola mundo");
            System.out.println("3_ Salir");
            
            op = sc.nextInt();
            switch(op) {
                case 1:
                    
                    for (int i = 0; i < 10;i++) {
                        System.out.println(i);    
                    }
                    break;
                case 2:
                    System.out.println("Hola mundo!!");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error!!!");
            }
        }
        while(op != 3);

    }

}
