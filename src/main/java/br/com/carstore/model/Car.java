package br.com.carstore.model;

import br.com.carstore.dao.CarDao;

public class Car {
    //this = Car();
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
