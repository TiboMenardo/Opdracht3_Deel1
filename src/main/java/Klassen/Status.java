package Klassen;

public enum Status {
    KIEZEN(1, "Ambassadeur selecteren"),
    WACHTEN(2, "Wachten op antwoord"),
    Geconfirmeerd(3, "Geconfirmeerd"),
    Uitgevoerd(4, "Uitgevoerd");
    private final int code;
    private final String description;
    private Status(int code, String description) {
        this.code = code;
        this.description = description;
    }
    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
}
