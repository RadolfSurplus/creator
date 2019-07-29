package poe.creator.data.models.modifiers;

import poe.creator.data.models.Type;

import java.util.List;

public class Implicit extends Modifier {

    private Type relevantType;

    public Implicit(String description, List<Modifier.ModifierData> modifierData, Type relevantType) {
        super(description, modifierData);
        this.relevantType = relevantType;
    }

    public Type getRelevantType() {
        return relevantType;
    }

    public void setRelevantType(Type relevantType) {
        this.relevantType = relevantType;
    }
}
