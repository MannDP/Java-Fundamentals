package edu.foundations;

public class Constants {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static final Person Sheldon = new Person();

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println((Constants.WIDTH) + (Constants.HEIGHT));
    }
}

/*
NOTES:
//  constants never change once a value is assigned to them
//  usually static
//  by convention, constants are upper case
//  declare constants by using the final modifier
//  constants can be public because there is no harm in accessing the variable directly if you cannot alter it
 */
