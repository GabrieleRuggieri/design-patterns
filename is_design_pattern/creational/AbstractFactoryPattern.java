package creational;

public class AbstractFactoryPattern {

    /**
     * ABSTRACT FACTORY
     * Scopo: Fornire un'interfaccia per creare famiglie di oggetti correlati o dipendenti senza specificare le loro classi concrete.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando il sistema deve essere indipendente da come i suoi prodotti vengono creati
     * Quando il sistema deve essere configurato con una famiglia di prodotti
     * Quando si vuole fornire una libreria di prodotti e si vogliono rivelare solo le loro interfacce, non le implementazioni
     */
}

interface ProductA {
    void operationA();
}

interface ProductB {
    void operationB();
}

class ConcreteProductA1 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("Product A1");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("Product A2");
    }
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("Product B1");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("Product B2");
    }
}

interface AbstractFactory {
    ProductA createProductA();

    ProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

