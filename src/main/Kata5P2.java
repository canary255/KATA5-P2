package kata5P2.main;
  
  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5P2.view.HistogramDisplay;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;
  
public class Kata5P2 {
  
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        Kata5P2 kata5 = new Kata5P2();
        kata5.execute();  
    }
      
      private void input() throws FileNotFoundException, IOException{
        filename = "C:/Users/usuario/Documents/NetBeansProjects/kata5/src/kata5P2/main/emails.txt";
        mailList=MailListReader.read(filename);
    }
}
    