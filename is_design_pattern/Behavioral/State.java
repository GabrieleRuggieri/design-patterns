package Behavioral;

public class State {

    /**
     * STATE
     * Scopo: Permettere a un oggetto di alterare il suo comportamento quando il suo stato interno cambia. L'oggetto sembrerà cambiare la sua classe.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando il comportamento di un oggetto dipende dal suo stato e deve cambiare a runtime in base a quel stato
     * Quando le operazioni hanno grandi istruzioni condizionali multiparti che dipendono dallo stato dell'oggetto
     * Quando si vuole evitare di avere molte istruzioni condizionali nel codice
     */

    interface State {
        void handle(Context context);
    }

    class ConcreteStateA implements State {
        @Override
        public void handle(Context context) {
            System.out.println("Handling in state A");
            context.setState(new ConcreteStateB());
        }
    }

    class ConcreteStateB implements State {
        @Override
        public void handle(Context context) {
            System.out.println("Handling in state B");
            context.setState(new ConcreteStateA());
        }
    }

    class Context {
        private State state;

        public Context() {
            state = new ConcreteStateA();
        }

        public void setState(State state) {
            this.state = state;
        }

        public void request() {
            state.handle(this);
        }
    }
}
