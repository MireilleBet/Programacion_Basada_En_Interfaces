/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_interfaces;

/**
 *
 * @author Mireille Betancourt
 */
public class CreandoTrabajador {
     
    public static void main(String[] args){
        Herramienta herramienta = new Martillo();
        
        Trabajador trabajador = new Trabajador();
        trabajador.setHerramienta(herramienta);
        
        System.out.println("El nombre de la herramienta del trabajo es "
                + trabajador.getHerramienta().getNombre());
    }
}
