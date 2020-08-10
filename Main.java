package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Powerlifter> powerLifters=new ArrayList<>();
        Powerlifter player1=new RawPowerLifter("Piotr","Domanski",
                10,10,10);
        powerLifters.add(player1);

        Powerlifter player2=new RawPowerLifter("Stefan","Zeromski",
                20,15,12);
        powerLifters.add(player2);

        Powerlifter player3=new RawPowerLifter("Adam","MIchalak",
                10,15,20);
        powerLifters.add(player3);

        Powerlifter player4=new EquippedPowerLifter("Jakub","Zorro",
                40,15,12);
        powerLifters.add(player4);

        Powerlifter player5=new RawPowerLifter("Emil","Zebrzydowski",
                10,20,12);
        powerLifters.add(player5);

        player1.train(4);
        player2.train(20);
        player3.train(100);
        player4.train(20);
        player5.train(20);


    }
}
