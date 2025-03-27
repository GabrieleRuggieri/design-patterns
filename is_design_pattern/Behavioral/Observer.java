package Behavioral;

public class Observer {

    /**
     * OBSERVER
     * <p>
     * Scopo: Definire una dipendenza uno-a-molti tra oggetti in modo che quando un oggetto cambia stato, tutti i suoi dipendenti vengono notificati e aggiornati automaticamente.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando un'astrazione ha due aspetti, uno dipendente dall'altro
     * Quando una modifica a un oggetto richiede la modifica di altri oggetti
     * Quando un oggetto deve notificare altri oggetti senza fare supposizioni su chi sono questi oggetti
     */

    interface Observer {
        void update(String message);
    }

    interface Subject {
        void attach(Observer observer);

        void detach(Observer observer);

        void notifyObservers();
    }

    class ConcreteSubject implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String state;

        public void setState(String state) {
            this.state = state;
            notifyObservers();
        }

        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(state);
            }
        }
    }

    class ConcreteObserver implements Observer {
        private String observerState;
        private String name;

        public ConcreteObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            this.observerState = message;
            System.out.println(name + " received: " + message);
        }
    }
}
