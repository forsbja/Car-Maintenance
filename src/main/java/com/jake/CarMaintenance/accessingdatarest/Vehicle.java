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
        private int year;
        private int mileage;
        private String maintenancePerformed;


        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public String getMaintenancePerformed() {
            return maintenancePerformed;
        }

        public void setMaintenancePerformed(String maintenancePerformed) {
            this.maintenancePerformed = maintenancePerformed;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String firstName) {
            this.make = firstName;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String lastName) {
            this.model = lastName;
        }
}
