package de.ostfalia.aud.s23ss.base;

import java.time.LocalDate;

public class Employee implements IEmployee {
    private String[] informationArray = new String[7];
    private String information = "KeinEintrag";


    public Employee(String information) {
        if(information == null || information.equals("")) {
            information = null;
        } else {
            this.information = information;
            this.informationArray = information.split(";");
        }
    }



    public String toString() {
        if(information == null) {
            return "KeinEintrag";
        }
        if(information.equals("KeinEintrag")) {
            return "KeinEintrag";
        } else {
            return information;
        }
    }


    @Override
    public int compareTo(IEmployee arg0) {
        if(arg0 == null) {
            throw new NullPointerException("arg0 is null");
        } else if(arg0.toString().equals(this.toString())) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public int getKey() {
        if(informationArray[0] == null) {
            return -1;
        }
        return Integer.parseInt(informationArray[0]);
    }

    @Override
    public String getName() {

        if(information == null) {
            return "KeinEintrag";
        }

        return informationArray[3];
    }

    @Override
    public String getFirstName() {

        if(information == null) {
            return "KeinEintrag";
        }
        return informationArray[2];
    }

    @Override
    public Gender getGender() {
        
        return Gender.valueOf(informationArray[4]);
    }

    @Override
    public LocalDate getBirthdate() {
        return LocalDate.parse(informationArray[1]);
    }

    @Override
    public LocalDate getHiredate() {
        return LocalDate.parse(informationArray[5]);
    }

    @Override
    public Department getDepartment() {
        for(Department d : Department.values()){
            if(d.toString().equals(informationArray[6])){
                return d;
            }
        }
        return null;
    }
    
}
