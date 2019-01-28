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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        obx.crearArray();
        obx.amosar();
        obx.amosarForEach();
        obx.buscarElemento();
        obx.buscarElementoRepetido();
        int[] lista = null;
//        obx.ordenarDirecto();
//        obx.amosar();
//        obx.ordenarSort();
//        int tam = obx.darValor();
        //   obx.crearArray(numeros,);
        int[] crearArray = obx.crearArray(lista, 0);
    }

    static void sort(int[] notas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
