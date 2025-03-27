package Behavioral;

public class Mediator {

    /**
     * MEDIATOR
     * <p>
     * Scopo: Definire un oggetto che incapsula come un insieme di oggetti interagisce. Mediator promuove l'accoppiamento debole impedendo agli oggetti di riferirsi esplicitamente l'un l'altro.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando un insieme di oggetti comunica in modo ben definito ma complesso
     * Quando il riutilizzo di un oggetto è difficile perché comunica con molti altri oggetti
     * Quando si vuole personalizzare il comportamento distribuito tra molte classi senza creare sottoclassi
     */

    interface Mediator {
        void notify(Colleague colleague, String event);
    }

    abstract class Colleague {
        protected Mediator mediator;

        public Colleague(Mediator mediator) {
            this.mediator = mediator;
        }
    }

    class ConcreteColleagueA extends Colleague {
        public ConcreteColleagueA(Mediator mediator) {
            super(mediator);
        }

        public void operationA() {
            System.out.println("ConcreteColleagueA performs operation A");
            mediator.notify(this, "OperationA");
        }

        public void receiveEvent(String event) {
            System.out.println("ConcreteColleagueA received event: " + event);
        }
    }

    class ConcreteColleagueB extends Colleague {
        public ConcreteColleagueB(Mediator mediator) {
            super(mediator);
        }

        public void operationB() {
            System.out.println("ConcreteColleagueB performs operation B");
            mediator.notify(this, "OperationB");
        }

        public void receiveEvent(String event) {
            System.out.println("ConcreteColleagueB received event: " + event);
        }
    }

    class ConcreteMediator implements Mediator {
        private ConcreteColleagueA colleagueA;
        private ConcreteColleagueB colleagueB;

        public void setColleagueA(ConcreteColleagueA colleagueA) {
            this.colleagueA = colleagueA;
        }

        public void setColleagueB(ConcreteColleagueB colleagueB) {
            this.colleagueB = colleagueB;
        }

        @Override
        public void notify(Colleague colleague, String event) {
            if (colleague == colleagueA) {
                colleagueB.receiveEvent(event);
            } else if (colleague == colleagueB) {
                colleagueA.receiveEvent(event);
            }
        }
    }
}
