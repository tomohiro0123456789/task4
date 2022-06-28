import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
        private String path;
        
        private static Logger logger = Logger.getLogger(TextReader.class.getName());

        public enum Mark{
                START,END
        };

        private TextReader(String path){
                this.path = path;
        }

        private void execute(){
          List<String> valuelist = new ObjectList<>();
        }
        try (FileReader path = new FileReader; 
        BufferedReader fr = new BufferedReader)
        {String line = null;
         while((line = br.readLine())!=null){
                 valuelist.add(Integer.perseInt(line));
         }
        catch (IOException e){
              e.printStackTrance();
        }
          
        for(Integer valueList.size():i++){
          System.out.print(value);
        }
        }
public static void main(String...args){
        logger.info(Mark.START.name());
        new TextReader(args[0]).execute();
        logger.info(Mark.END.name());
}
}

