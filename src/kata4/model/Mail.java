package kata4.model;

public class Mail {

    private String mail = "";

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain() {

        return mail.substring(mail.indexOf("@") + 1);
    }

    public static boolean validEmail(String correo) {

        return correo.matches("^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$");
    }
}
