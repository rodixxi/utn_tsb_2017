/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class Matrices {
    public static void main(String[] args) {
        
        int[] v = {1,2, 3, 4};
        for(int x: v) {
            System.out.println(x);
        }
         
        int[][] m = {{1}, {1, 2}, {1,2 ,3} };
        
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }    
        
        
        
        
    }
}
