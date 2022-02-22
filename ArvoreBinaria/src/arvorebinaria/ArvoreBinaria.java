/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author inventione
 */
public class ArvoreBinaria {
    
    No raiz;
    
    public ArvoreBinaria(int valor){
        raiz = new No(valor);
    }
    
    //Retorna Raiz
    public No getArvoreBinaria(){
        return raiz;
    }
    
    //Metodo Recursivo(add No)
    // Quando o valor é menor maior que a Raiz ele é inserido ao lado direito
    // caso seja menor que a Raiz, será inserido ao lado esquerdo. 
    public void adicionarNo(No novoNo, No raiz){
        if(novoNo.valor > raiz.valor){
            if(raiz.direito != null){
                adicionarNo(novoNo, raiz.direito);
            }else raiz.direito = novoNo;
        }else{
            if(raiz.esquerdo != null){
                adicionarNo(novoNo, raiz.esquerdo);
            }else raiz.esquerdo = novoNo;
        }
    }
    
    public void imprimirEmOrdem(No raiz){
        if(raiz == null){
               return;
        }
        imprimirEmOrdem(raiz.esquerdo);
        System.out.print(raiz.valor + "\t");
        imprimirEmOrdem(raiz.direito);
    }
}
