package esercizio3;
//esercizio 3
//COPIA DI OGGETTI TRA CONTENITORI GENERICI CON WILDCARD


//definisco una classe generica Container <T> che possa contenere oggetti di qualsiasi tipo
class Container <T> {
    //attributo
    private T value;

    /**
     * costruttore dove inizializzo l'attributo value
     *
     * @param value
     */
    public Container(T value) {
        this.value = value;
    }
//metodi getter e setter

    /**
     * metodo getter che restituisce il valore
     * @return
     */
    public T getValue() {
        return value;
    }

    /**
     * metodo setter che permette la modifica del valore
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }
}

