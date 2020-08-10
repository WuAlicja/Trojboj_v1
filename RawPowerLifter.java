package com.company;

public class RawPowerLifter extends Powerlifter {

    public RawPowerLifter(String name, String surname, int powerSQ, int powerBP, int powerDL) {
        super(name, surname);
        setPowerSQ(powerSQ);
        setPowerDL(powerDL);
        setPowerBP(powerBP);
    }

    @Override
    public void setPowerSQ(int powerSQ) {
        if(powerSQ<=20){
            super.setPowerSQ(powerSQ);
        }else{
            System.out.println("Maximum SQ Power for Raw Power Lifter is 20. Power value to large!");
        }
    }

    @Override
    public void setPowerBP(int powerBP) {
        if(powerBP<=20){
            super.setPowerSQ(powerBP);
        }else{
            System.out.println("Maximum BP Power for Raw Power Lifter is 20. Power value to large!");
        }
    }

    @Override
    public void setPowerDL(int powerDL) {
        if(powerDL<=20){
            super.setPowerSQ(powerDL);
        }else{
            System.out.println("Maximum DL Power for Raw Power Lifter is 20. Power value to large!");
        }
    }

    void train(int time) {
        double probability=0.05;
        int maxPower=20;
        for (int i = 1; i <= time; i++) {
            if (runOneHourTraining(probability, maxPower)) break;
        }
    }
}
