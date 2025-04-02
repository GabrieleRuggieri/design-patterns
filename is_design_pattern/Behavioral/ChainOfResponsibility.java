package Behavioral;

public class ChainOfResponsibility {

    /**
     * I pattern comportamentali si occupano della comunicazione tra oggetti e della distribuzione delle responsabilità.
     */

    /**
     * CHAIN OF RESPONSIBILITY
     * <p>
     * Scopo: Evitare l'accoppiamento tra mittente e destinatario di una richiesta dando a più di un oggetto la possibilità di gestire la richiesta.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando più di un oggetto può gestire una richiesta e il gestore non è noto a priori
     * Quando si vuole inviare una richiesta a uno di diversi oggetti senza specificare esplicitamente il ricevente
     * Quando l'insieme di oggetti che può gestire una richiesta deve essere specificato dinamicamente
     */

}

abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandlerA handles request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandlerB handles request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandlerC handles request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}