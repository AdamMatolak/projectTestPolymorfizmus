package sk.kosickaakademia.matolak.polymorfizmus;

public class Main {

    public static void main(String[] args) {
        B p1 = new B(); //Zavola sa konštr. A , potom konštr.B
        p1.print(); // Zavola sa print() B

        System.out.println();

        A p2 = new C(); //Zavola sa konštr. A , potom konštr.B a potom aj C
        p2.print(); //Zavola sa print() pre C
        p2.wildAnimal();
        ((C)p2).programmingLanguage();

        System.out.println();

        A p3 = new A();
        p3.wildAnimal();

        System.out.println();

        I1 p4 = new B();
        p4.wildAnimal();
        ((A)p4).print();

        System.out.println();

        C p5 = new C();
        p5.print();

        System.out.println();

        A p6 = new A("mobil phone");
    }

}
