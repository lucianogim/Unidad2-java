/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;
import java.util.Scanner;

/**
 *
 * @author Wonka
 */
public class Unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Usuario user = new Usuario();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema:");
        System.out.println();

        System.out.println("Ingrese su nombre:");
        user.setNombre( teclado.nextLine() );

        System.out.println("Ingrese su apellido:");
        user.setApellido( teclado.nextLine());

        System.out.println("Ingrese edad:");
        user.setEdad( teclado.nextInt());

        teclado.nextLine();

        System.out.println("Ingrese Hobby:");
        user.setHobby( teclado.nextLine());

        System.out.println("Ingrese su editor de codigo:");
        user.setEditorCod( teclado.nextLine());

        System.out.println("Ingrese sistema operativo:");
        user.setSistemOp( teclado.nextLine());


        System.out.println("\n \n \n \n ");

        System.out.println( user.toString() );

    }
    
}
