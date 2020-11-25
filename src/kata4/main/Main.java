package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Main {

    public static void main(String[] args) {
        String Fichero = "C:\\Users\\alexi\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        List<Mail> mailList = MailListReader.read(Fichero);
        Histogram<String> s = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(s);
        histoDisplay.execute();
    }
}
