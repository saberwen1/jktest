package com.fate.jktest;

public class Plate<T> {

    private  T plate;

    public  T getPlate() {
        return plate;
    }

    public void setPlate(T plate) {
        this.plate = plate;
    }

    public Plate(T plate) {
        this.plate = plate;
    }

    public <E> T  say(Plate<T> tClass,E e) {
        return tClass.getPlate();
    }

    public static void main(String[] args) {
        Plate<Apple> p = new Plate<Apple>(new Apple());
        Fruit plate =(Apple) p.getPlate();
        plate.say();
    }
}
