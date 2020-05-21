package sk.itsovy.ganoczi.projectfactory;

public class Main {
    public static void main(String[] args) {

        LanguageFactory myFactory=new LanguageFactory();

        Language english=myFactory.getLanguage("English");

        english.sayHello();

        Language spanish=myFactory.getLanguage("Spanish");
        spanish.sayHello();
        spanish.sayThankYou();
    }
}
