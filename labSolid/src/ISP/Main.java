package ISP;

public class Main {

	public static void main(String[] args) {
		 // Crear un objeto de la clase GmailAccount
        GmailAccount gmailAccount = new GmailAccount();

        // Enviar un correo electr�nico a trav�s de EmailSender
        EmailSender.sendEmail(gmailAccount, "Hola, este es un mensaje de prueba");


	}

}
