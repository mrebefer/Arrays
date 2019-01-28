/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author mrebelladofernandez
 */
public class ExemploArrays {

    public static void main(String[] args) {
        Metodos obx = new Metodos();
        int tam = obx.darValor();
        int[] numeros = new int[tam];
        numeros = obx.crearArray(numeros, tam);
        int[]enteiros=new int[6];
        enteiros=obx.crearArray(enteiros, tam);
    }
}
