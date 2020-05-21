package sk.itsovy.ganoczi.projectfactory;

public class German implements Language {
    @Override
    public void sayHello() {
        System.out.println("Hallo");
    }

    @Override
    public void sayThankYou() {
        System.out.println("Danke schon");
    }
}
