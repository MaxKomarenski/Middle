import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<MailInfo>();

    public void addMailInfo(MailInfo addedMailInfo, int age, String name, String lastName, Sex sex){
        addedMailInfo.client.setAge(age);
        addedMailInfo.client.setName(name);
        addedMailInfo.client.setLastName(lastName);
        addedMailInfo.client.setSex(sex);

        infos.add(addedMailInfo);

    }

    public void sendAll(){
        try {
            for (MailInfo info : infos) {
                MailSender sender = new MailSender();
                sender.sendMail(info);
            }
        }catch (NullPointerException e){
            System.out.println("I don't know why");
        }

    }
}
