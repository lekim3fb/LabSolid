package ISP;

public class GmailAccount implements IEmailable {
    String name, emailAddress;

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

}