package FactoryMethod;

/**
 * Created by Глеб on 07.02.2017.
 */
public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
