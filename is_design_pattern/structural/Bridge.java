package structural;

public class Bridge {

    /**
     * BRIDGE
     * Scopo: Disaccoppiare un'astrazione dalla sua implementazione così che le due possano variare indipendentemente.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando si vuole evitare un legame permanente tra un'astrazione e la sua implementazione
     * Quando sia l'astrazione che l'implementazione devono essere estese mediante sottoclassi
     * Quando le modifiche nell'implementazione non devono avere impatto sul codice client
     */

}

interface Implementor {
    void operationImpl();
}

class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor A");
    }
}

class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor B");
    }
}

abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operationImpl();
    }
}

