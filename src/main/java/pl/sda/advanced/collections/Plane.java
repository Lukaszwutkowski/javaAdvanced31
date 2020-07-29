package pl.sda.advanced.collections;

import java.util.Objects;

public class Plane implements Comparable<Plane>{

    private String model;
    private int weight;
    private int planeID;

    public Plane(String model, int weight, int planeID) {
        this.model = model;
        this.weight = weight;
        this.planeID = planeID;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getPlaneID() {
        return planeID;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", planeID=" + planeID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // sprawdzenie czy to jest ten sam objekt - referencja
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return planeID == plane.planeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeID);
    }

    @Override
    public int compareTo(Plane plane){
        return this.planeID - plane.planeID;
        // return -(this.planeID - plane.planeID); zwroci segregacje odwrotna
    }
}
