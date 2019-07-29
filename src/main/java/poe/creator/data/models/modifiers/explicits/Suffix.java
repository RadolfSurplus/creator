package poe.creator.data.models.modifiers.explicits;

import poe.creator.data.models.Base;
import poe.creator.data.models.modifiers.Explicit;

import java.util.Collection;
import java.util.List;

public class Suffix extends Explicit {

    public Suffix(String template, List<ModifierData> modifierData, Integer itemLevel, String name, Collection<Base> relevantBaseCollection) {
        super(template, modifierData, itemLevel, name, relevantBaseCollection);
    }
}
