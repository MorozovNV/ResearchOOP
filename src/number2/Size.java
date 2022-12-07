package number2;

public enum Size {

    ыемъпю("XS"), ьютйю("S"), япедмхи("M"), бнкйндюб ("l"), рбюпэ_еаюмюъ("XL");

    private String abbreviation;

    Size (String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
