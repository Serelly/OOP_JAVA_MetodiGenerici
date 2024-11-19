//esercizio 2
//METODO GENERICO LIMITATO

public class ComparableExample {
    /**
     * metodo generico limitato chiamato getMaxElement che estende l'INTERFACCIA Comparable
     * per ottenere il maggiore tra due elementi comparabili
     * @param a
     * @param b
     * @return
     * @param <T>
     */
    public static  <T extends Comparable<T> > T getMaxElement(T a, T b ){
        return a.compareTo(b) >= 0 ? a : b;
    }   //significato del return: " se a>=0 è verificata resituisco a, altrimenti restituisco b

    /**
     * metodo main
     * @param args
     */
    public static void main(String[] args) {
        //il maggiore tra due Integer
        Integer maxInt = getMaxElement(20, 5);
        System.out.println("il maggiore tra 20 e 5 è: " + maxInt);

        //il maggiore tra due String
        String maxString = getMaxElement("Apple", "banana");
        System.out.println("il maggiore tra Apple e banana è: " + maxString);

        //il maggiore tra due Double
        Double maxDouble = getMaxElement(2.0, 4.5);
        System.out.println("il maggiore tra 2.0 e 4.5 è: " + maxDouble);

    }
}
