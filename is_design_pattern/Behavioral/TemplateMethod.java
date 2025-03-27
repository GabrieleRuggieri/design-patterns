package Behavioral;

public class TemplateMethod {

    /**
     * TEMPLATE METHOD
     * <p>
     * Scopo: Definire lo scheletro di un algoritmo in un'operazione, delegando alcuni passaggi alle sottoclassi. Template Method consente alle sottoclassi di ridefinire alcuni passaggi di un algoritmo senza cambiarne la struttura.
     * <p>
     * Quando usarlo:
     * <p>
     * Per implementare le parti invarianti di un algoritmo una volta e lasciare che le sottoclassi implementino il comportamento che può variare
     * Quando il comportamento comune tra sottoclassi deve essere fattorizzato ed evitare la duplicazione del codice
     * Per controllare le estensioni delle sottoclassi
     */

    abstract class AbstractClass {
        public final void templateMethod() {
            primitiveOperation1();
            primitiveOperation2();
            concreteOperation();
            hook();
        }

        protected abstract void primitiveOperation1();

        protected abstract void primitiveOperation2();

        final void concreteOperation() {
            System.out.println("ConcreteOperation implemented in AbstractClass");
        }

        protected void hook() {
        } // Hook method con implementazione predefinita vuota
    }

    class ConcreteClass extends AbstractClass {
        @Override
        protected void primitiveOperation1() {
            System.out.println("Primitive Operation 1 implemented in ConcreteClass");
        }

        @Override
        protected void primitiveOperation2() {
            System.out.println("Primitive Operation 2 implemented in ConcreteClass");
        }

        @Override
        protected void hook() {
            System.out.println("Hook customized in ConcreteClass");
        }
    }
}
