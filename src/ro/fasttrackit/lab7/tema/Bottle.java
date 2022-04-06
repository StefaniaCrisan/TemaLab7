package ro.fasttrackit.lab7.tema;

public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean open;
    Bottle(double totalCapacity, double availableLiquid){
        this.totalCapacity=totalCapacity;
        this.availableLiquid=availableLiquid;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !open;
    }

    public boolean hasLiquid() {
        if (availableLiquid>0) {
            System.out.println("The bottle has liquid");
            return true;
        } else {
            System.out.println("The bottle has not enough liquid");
            return false;
        }
    }

    public double emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void open() {
        if (isOpen()) {
            System.out.println("Bottle is already opened");
        } else {
            this.open = true;
            System.out.println("Bottle is opened");
        }
    }

    public void close() {
        if (isClosed()) {
            System.out.println("Bottle is already closed");
        } else {
            this.open = false;
            System.out.println("Bottle is closed");
        }
    }

    public double drink(double wantToDrink) {
        getAvailableLiquid();
        if(isClosed()) {
            System.out.println("Open the bottle! The bottle is closed now");
            return availableLiquid;
        } else if (wantToDrink > availableLiquid) {
            System.out.println("Not enough liquid");
            return availableLiquid;
        } else {
            double remainLiquid = availableLiquid - wantToDrink;
            System.out.println("The liquid left after drinking " + wantToDrink + " is " + remainLiquid);
            return remainLiquid;
        }
    }
}
