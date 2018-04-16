package edu.foundations;

public class Car {
    enum carType {AUDI, BMW, FERRARI, LAMBORGHINI, PORSHE, BENTLEY, HONDA};
    carType myCar;
    int carAge;

    public Car() {
        //System.out.println("Constructed object of class type Car");
    }

    public carType getMyCar() {
        return myCar;
    }

    public void setMyCar(carType myCar) {
        this.myCar = myCar;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }


    public Car(carType m) {
        this.myCar = m;
        //System.out.println("Overloaded constructor of class type Car");
    }
}
