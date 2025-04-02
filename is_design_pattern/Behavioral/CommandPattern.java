package Behavioral;

public class CommandPattern {

    /**
     * COMMAND
     * <p>
     * Scopo: Incapsulare una richiesta come un oggetto, permettendo di parametrizzare i client con diverse richieste, accodare o registrare le richieste e supportare operazioni annullabili.
     * <p>
     * Quando usarlo:
     * <p>
     * Per parametrizzare gli oggetti con un'azione da eseguire
     * Per specificare, accodare ed eseguire le richieste in tempi diversi
     * Per supportare operazioni annullabili
     * Per strutturare un sistema basato su operazioni ad alto livello costruite su operazioni primitive
     */

}

interface Command {
    void execute();
}

class Receiver {
    public void action() {
        System.out.println("Receiver action");
    }
}

class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
