public class Character {
    private String name;
    private Alignment alignment;
    private Abilities abilities;
    private int armorClass;
    private int hitPoints;

    public Character() {
        this.armorClass = 10;
        this.hitPoints = 5;
        this.abilities = new Abilities();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAlignment(String alignment) {
        this.alignment = Alignment.valueOf(alignment);
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
