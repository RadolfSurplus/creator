package poe.creator.data.models.modifiers.explicits;

import poe.creator.data.models.Base;
import poe.creator.data.models.modifiers.Explicit;

import java.util.Collection;

public class Suffix extends Explicit {

    public Suffix(String description, Integer itemLevel, String name, Collection<Base> relevantBaseCollection) {
        super(description, itemLevel, name, relevantBaseCollection);
    }
}
