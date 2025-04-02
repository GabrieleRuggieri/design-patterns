package creational;

public class FactoryMethodPattern {

    /**
     * FACTORY METHOD
     * Scopo: Definire un'interfaccia per la creazione di un oggetto, ma lasciare alle sottoclassi di decidere quale classe istanziare.
     * Quando usarlo:
     * <p>
     * Quando una classe non può prevedere la classe di oggetti che deve creare
     * Quando una classe vuole che le sue sottoclassi specifichino gli oggetti che crea
     * Per delegare la responsabilità della creazione a una delle diverse classi helper
     */

}

interface Product {
    void operation();
}

class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductA");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("ConcreteProductB");
    }
}

abstract class Creator {
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.operation();
    }
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
