package poe.creator.data.models.modifiers;

public abstract class Modifier {

    private String description;

    Modifier(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
