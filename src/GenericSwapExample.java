//esercizio 1
//METODO GENERICO PER SCAMBIARE ELEMENTI IN UN ARRAY

import java.util.Arrays;    //per fare la stampa con Arrays.toString()

public class GenericSwapExample {

    /**
     * metodo generico per scambiare due elementi in un array
     * @param array
     * @param i
     * @param j
     * @param <T>
     */
    public static <T> void swapElements(T[] array, int i, int j){
        //faccio un controllo della validità degli indici
        if(i>= 0 && i< array.length && j>= 0 && j< array.length){
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }else {
            System.out.println("Indici non validi per l'array");
        }

    }
    //nota: sto usando una variabile temporale per effettuare lo scambio
    //uso metodo static per non dover istanziare un oggetto della classe per usare quel metodo nel main

    //T rappresenta un tipo generico che verrà specificato al momento dell'uso


    /**
     * metodo main che dimostra il funzionamento del metodo swapElements
     * @param args
     */
    public static void main (String [] args){
        //esempio con un array di Integer
        Integer[] array = {1,2,3,4,5};
        System.out.println("Array Integer prima dello swap: " + Arrays.toString(array));
        swapElements(array, 0, 1);  //scambio elemento in posizione 0 con quello in posizione 1
        //stampo
        System.out.println("Array Integer dopo lo swap "+ Arrays.toString(array));

        System.out.println(); //vado a capo per ordine

        //esempio con array di String
        String[] array2 = {"ciao", "pelle", "bello"};
        System.out.println("Array String prima dello swap: " + Arrays.toString(array2));
        swapElements(array2, 0, 2);
        System.out.println("Dopo swap: " + Arrays.toString(array2));

        System.out.println(); //vado a capo per ordine

        //esempio con array di Double
        Double[] array3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Array Double prima dello swap: " + Arrays.toString(array3));
        swapElements(array3, 0, 3);
        System.out.println("Dopo lo swap" + Arrays.toString(array3));



    }

}


