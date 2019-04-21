/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackiteracion4;
import java.util.*;
/**
 *
 * @author Victor Oyervides
 */
public class Jugador {
    Vector cartasJugador;
    //Consstructor Default
    public Jugador(){
        this.cartasJugador= new Vector();
    }
    //Declaracion de los metodos de la clase
    //metodo que calcula si el player dio BUST!!
    boolean hasPlayerBust(){
        //Declaracion de variables
        int cont=0;
        //CIclo for para contar el valor de todas las cartas
        for(int i=0; i<cartasJugador.size(); i++){
            cont+=((Carta)cartasJugador.get(i)).getCardValue();
        }
        //condicion para ver si pasamos 21
        if(cont > 21){
            return true;
        }
        else{
            return false;
        }
    }
    //Funcion para agregar una carta al jugador
    void addCardToPlayer(Carta nuevaCarta){
        cartasJugador.add(nuevaCarta);
    }
    //metodo para desplegar las cartas del jugador
    void showPlayerCards(){
        //Ciclo for para recorrer todas las cartas
        for(int i=0; i<cartasJugador.size(); i++){
            System.out.println("********************");
            ((Carta)cartasJugador.get(i)).displayCard();
            System.out.println("********************");
        }
    }
    //metodo que regresa el valor de todas las cartas
    int getPlayerScore(){
        //Declaracion de variables
        int score=0;
        //ciclo for para recorrer todas las cartas
        for(int i=0; i<cartasJugador.size();i++){
            score+=((Carta)cartasJugador.get(i)).getCardValue();
        }
        //regresar score
        return score;
    }
}
