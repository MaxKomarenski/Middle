public class Main {
    public static void main(String[] args){
        MailBox mail = new MailBox();
        MailInfo m = new MailInfo();

        mail.addMailInfo(new MailInfo(), 34, "Steve", "Job", Sex.MALE);
        mail.addMailInfo(new MailInfo(), 35, "Mag", "Job", Sex.MALE);

        mail.sendAll();
    }
}
