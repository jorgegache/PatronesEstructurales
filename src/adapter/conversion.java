/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author Yirlany
 */
public class conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese el tipo de moneda que desea convertir a dolar");
        System.out.println("1-Euros");
        System.out.println("2-Colones");
        leer.nextInt();
        
        switch (leer.nextInt()){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("la opcion no es valida");
                break;
        }
    }
    
}
