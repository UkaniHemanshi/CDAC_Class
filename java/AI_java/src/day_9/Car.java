package day_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class Car {
    private final String make;
    private final String model;
    private final Date mandate;
    private final ArrayList<String> colors;
    public Car(String make , String model, Date mandate, List<String> colors) {
        super();
        this.make = make;
        this.model = model;
        this.mandate = new Date(mandate.getDay(),mandate.getMonth(),mandate.getYear());

        ArrayList<String> temp = new ArrayList<>();

        Iterator<String> it = colors.iterator();


        while(it.hasNext()){
            temp.add(it.next());

        }
        this.colors = temp;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public Date getYear() {
        return mandate;
    }
    public ArrayList<String> getColors() {
        return (ArrayList<String>)colors.clone();
    }
    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + mandate + ", colors=";
    }
}



