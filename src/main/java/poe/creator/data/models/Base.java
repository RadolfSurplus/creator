package poe.creator.data.models;

public enum Base {

    HELMET("Helmet"),
    BODY_ARMOUR("Body Armour"),
    GlOVES("Gloves"),
    BOOTS("Boots"),
    SHIELD("Shield"),

    BELT("Belt"),
    RING("Ring"),
    AMULET("Amulet"),
    QUIVER("Quiver"),

    AXE("Axe"),
    BOW("Bow"),
    CLAW("Claw"),
    DAGGER("Dagger"),
    MACE("Mace"),
    STAFF("Staff"),
    SWORD("Sword"),
    WAND("Wand");

    private String name;

    Base(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
