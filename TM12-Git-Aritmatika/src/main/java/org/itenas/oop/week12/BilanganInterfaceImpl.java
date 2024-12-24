/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.week12;

/**
 *
 * @author aryan
 */
public class BilanganInterfaceImpl implements BilanganInterface {

    @Override
    public double add(Bilangan bilangan) {
        return bilangan.getBilangan1() + bilangan.getBilangan2();
    }

    @Override
    public double sub(Bilangan bilangan) {
         return bilangan.getBilangan1() - bilangan.getBilangan2();
    }

    @Override
    public double mult(Bilangan bilangan) {
        return bilangan.getBilangan1() * bilangan.getBilangan2();
    }

    @Override
    public double div(Bilangan bilangan) {
        return bilangan.getBilangan1() / bilangan.getBilangan2();
    }
}
