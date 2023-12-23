package ucu.edu.ua.Task1;

public class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray tray) {
        this.next = tray;
        return this;
    }

    public int process(int amount) {
        System.out.println("You should take " + amount/denomination + " of denomination " + denomination);
        if (next != null) {
            next.process(amount % denomination);
            return 1;
        } else if (amount % denomination > 0) {
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
