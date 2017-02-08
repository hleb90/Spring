package Calculator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Глеб on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get(args[0]);
            File file = path.toFile();

            ParsingFile parsingFile = new ParsingFile(file);
            parsingFile.parsing();

        }catch (RuntimeException e){
            System.out.println("Enter the correct files name");
        }
    }
}
