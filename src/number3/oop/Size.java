package number3.oop;

public enum Size {

    ыемъпю("XS"), ьютйю("S"),
    япедмхи("M"), бнкйндюб ("l"),
    рбюпэ_еаюмюъ("XL"), мехгбеярмн("");

    private String abbreviation;

    Size (String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
