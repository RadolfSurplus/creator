package poe.creator.data.models;

import poe.creator.constants.ItemBase;

import java.util.Collection;

public class Item {

    private ItemBase base;
    private Collection<String> prefix;
    private Collection<String> suffix;

    public Item() {
    }

    public Item(ItemBase base, Collection<String> prefix, Collection<String> suffix) {
        this.base = base;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public ItemBase getBase() {
        return base;
    }

    public void setBase(ItemBase base) {
        this.base = base;
    }

    public Collection<String> getPrefix() {
        return prefix;
    }

    public void setPrefix(Collection<String> prefix) {
        this.prefix = prefix;
    }

    public Collection<String> getSuffix() {
        return suffix;
    }

    public void setSuffix(Collection<String> suffix) {
        this.suffix = suffix;
    }
}
