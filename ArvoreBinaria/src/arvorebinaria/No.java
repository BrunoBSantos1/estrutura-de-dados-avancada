/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author inventione
 */
public class No {
    
    public int valor;
    public No direito;
    public No esquerdo;
    
    //Construtor
    public No(int valor){
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }
    
    public No(int valor, No esquerdo, No direito){
        this.valor = valor;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }   
}
