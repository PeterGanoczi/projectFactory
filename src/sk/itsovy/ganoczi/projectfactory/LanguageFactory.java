package sk.itsovy.ganoczi.projectfactory;

public class LanguageFactory {

    public Language getLanguage(String language){
        if (language==null){
            return null;
        }
        if (language.equalsIgnoreCase("English")){
            return new English();
        } else if (language.equalsIgnoreCase("Spanish")){
            return new Spanish();
        } else if (language.equalsIgnoreCase("Slovak")){
            return new Slovak();
        } else if (language.equalsIgnoreCase("German")){
            return new German();
        }
        return null;
    }
}
