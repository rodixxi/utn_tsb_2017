/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author federico
 */
public class Test {
    public static void main(String[] args) {
        Persona p = null;
        int dni = (p != null) ? p.dni : 0;
        System.out.println("DNI: " + dni);
    }
    

    
}

class Persona{
    int dni;
}