/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class Medicalsoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico medico1 = new Medico("",""); 
        medico1.setNombre("Sneider");
        medico1.setApellido(" Mejia"); 
        medico1.setFecha_de_nacimiento("08/12git status/2001");
        System.out.println(" El medico es " +medico1.getFullname()+ " y su edad es: " +medico1.getEdad());
    }

    
    
}
