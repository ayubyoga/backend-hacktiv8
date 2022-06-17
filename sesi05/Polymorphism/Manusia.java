package sesi05.Polymorphism;

//package Polymorphism;

abstract class Manusia {
    protected abstract void nyanyiLagu();

}

class Cowok extends Manusia {

    @Override
    protected void nyanyiLagu() {
        //
        System.out.println("la la la lost you");
    }
}

class Cewek extends Manusia {

    @Override
    protected void nyanyiLagu() {
        //
        System.out.println("hu hu hu hu hu");
    }
}