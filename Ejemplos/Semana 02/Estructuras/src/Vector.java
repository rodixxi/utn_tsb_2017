/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
class Vector {
    
    private int[] v;
    private int size;
    
    public Vector() {
        v = new int[100];
        size = 0;
    }
    
    
        
    void append(int x) {
        v[size] = x;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < size; i++) {
            //if (i!=0) 
                res.append(", ");
            res.append(v[i]);
        }
        res.append("]");
        return res.toString();
    }
    
    
}
