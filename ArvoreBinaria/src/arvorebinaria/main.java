/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvorebinaria;

/**
 *
 * @author inventione
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(50);
        arvore.adicionarNo(new No(30), arvore.getArvoreBinaria());
        arvore.adicionarNo(new No(40), arvore.getArvoreBinaria());
        arvore.adicionarNo(new No(350), arvore.getArvoreBinaria());
        arvore.adicionarNo(new No(20), arvore.getArvoreBinaria());
        arvore.adicionarNo(new No(90), arvore.getArvoreBinaria());
        
        arvore.imprimirEmOrdem(arvore.getArvoreBinaria());
    }
    
}
