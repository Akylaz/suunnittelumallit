/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teht01FactoryMethod;

/**
 *
 * @author Nowak
 */
public class Henkilö extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Mehu();
    }
    
}
