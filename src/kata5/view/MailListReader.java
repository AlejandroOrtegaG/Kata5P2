package kata5.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;

//C:\Users\alexi\Documents\NetBeansProjects\Kata4
public class MailListReader {

    public static List<Mail> read(String mail) {

        List<Mail> lista = new ArrayList();

        try {
            BufferedReader leer = new BufferedReader(new FileReader(new File(mail)));
            while (true) {
                String line = leer.readLine();

                if (line == null) {
                    break;
                }

                if (Mail.validEmail(line)) {
                    lista.add(new Mail(line));
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("No se ha encontrado el archivo indicado" + "\n"
                    + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("No hay lineas que leer" + "\n"
                    + exception.getMessage());
        }

        return lista;
    }
}
