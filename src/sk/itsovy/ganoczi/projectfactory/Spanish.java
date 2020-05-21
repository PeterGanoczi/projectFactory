package sk.itsovy.ganoczi.projectfactory;

public class Spanish implements Language {
    @Override
    public void sayHello() {
        System.out.println("Ciao");
    }

    @Override
    public void sayThankYou() {
        System.out.println("Gracias");
    }
}
