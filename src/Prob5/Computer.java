package Prob5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double getComputerPower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return manufacturer + " " + processor + " " + ramSize + " " + processorSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;

        Computer computer = (Computer) o;

        return processor == computer.processor &&
                ramSize == computer.ramSize &&
                processor == computer.processor &&
                Objects.equals(manufacturer, computer.manufacturer);
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize, processor);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("Dell","Intel", 16, 9000);
        Computer c2 = new Computer("MSI", "Intel", 16, 9000);

        System.out.println("Is Same? "+c1.equals(c2));
        System.out.println(c1.hashCode()+ " "+c2.hashCode());
        Computer c3 = new Computer("MSI", "Intel", 16, 9000);

        System.out.println("Is Same? "+c3.equals(c2));
        System.out.println(c3.hashCode()+ " "+c2.hashCode());
    }

}
