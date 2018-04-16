package edu.foundations;

public class ReferenceAndValue {
    public static void main(String[] args) {
        Car mannCar;
        mannCar = new Car();
        mannCar.setMyCar(Car.carType.FERRARI);
        mannCar.setCarAge(0);
        System.out.println(mannCar.getMyCar() + ", " + mannCar.getCarAge() + " years.");

        Car dawsonCar = new Car(Car.carType.HONDA);
        dawsonCar.setCarAge(20);
        System.out.println(dawsonCar.getMyCar() + ", " + dawsonCar.getCarAge() + " years.");

        int x = 5;
        ageValue(x);
        System.out.println("Value of Number is: " + x);

        carBirthday(mannCar);
        System.out.println(mannCar.getMyCar() + ", " + mannCar.getCarAge() + " years.");
    }

    //passing by value
    public static void ageValue(int number) {
        number = number + 1;
    }

    //passing by reference
    public static void carBirthday(Car foo) {
        foo.setCarAge(foo.getCarAge() + 1);
    }
}
