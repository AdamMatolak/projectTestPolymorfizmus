package sk.kosickaakademia.matolak.polymorfizmus;

public interface I0 {
    public void animal();

    default public void wildAnimal(){
        System.out.println("Horse");
    }
}
