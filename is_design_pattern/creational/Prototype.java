package creational;

/**
 * PROTOTYPE
 * Scopo: Specificare i tipi di oggetti da creare usando un'istanza prototipica e creare nuovi oggetti copiando questo prototipo.
 * <p>
 * Quando usarlo:
 * <p>
 * Quando le classi da istanziare sono specificate a runtime
 * Per evitare la costruzione di una gerarchia di factory parallela a una gerarchia di prodotti
 * Quando le istanze di una classe possono avere uno di pochi diversi stati
 */

interface Prototype extends Cloneable {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

