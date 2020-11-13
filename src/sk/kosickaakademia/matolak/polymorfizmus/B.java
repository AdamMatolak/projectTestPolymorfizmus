package sk.kosickaakademia.matolak.polymorfizmus;

public class B extends A implements I2 {

    public B(){
        System.out.println("I am constructor B()");
    }


    @Override //anotacia - prekrytie metody print
    public void print(){
        System.out.println("Class B: print()");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Cow");
    }

    public void programmingLanguage(){
        System.out.println("Class B loves Java");
    }
}
