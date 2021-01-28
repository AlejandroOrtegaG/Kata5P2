package kata5.main;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReader;

public class Main {
    static List<Mail> mailList;
    static Histogram<String> s;
    
    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }
    
    public void execute() {
        input();
        process();
        output();
    }
    
    private void input() {
        MailListReader mailListReader = new MailListReader();
        String Fichero = "C:\\Users\\alexi\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        mailList = MailListReader.read(Fichero);
    }
    
    private void process() {
        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        s = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay(s);
        histogramDisplay.execute();
    }
}
