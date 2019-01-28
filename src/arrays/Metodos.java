/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author mrebelladofernandez
 */
public class Metodos {

    int[] notas = new int[8];
    int[] repetidos = new int[notas.length];//crea un array con el tamaño del array inicial. (notas linea 16)
    int tam = 8;
    int[] numeros = new int[tam];

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));
    }

    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValor();
        }
    }

    public int[] crearArray(int[] lista, int nele) { //nele numero de elemento. sirve para crear un nuevo array dando el nº de elementos y el nombre
        for (int i = 0; i < nele; i++) {
            lista[i] = darValor();
        }
        return lista;
    }

    public void engadir(int[] lista, int posicion, int numEle, int ele) {
        if (numEle < lista.length) {
            for (int i = numEle - 1; i >= posicion - 1; i--) {
                lista[i + 1] = lista[i];

            }
            lista[posicion - 1] = ele;
        }
    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota" + i + " : " + notas[i]);
        }
    }

    public void amosarForEach() {
        System.out.println("amosa con for each");
        for (int elemento : notas) {
            System.out.println(elemento);
        }
    }

    public void buscarElemento() {
        int buscado = darValor();
        int atopado = 0; //bandera
//bandera: encontramos o no encontramos algo.
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscado) {
                System.out.println("posicion" + i + " : " + notas[i]);
                atopado = 1;
                i = notas.length; //es como un break,pero poniendo que 'i' es igual al ultimo.
            }
        }
        if (atopado == 0) {
            System.out.println("Non se encontrou");
        }
    }

    public void buscarElementoRepetido() {
        int j = 0;
        int buscado = darValor();

        for (int i = 0; i < notas.length; i++) { //se guarda la posicion
            if (notas[i] == buscado) {
                repetidos[j] = i + 1;
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Non se encontrou");
        } else if (j == 1) {
            System.out.println("Encontrouse unha vez");
        } else {
            for (int i = 0; i < j; i++) {
                System.out.println("se encuentra en:" + repetidos[i]);
            }
        }
    }

    public void ordenarDirecto() {
        int aux = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
    }

    public void ordenarSort() {
        Arrays.sort(notas);
    }

    public void borar() {
        int eleBorar = 0;
        int eleBorrar = darValor();
        for (int i = 0; i < notas.length; i++) {
            if (eleBorar == notas[i]) {
                notas[i] = notas[i + 1];
            }
        }

        tam--;
    }

}
