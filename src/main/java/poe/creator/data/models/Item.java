package poe.creator.data.models;

import poe.creator.data.models.modifiers.Implicit;
import poe.creator.data.models.modifiers.explicits.Prefix;
import poe.creator.data.models.modifiers.explicits.Suffix;

import java.util.Collection;

public class Item {

    private Base base;
    private Type type;
    private Implicit implicit;
    private Collection<Prefix> prefixCollection;
    private Collection<Suffix> suffixCollection;

    public Item() {
    }

    public Item(Base base, Type type, Implicit implicit, Collection<Prefix> prefixCollection, Collection<Suffix> suffixCollection) {
        this.base = base;
        this.type = type;
        this.implicit = implicit;
        this.prefixCollection = prefixCollection;
        this.suffixCollection = suffixCollection;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Implicit getImplicit() {
        return implicit;
    }

    public void setImplicit(Implicit implicit) {
        this.implicit = implicit;
    }

    public Collection<Prefix> getPrefixCollection() {
        return prefixCollection;
    }

    public void setPrefixCollection(Collection<Prefix> prefixCollection) {
        this.prefixCollection = prefixCollection;
    }

    public Collection<Suffix> getSuffixCollection() {
        return suffixCollection;
    }

    public void setSuffixCollection(Collection<Suffix> suffixCollection) {
        this.suffixCollection = suffixCollection;
    }
}
