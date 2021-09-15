package source;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import source.Produto;

/**
 *
 * @author raiss
 */
public class AppCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 System.out.println("oi");
        Produto arroz = new Produto("Arroz", 1, 5.50);
        System.out.println(arroz.toString());
    }

}
