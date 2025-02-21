/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

import java.util.Scanner;

/**
 *
 * @author maryori
 */
public class Tree {
    private Node root;
    //Constructor
    public Tree(){
        this.root = null;
    }
    //Getter
    public Node getRoot(){
        return root;
    }
    //Method to insert data into the tree and choose the side
    public void insert(int data){
        Scanner entrada = new Scanner(System.in);
        Node node = new Node(data);
        if(root == null){
            root = node;
            System.out.println("El elemento: " + data + " ha sido agregado como raiz.");
            return;
        }
        /*
        The aux node will serve to move throught the whole tree and valuate if
        is possible to add or not a son in an specific side
        */
        Node aux = root;
        while(true){
            String option = "";
            System.out.println("Valor del nodo: " + aux.getData());
            System.out.println("Insertar dato a la derecha (D) o izquierda (I)?");
            option = entrada.nextLine().toUpperCase();
            
            switch(option){
                case "I":
                if (aux.getLeft() == null) {
                    aux.setLeft(node);
                    System.out.println("El valor: " + data + " ha sido insertado a la izquierda de: " + aux.getData());
                    return; // Successfully inserted, break the loop
                } else {
                    aux = aux.getLeft(); // Move to the left child
                }
                break;

                case "D":
                    if (aux.getRight() == null) {
                        aux.setRight(node);
                        System.out.println("El valor: " + data + " ha sido insertado a la derecha de: " + aux.getData());
                        return; // Successfully inserted, break the loop
                    } else {
                        aux = aux.getRight(); // Move to the right child
                    }
                break; 
                
                default:
                    System.out.println("Opcion invalida. Ingrese I o D");
                break;
            }
        }
    }
    //Method to travel through the tree inOrder L-R-R
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }
    //Method to print the travel inOrder
    public void showInOrder(){
        System.out.println("Recorrido del arbol Inorden");
        inOrder(root);
        System.out.println();
    }
}
