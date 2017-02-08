package Calculator;

import java.util.List;

/**
 * Created by Глеб on 08.02.2017.
 */
public interface Calculator {

    void sum();
    void sub();
    void mul();
    void div();

    void calculate(List<String> list);

}
