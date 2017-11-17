public enum mailCode {
    SPAM_LETTER, SHOP_LETTER, BANK_LETTER, YOUR_OPERATOR;

    @Override
    public String toString() {
        switch (this){
            case SHOP_LETTER: return ". Buy our stuffs.";
            case SPAM_LETTER: return ". I'm Spam letter. AHAHAHAHAH";
            case BANK_LETTER: return ". Pay your credit.";
            case YOUR_OPERATOR: return ". Give me your money";
            default: return "OK";

        }
    }
}
