/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackiteracion4;
import java.util.Random;
/**
 *
 * @author Victor Oyervides
 */
public class Carta {
    //Declaracion atributos
    int rank;
    String suit;
    String nombre;
    //Constructor default
    public Carta(int rank,String suit, String nombre){
        this.rank=rank;
        this.suit=suit;
        this.nombre=nombre;
    }
    //Declaracion metodos
    int getCardValue(){
        return rank;
    }
    //metodo para desplegar la carta
    void displayCard(){
        System.out.println("Valor: " + this.rank + "\n");
        System.out.println("Nombre: " + this.nombre + "\n");
        System.out.println("Suit: " + this.suit + "\n");
    }
}
