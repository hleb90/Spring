package Calculator;

import java.util.List;

/**
 * Created by Глеб on 08.02.2017.
 */
public class SimpleCalculator implements Calculator  {   // The calculators type is 0 !!!

    private static double result = 0;
    @Override
    public double sum(double a, double b) {
        return  a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public void calculate(List<String> list) {
        for (String iter: list) {
            iter.trim();
        }
        result = Double.parseDouble(list.get(0));
        for (int i = 1; i < list.size(); i++){
            double b = Double.parseDouble(list.get(i + 1));
            switch (list.get(i)){
                case "+":
                    //double a = Double.parseDouble(list.get(i - 1));
                    result = sum(result, b);
                    break;
                case "-":
                    result = sub(result, b);
                    break;
                case "*":
                    result = mul(result, b);
                    break;
                case "/":
                    result = div(result, b);
                    break;
            }

        }

    }
}
