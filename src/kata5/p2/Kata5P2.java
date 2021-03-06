package kata5.p2;
 
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.util.List;
 import kata5.p2.model.Histogram;
 import kata5.p2.model.Mail;
 import kata5.p2.view.HistogramDisplay;
 import kata5.p2.view.MailHistogramBuilder;
 import kata5.p2.view.MailListReader;
 import java.sql.SQLException;
 import java.util.ArrayList;
 
 public class Kata5P2 {
     public static void main(String[] args) throws IOException, Exception {
         Kata5P2 histo = new Kata5P2();
         histo.execute();
     }
     
     private String filename;
     private ArrayList<Mail> mailList;
     private Histogram<String> histogram;
     private static HistogramDisplay histoDisplay;
         
     private void execute() throws Exception{
         input();
         process();
         output();
     }
     
     private void input() throws IOException, ClassNotFoundException, SQLException{
        filename = "/Users/Ithiel/NetBeansProjects/Kata4/emails.txt";
        mailList = MailListReader.read();
     }
     
     private void process() throws Exception{
         histogram = MailHistogramBuilder.build(mailList);
     }
     
    private void output(){
         histoDisplay = new HistogramDisplay(histogram);
         histoDisplay.execute();
     }
 }