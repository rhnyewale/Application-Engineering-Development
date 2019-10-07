/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rhnye
 */
public class CabInformation {
     private ArrayList<Car> carList;
     private ArrayList<Car> searchCarList;
     
     public CabInformation(){
     this.carList = new ArrayList<Car>();
       Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(false,"Toyota", 2018, 1, 4, 3, "T1", "Boston", false);
        Car car4 = new Car(true, "AUDI", 2018, 2, 4, 4, "Q1", "New York", true);
        Car car5 = new Car(false,"Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "AUDI", 2017, 2, 4, 6, "Q2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "SP360", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", false);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true,"AUDI", 2019, 1, 6, 10, "Q3", "Austin", true);
        Car car11 = new Car(true,"Bentley", 2016, 1, 2, 7, "SP360", "Boston", true);
        Car car12 = new Car(true,"Bentley", 2018, 1, 2, 8, "X2", "Boston", false);
        Car car13= new Car(true, "Aston Martin", 2018, 1, 3, 9, "T3", "Chicago", true);
        Car car14 = new Car(true,"Aston Martin", 2019, 1, 3, 10, "Q3", "Chicago", false);
        
        
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
     
     }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addCar(){
    Car car = new Car();
    carList.add(car);
    return car;
    }
     
    
    public void deleteCar(Car car){
    carList.remove(car);
    }

    public Iterable<Car> searchByBrand(String brandName) {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getBrand().equalsIgnoreCase(brandName)) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchByModelNumber(String ModelNumber) {
       searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getModel_num().equalsIgnoreCase(ModelNumber)) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchByCity(String City) {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getAvailable_city().equalsIgnoreCase(City)) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchByManufactureYear(String ManfctYear) {
         searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getManufactured_year()== Integer.parseInt(ManfctYear)) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchBySerialNum(String SerialNo) {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getSerial_num() == Integer.parseInt(SerialNo)) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchMinMaxSeat(int minNoOfSeat, int maxNoOfSeat) {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.getMin_seats()>= minNoOfSeat && car.getMax_seats()<= maxNoOfSeat) {
                searchCarList.add(car);
            }
        }
        return searchCarList;

    }

    public Iterable<Car> searchByAvailibilty() {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.isAvailable()==true) {
                searchCarList.add(car);
                break;
            }
        }
        return searchCarList;
        
    }

    public Iterable<Car> searchByYesAvailable() {
         searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.isAvailable()==true) {
                searchCarList.add(car);
            }
        }
        return searchCarList;

    }

    public Iterable<Car> searchByYesMaintenanceCertificate() {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.isMaintenance_certificate()==true) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchByNoMaintenanceCertificate() {
        searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.isMaintenance_certificate()==false) {
                searchCarList.add(car);
            }
        }
        return searchCarList;
    }

    public Iterable<Car> searchByNoAvailable() {
         searchCarList = new ArrayList<Car>();
        for(Car car: carList){
            if (car.isAvailable()==false) {
                searchCarList.add(car);
            }
        }
        return searchCarList;

    }
    
   
    
    
    
    
}
