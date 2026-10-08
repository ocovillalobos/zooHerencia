/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author Andres
 */
public class ZooHerencia {

    public static void main(String[] args) {
        Animal perro = new Doberman("Fido");
        Mamifero gato = new Persa("Luna");
        
        Animal pato = new Ave("Lucas");
        Pekin otroPato = new Pekin("Donald");
        Ave tercerPato = new Pato("Rico McPato");
        
        Animal otroPerro = new Chihuahua("Pinto");
        Mamifero otroGato = new Gato("Mizku");
        
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(otroPerro.hacerSonido());
        System.out.println(otroGato.hacerSonido());
        
        System.out.println("'''''LOS PATOS'''''");
        System.out.println(pato.hacerSonido());
        System.out.println(otroPato.hacerSonido());
        System.out.println(tercerPato.hacerSonido());
        
    }
}
