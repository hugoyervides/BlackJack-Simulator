/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackiteracion4;
import java.util.Scanner;
/**
 *
 * @author Victor Oyervides
 */
public class BlackJackIteracion4 {

    /**
     * @param args the command line arguments
     */
    static void desplegarMensaje(){
        System.out.println("Que deseas hacer jugador?\n"
                + "1- Deal\n"
                + "2- Stand\n");
    }
    public static void main(String[] args) {
        //Declaracion de variables
        boolean continuar=true;
        Scanner miScannerHermoso = new Scanner(System.in);
        int opcion;
        //Crear un maso con cartas nuevas
        Maso newMaso = new Maso();
        newMaso.genRandomMaso();
        //Crear los jugadores
        Jugador jugador = new Jugador();
        Dealer dealer = new Dealer();
        //Dar las cartas iniciales a ambos jugadores
        System.out.println("Asignando cartas a jugadores");
        for(int i=0; i<2 ;i++){
            jugador.addCardToPlayer(newMaso.getCarta());
            dealer.addCardToDealer(newMaso.getCarta());
        }
        //Ciclo while para seguir el juego mientras ninguno de los jugadores de bust
        while(continuar){
            //Desplegar las cartas de los jugadores
            System.out.println("----------------------------");
            System.out.println("Cartas dealer: ");
            dealer.showDealerCards();
            System.out.println("----------------------------");
            System.out.println("Cartas Jugador: ");
            jugador.showPlayerCards();
            System.out.println("----------------------------");
            //Preguntar al jugador que desea hacer
            desplegarMensaje();
            //capturar la opciones para el jugador
            opcion=miScannerHermoso.nextInt();
            //logica
            if(opcion==1){
                //agregar una carta mas al jugador
                jugador.addCardToPlayer(newMaso.getCarta());
                //desplegar cartas jugador
                System.out.println("----------------------------");
                System.out.println("Nuevas cartas jugador");
                jugador.showPlayerCards();
                System.out.println("----------------------------");
                //logica para ver si no dio bust
                if(jugador.hasPlayerBust()){
                    continuar=false;
                    System.out.println("Jugador pierde por Bust");
                }
            }
            else{
                //Salir del juego
                continuar = false;
            }
        }
        //Turno del dealer
        //ciclo for mientras el jugador tenga mas que el delaer y no de bust seguir
        if(!jugador.hasPlayerBust()){
            while((dealer.getDealerScore()<jugador.getPlayerScore())&&!dealer.hasDelaerBust()){
                dealer.addCardToDealer(newMaso.getCarta());
                System.out.println("----------------------------");
                System.out.println("Nuevas cartas Dealer");
                dealer.showDealerCards();
                System.out.println("----------------------------");
            }
        }
        //logica para ver ganador
        if(dealer.getDealerScore()>jugador.getPlayerScore()||jugador.hasPlayerBust()){
            System.out.println("GANA DEALER!");
        }
        else{
            System.out.println("GANA JUGADOR!");
        }
    }
    
}
