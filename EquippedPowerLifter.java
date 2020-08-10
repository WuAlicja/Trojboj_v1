package com.company;

public class EquippedPowerLifter extends Powerlifter {
    public EquippedPowerLifter(String name, String surname, int powerSQ, int powerBP, int powerDL) {
        super(name, surname);
        setPowerBP(powerBP);
        setPowerDL(powerDL);
        setPowerSQ(powerSQ);
    }
    @Override
    public void setPowerSQ(int powerSQ) {
        if(powerSQ<=45){
            super.setPowerSQ(powerSQ);
        }else{
            System.out.println("Maximum SQ Power for Raw Power Lifter is 45. Power value to large!");
        }
    }

    @Override
    public void setPowerBP(int powerBP) {
        if(powerBP<=45){
            super.setPowerSQ(powerBP);
        }else{
            System.out.println("Maximum BP Power for Raw Power Lifter is 45. Power value to large!");
        }
    }

    @Override
    public void setPowerDL(int powerDL) {
        if(powerDL<=45){
            super.setPowerSQ(powerDL);
        }else{
            System.out.println("Maximum DL Power for Raw Power Lifter is 45. Power value to large!");
        }
    }

    void train(int time) {
        double probability = 0.15;
        int maxPower = 45;
        for (int i = 1; i <= time; i++) {
            if (runOneHourTraining(probability, maxPower)) break;
        }
    }
}
