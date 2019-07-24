package poe.creator.data.models.modifiers;

import poe.creator.data.models.Base;

import java.util.Collection;

public abstract class Explicit extends Modifier {

    private Integer itemLevel;
    private String name;
    private Collection<Base> relevantBaseCollection;

    public Explicit(String description, Integer itemLevel, String name, Collection<Base> relevantBaseCollection) {
        super(description);
        this.itemLevel = itemLevel;
        this.name = name;
        this.relevantBaseCollection = relevantBaseCollection;
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Base> getRelevantBaseCollection() {
        return relevantBaseCollection;
    }

    public void setRelevantBaseCollection(Collection<Base> relevantBaseCollection) {
        this.relevantBaseCollection = relevantBaseCollection;
    }
}
