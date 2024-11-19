package esercizio3;
//esercizio 3

public class WildcardCopyExample {

    /**
     * metodo che copia il valore da src a dest usando le wildcard
     * @param dest
     * @param src
     * @param <T>
     */
    public static <T> void copy(Container< ? super T > dest, Container <?extends T > src){
        dest.setValue(src.getValue()); //copia

    }

    public static void main(String[] args) {
        //creazione di un Container di tipo base
        Container<Number> numberContainer = new Container<>(123);

        //crezione di un Container di un tipo derivato
        Container<Integer> integerContainer = new Container<>(456);

        //copia del valore da integerContainer (src) a numberContainer (dest) richiamando il metodo copy
        copy(numberContainer, integerContainer); // OK: Number > Integer


        //stampa del valore nel container di tipo base dopo la copia
        System.out.println("valore copiato in numberContainer:" + numberContainer.getValue());
        //output 456
    }

}
