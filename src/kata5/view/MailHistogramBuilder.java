package kata5.view;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> lista) {
        Histogram<String> res = new Histogram<>();
        for (Mail a : lista) {
            res.increment(a.getDomain());
        }
        return res;
    }

}
