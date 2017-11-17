public enum Sex {
    MALE, FEMALE;

    @Override
    public String toString() {
        switch (this){
            case MALE: return "M";
            case FEMALE: return "F";
            default: return "OK";
        }
    }
}
