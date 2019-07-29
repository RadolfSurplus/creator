package poe.creator.data.models;

public class Type {

    private String name;
    private Base relevantBase;

    public Type() {
    }

    public Type(String name, Base relevantBase) {
        this.name = name;
        this.relevantBase = relevantBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base getRelevantBase() {
        return relevantBase;
    }

    public void setRelevantBase(Base relevantBase) {
        this.relevantBase = relevantBase;
    }
}
