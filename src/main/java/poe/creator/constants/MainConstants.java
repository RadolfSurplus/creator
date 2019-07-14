package poe.creator.constants;

public enum  MainConstants {

    ITEM_SESSION_CODE("Item");

    private final String code;

    MainConstants(String code) {
        this.code = code;
    }

    public boolean equals(String code) {
        return getCode().equals(code);
    }

    public String getCode() {
        return this.code;
    }
}
