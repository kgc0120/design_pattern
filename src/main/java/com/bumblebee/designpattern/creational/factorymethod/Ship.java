package com.bumblebee.designpattern.creational.factorymethod;

/**
 * @author bumblebee
 */
public class Ship {

    private String Name;

    private String color;

    private String logo;

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
