package Calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Глеб on 08.02.2017.
 */
public class ParsingFile {

    private File file;
    String type;

    public ParsingFile(File file) {
        this.file = file;
    }

    void parsing(){
        try {
            Scanner scanner = new Scanner(file);
            type = scanner.next();
            Calculator calculator = CalculatorFactory.createCalculatorByType(type);
            List<String> list = new LinkedList<>();
            while (scanner.hasNext()){
                list.add(scanner.next());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

    }

}