package structural;

public class Adapter {

    /**
     * I pattern strutturali si occupano della composizione di classi e oggetti per formare strutture più grandi.
     */

    /**
     * ADAPTER
     * Scopo: Convertire l'interfaccia di una classe in un'altra interfaccia che i clienti si aspettano.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando si vuole usare una classe esistente, ma la sua interfaccia non corrisponde a quella necessaria
     * Per creare una classe riutilizzabile che cooperi con classi che non hanno necessariamente interfacce compatibili
     * Quando si vuole riutilizzare diverse sottoclassi esistenti ma è impraticabile adattare la loro interfaccia modificando ogni sottoclasse
     */

    interface Target {
        void request();
    }

    class Adaptee {
        public void specificRequest() {
            System.out.println("Specific request");
        }
    }

    class Adapter implements Target {
        private Adaptee adaptee;

        public Adapter(Adaptee adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void request() {
            adaptee.specificRequest();
        }
    }
}
