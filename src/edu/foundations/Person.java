package edu.foundations;

public class Person {
    int age;
    String name;

    public Person() {
        //System.out.println("default constructor instantiated: no input provided");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int a, String foo) {
        //System.out.println("overloaded constructor instantiated: age and name input provided");
        this.age = a;
        this.name = foo;
    }

    public void sayHelloToMe() {
        System.out.println("Hello " + this.getName() + ", it's nice to meet you!");
    }

    public void conversationStarter() {
        if (13 <= age && age <= 19) {
            System.out.println(this.getName() + " is " + this.getAge() + " years old. " + this.getName() + " is a teenager.");
        }

        else if (age > 19) {
            System.out.println(this.getName() + " is " + this.getAge() + " years old. " + this.getName() + " is an adult.");
        }

        else{
            System.out.println(this.getName() + " is " + this.getAge() + " years old. " + this.getName() + " is a child.");
        }
    }


    public void shortIntro() {
        this.sayHelloToMe();
        this.conversationStarter();
    }
}