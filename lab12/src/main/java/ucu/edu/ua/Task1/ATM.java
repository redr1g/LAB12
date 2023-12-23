package ucu.edu.ua.Task1;

public class ATM {
    private Tray firstTray;
    
    public ATM() {
        firstTray = new Tray50().setNext(new Tray20().setNext(new Tray5()));
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
