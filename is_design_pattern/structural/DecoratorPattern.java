package structural;

public class DecoratorPattern {

    /**
     * DECORATOR
     * <p>
     * Scopo: Aggiungere responsabilità a un oggetto dinamicamente. I decorator forniscono un'alternativa flessibile alla sottoclasse per estendere la funzionalità.
     * <p>
     * Quando usarlo:
     * <p>
     * Per aggiungere responsabilità a oggetti individuali dinamicamente e in modo trasparente
     * Per responsabilità che possono essere ritirate
     * Quando l'estensione tramite sottoclassi è impraticabile
     * Quando si hanno molte estensioni indipendenti che possono essere composte in vari modi
     */
}

interface Component {
    void operation();
}

class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("Added behavior A");
    }
}

class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("Added behavior B");
    }
}