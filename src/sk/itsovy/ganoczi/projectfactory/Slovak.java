package sk.itsovy.ganoczi.projectfactory;

public class Slovak implements Language {
    @Override
    public void sayHello() {
        System.out.println("Ahoj");
    }

    @Override
    public void sayThankYou() {
        System.out.println("Dakujem");
    }
}
