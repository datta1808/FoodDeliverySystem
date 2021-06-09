package com.bridgelabz;

public class Application {

    public static void main(String[] args) {

        FoodStore foodStore = new FoodStore();

        System.out.println("************* Welcome to the FOOD DELIVERY SYSTEM ****************");

        PaneerTikka paneerTikka = new PaneerTikka();
        paneerTikka.setPrice(180);
        paneerTikka.setTaste(Taste.SPICY);

        VadaPav vadaPav = new VadaPav();
        vadaPav.setPrice(10);
        vadaPav.setTaste(Taste.SALTY);

        TandooriChicken tandooriChicken = new TandooriChicken();
        tandooriChicken.setPrice(280);
        tandooriChicken.setTaste(Taste.SPICY);

        DalFry dalFry = new DalFry();
        dalFry.setPrice(90);
        dalFry.setTaste(Taste.SWEET);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setPrice(20);
        masalaPapad.setTaste(Taste.SALTY);

        MangoJuice mangoJuice = new MangoJuice();
        mangoJuice.setPrice(40);
        mangoJuice.setTaste(Taste.SWEET);


        // adding the foods items
        foodStore.prepare(paneerTikka);
        foodStore.prepare(vadaPav);
        foodStore.prepare(tandooriChicken);
        foodStore.prepare(dalFry);
        foodStore.prepare(masalaPapad);
        foodStore.prepare(mangoJuice);


//        //printing the food items
//        foodStore.printFood();
//
//        // delivering the food items
//        foodStore.deliver(paneerTikka);
//
//        System.out.println("Food Items after Delivery -------------------------------------------------------");
//
//        //printing food items after delivering
//        foodStore.printFood();
        foodStore.createSystemMenu();

    }
}
