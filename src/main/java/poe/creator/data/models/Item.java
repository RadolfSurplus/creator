package poe.creator.data.models;

import java.util.Collection;

public class Item {

    private Collection<String> prefix;
    private Collection<String> suffix;

    public Item() {
    }

    public Item(Collection<String> prefix, Collection<String> suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
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
