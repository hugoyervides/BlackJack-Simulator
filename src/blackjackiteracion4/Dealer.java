/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackiteracion4;

import java.util.Vector;

/**
 *
 * @author Victor Oyervides
 */
public class Dealer {
    //Declaracion de los atributos
    Vector cartasDealer;
    //Constructor default
    public Dealer(){
        cartasDealer = new Vector();
    }
    //Declaracion de los metodos de la clase
    //Metodo para ver si el dealer dio Bust
    boolean hasDelaerBust(){
        //Declaracion de variables
        int cont=0;
        //CIclo for para contar el valor de todas las cartas
        for(int i=0; i<cartasDealer.size(); i++){
            cont+=((Carta)cartasDealer.get(i)).getCardValue();
        }
        //condicion para ver si pasamos 21
        if(cont > 21){
            return true;
        }
        else{
            return false;
        }
    }
    //metodo para agregar carta al delaer
    void addCardToDealer(Carta newCarta){
        cartasDealer.add(newCarta);
    }
    //metodo para desplegar las cartas del delaer
    void showDealerCards(){
        //Ciclo for para recorrer todas las cartas
        for(int i=0; i<cartasDealer.size(); i++){
            System.out.println("********************");
            ((Carta)cartasDealer.get(i)).displayCard();
            System.out.println("********************");
        }
    }
    //metodo que regresa el valor de todas las cartas
    int getDealerScore(){
        //Declaracion de variables
        int score=0;
        //ciclo for para recorrer todas las cartas
        for(int i=0; i<cartasDealer.size();i++){
            score+=((Carta)cartasDealer.get(i)).getCardValue();
        }
        //regresar score
        return score;
    }
}
