package FactoryMethod;

/**
 * Created by Глеб on 07.02.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper()
                ;
    }
}
