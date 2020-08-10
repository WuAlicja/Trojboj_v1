package com.company;

public abstract class Powerlifter {

    private String name;
    private String surname;
    int powerSQ;
    int powerBP;
    int powerDL;

    public Powerlifter(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPowerSQ(int powerSQ) {
        this.powerSQ = powerSQ;
    }

    public void setPowerBP(int powerBP) {
        this.powerBP = powerBP;
    }

    public void setPowerDL(int powerDL) {
        this.powerDL = powerDL;
    }

  abstract void train (int time);

    public boolean runOneHourTraining(double probability, int maxPower) {
        if (Math.random() > probability) {
            if (powerSQ < maxPower || powerBP < maxPower || powerDL < maxPower) {

                int minimum = Math.min(Math.min(powerSQ, powerBP), powerDL);
                if (powerSQ == minimum) {
                    powerSQ++;
                    System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                            " DL: " + powerDL + " trained squat.");
                } else if (powerBP == minimum) {
                    powerBP++;
                    System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                            " DL: " + powerDL + " trained bench press.");
                } else {
                    powerDL++;
                    System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                            " DL: " + powerDL + " trained dead lift.");
                }

            } else {
                System.out.println("End of training - maximum power reached.");
                return true;
            }
        } else {
            System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                    " DL: " + powerDL + " sustained an injury and cannot train now.");
            return true;
        }
        return false;
    }
}
