
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class VectorMain {
    
    public static void main(String[] args) {
        
        Vector x = new Vector();
        x.append(1);
        x.append(2);
        String res = x.toString();
        if (res.compareTo("[1, 2]") != 0) 
            System.out.println("ERRORR!!!");
        

        
        
        
        
    }
    
}
