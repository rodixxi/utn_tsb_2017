/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class Arreglos {
    
    public static void main(String[] args) {
        
        int[] v = new int[10];
        for(int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * 100);
        }
        
        int[] aux = new int[20];
        System.arraycopy(v, 0, aux, 0, 10);
        v = aux;
        
        for(int x: v) {
            System.out.println(x);
        }

    }
    
}
