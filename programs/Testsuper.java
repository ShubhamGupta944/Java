package programs;

class Animal{

    String color = "white";

}

class dog extends Animal{

    String color = "black";

    void printColor(){

        System.out.println(color);
        System.out.println(super.color);
    }

}

public class Testsuper{

    public static void main(String[] args){

        dog d  = new dog();
        d.printColor();
    }

}