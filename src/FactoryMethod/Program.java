package FactoryMethod;

/**
 * Created by Глеб on 07.02.2017.
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("Java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        }else {
            if (specialty.equalsIgnoreCase("C++")){
                return new CppDeveloperFactory();
            }else {
                throw new RuntimeException("something wrong!");
            }
        }

    }
}