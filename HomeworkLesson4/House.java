package model;

//JavaBean
public class House {
    private String street;
    private String building;
    private String ownerName;
    private int countOfRooms;
    private char comfortRate;
    private boolean isHouse;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public char getComfortRate() {
        return comfortRate;
    }

    public void setComfortRate(char comfortRate) {
        this.comfortRate = comfortRate;
    }

    public boolean isHouse() {
        return isHouse;
    }

    public void setHouse(boolean house) {
        isHouse = house;
    }

}
