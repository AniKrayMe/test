package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Spearman spearman = new Spearman( 100, "Pedro", random.nextInt( 10 ) + 5 );
        Archer archer = new Archer( 100, "Paablo", random.nextInt( 20 ) );
        SwordMan swordMan = new SwordMan( 100, "Andrey", random.nextInt( 5 ) + 10 );
        Mage mage = new Mage( 100, "Muhamed", random.nextInt( 15 ) );

        for (int i = 0; i <100; i++) {
            swordMan.attack( archer );
            System.out.println("Archer attach = "+archer.getDamage()+ "     Archer health  = "+archer.getHealth());

            if (archer.getHealth()<=0){
                System.out.println("Swordman win");
                break;
            }


            archer.attack( swordMan );
            System.out.println("Swordman attack = "+swordMan.getDamage()+"   swordman health  = "+swordMan.getHealth());
            if(spearman.getHealth()<=0){
                System.out.println("Archer win");
                break;
            }
        }









    }
}
