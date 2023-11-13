package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FReader {
    BufferedReader bufferedReader;
    public FReader(String filename) throws IOException{
        bufferedReader = new BufferedReader(new FileReader(filename)); 
    }

    public String read() throws IOException{
        return bufferedReader.readLine();
    }

        
}
