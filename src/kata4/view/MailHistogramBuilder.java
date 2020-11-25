package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> lista) {
        Histogram<String> res = new Histogram<>();
        for (Mail a : lista) {
            res.increment(a.getDomain());
        }
        return res;
    }

}
