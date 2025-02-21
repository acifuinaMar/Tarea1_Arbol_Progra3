/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;

import java.util.Scanner;

/**
 *
 * @author maryori
 */
public class BinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner entrada = new Scanner(System.in);
        
        int option;
        do {
            System.out.println("\nMenú del Árbol Binario:");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Mostrar recorrido InOrden");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el valor a insertar: ");
                    int value = entrada.nextInt();
                    tree.insert(value);
                break;
                
                case 2:
                    tree.showInOrder();
                break;
                
                case 3:
                    System.out.println("Saliendo...");
                break;
                
                default:
                System.out.println("Opción no válida.");
                break;
            }
        } while (option != 3);
    }
    
}
