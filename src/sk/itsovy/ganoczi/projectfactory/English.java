package sk.itsovy.ganoczi.projectfactory;

public class English implements Language {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayThankYou() {
        System.out.println("Thank you");
    }
}
