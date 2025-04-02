package structural;

public class FacadePattern {

    /**
     * FACADE
     * Scopo: Fornire un'interfaccia unificata a un insieme di interfacce in un sottosistema. Facade definisce un'interfaccia di alto livello che rende il sottosistema più facile da usare.
     * <p>
     * Quando usarlo:
     * <p>
     * Per fornire un'interfaccia semplice a un sottosistema complesso
     * Per disaccoppiare un sottosistema dai suoi client
     * Per strutturare un sistema in sottosistemi
     * Quando si vuole stratificare i sottosistemi
     */

}

class SubsystemA {
    public void operationA() {
        System.out.println("Subsystem A operation");
    }
}

class SubsystemB {
    public void operationB() {
        System.out.println("Subsystem B operation");
    }
}

class SubsystemC {
    public void operationC() {
        System.out.println("Subsystem C operation");
    }
}

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}