package number3.oop;

public enum Size {

    ������("XS"), �����("S"),
    �������("M"), �������� ("l"),
    �����_������("XL"), ����������("");

    private String abbreviation;

    Size (String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
