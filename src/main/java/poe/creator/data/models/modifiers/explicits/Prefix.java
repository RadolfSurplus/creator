package poe.creator.data.models.modifiers.explicits;

import poe.creator.data.models.Base;
import poe.creator.data.models.modifiers.Explicit;
import poe.creator.data.models.modifiers.Modifier;

import java.util.Collection;
import java.util.List;

public class Prefix extends Explicit {

    public Prefix(String template, List<Modifier.ModifierData> modifierData, Integer itemLevel, String name, Collection<Base> relevantBaseCollection) {
        super(template, modifierData, itemLevel, name, relevantBaseCollection);
    }
}
