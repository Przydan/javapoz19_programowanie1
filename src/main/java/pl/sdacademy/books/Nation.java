package pl.sdacademy.books;

public enum Nation {
    ENG("ENG"),
    PL("PL"),
    USA("USA"),
    ;

    private final String nationName;

    private Nation(String nationName) {
        this.nationName = nationName;
    }

    public String getNationName() {
        return nationName;
    }
}
