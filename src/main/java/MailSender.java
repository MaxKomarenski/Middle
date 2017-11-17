public class MailSender {
    public void sendMail(MailInfo mailInfo){
        if(mailInfo.client.getAge() < 60){
            if(mailInfo.client.getSex().equals(Sex.MALE)){
                printer("Mr.",mailInfo.client, mailCode.BANK_LETTER);
            }if(mailInfo.client.getSex().equals(Sex.FEMALE)){
                printer("Miss.",mailInfo.client, mailCode.YOUR_OPERATOR);
            }
        }else {
            if(mailInfo.client.getSex().equals(Sex.MALE)){
                printer("Mr.",mailInfo.client, mailCode.SHOP_LETTER);
            }if(mailInfo.client.getSex().equals(Sex.FEMALE)){
                printer("Miss.",mailInfo.client, mailCode.SPAM_LETTER);
            }
        }
    }

    private void printer(String mrOrMiss, Client c, mailCode type){
        System.out.println("Miss." + c.getName() + mailCode.SPAM_LETTER);
    }
}
