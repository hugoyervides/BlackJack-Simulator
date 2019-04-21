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
public class Maso {
    //Declaracion de atributos de la clase
    Stack cartas;
    //Declarar constructor default
    public Maso(){
        cartas=new Stack();
    }
    //Declaracion de los metodos del maso
    //metodo para sacar una carta del maso
    Carta getCarta(){
        return (Carta)cartas.pop();
    }
    //Regresa si nuestra baraja esta vacia
    boolean isBarajaEmpty(){
        return (boolean) cartas.empty();
    }
    //Metodo para vaciar el maso desplegando cartas restantes
    void showCards(){
        //Ciclo while mientras no este vacio el stack
        while(!this.cartas.empty()){
            Carta cartaCache= (Carta)cartas.pop();
            cartaCache.displayCard();
        }
    }
    //Metodo para generar un maso random
    void genRandomMaso(){
        //Declaracion de los tipos de cartas
        String nombreCartas[] = {"As","02","03","04","05","06","07","08","09","10"};
        String tipoCarta[] = {"Espadas","Corazones","Rombos","Treboles"};
        String nombreCartasEspeciales[] = {"Jota","Reina","Rey"};
        //Ciclo for para meter las cartas en el stack
        for(int i=0; i < nombreCartas.length; i++){
            //ciclo for para meter los cuatro tipos de caras
            for(int j=0; j<tipoCarta.length; j++){
                Carta newCarta = new Carta(i+1,tipoCarta[j],nombreCartas[i]);
                this.cartas.push(newCarta);
            }
        }
        //meter las ultimos 3 tipos de cartas
        for(int i=0; i < nombreCartasEspeciales.length; i++){
            //Segundo ciclo for para meter una de cada tipo
            for(int j=0; j<tipoCarta.length; j++){
                Carta newCarta = new Carta(11,tipoCarta[j],nombreCartasEspeciales[i]);
                this.cartas.push(newCarta);
            }
        }
        //random
        Collections.shuffle(cartas);
    }
}