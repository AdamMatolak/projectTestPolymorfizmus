package sk.kosickaakademia.matolak.polymorfizmus;

public class A implements I1 {
    private int number;
    public A(){
        System.out.println("I am constructor A()");
        number = 40;
    }

    public A(String text){
        this();
        System.out.println("I am constructor A() and I got a text: " + text);
    }

    @Override
    public void animal() {
        System.out.println("Dog");
    }


    public void print(){
        System.out.println("Class A: print()");
    }
}
