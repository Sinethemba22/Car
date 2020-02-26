package org.sinethemba;

public class Car {

    private String carName;
    private String message;



    public Car(String cName){

        carName = cName;

    }

    public Car(){}

    public String getCarName() {
        return carName;
    }

    public void setMessage(String msg){

        message = msg;
    }

    public String getMessage(){

        return message;
    }
}
