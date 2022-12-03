package com.jake.CarMaintenance.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class Vehicle {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String make;
        private String model;
        private int vehicleYear;
        private int mileage;
        private String maintenancePerformed;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaintenancePerformed() {
        return this.maintenancePerformed;
    }

    public void setMaintenancePerformed(String maintenancePerformed) {
        this.maintenancePerformed = maintenancePerformed;
    }

    public int getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
}
