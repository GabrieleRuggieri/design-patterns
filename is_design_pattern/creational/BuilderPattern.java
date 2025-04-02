package creational;

public class BuilderPattern {

    /**
     * BUILDER
     * Scopo: Separare la costruzione di un oggetto complesso dalla sua rappresentazione così che lo stesso processo di costruzione possa creare diverse rappresentazioni.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando il processo di creazione deve permettere diverse rappresentazioni dell'oggetto che viene costruito
     * Quando la costruzione dell'oggetto è complessa e richiede molti passaggi
     * Quando si vogliono nascondere i dettagli di costruzione dell'oggetto
     */
}

class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{partA='" + partA + "', partB='" + partB + "', partC='" + partC + "'}";
    }
}

interface Builder {
    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();
}

class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("Part A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Part B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Part C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
