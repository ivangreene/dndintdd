public class Character {
    private String name;
    private Alignment alignment;
    private int armorClass;
    private int hitPoints;

    public Character() {
        this.armorClass = 10;
        this.hitPoints = 5;
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

    public void setAlignment(String alignment) {
        this.alignment = Alignment.valueOf(alignment);
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack(Character character, int roll) {
        character.receiveDamage(roll);
    }

    public void receiveDamage(int roll) {
        if (roll >= this.getArmorClass()) {
            if (roll == 20) {
                this.setHitPoints(this.getHitPoints() - 2);
            } else {
                this.setHitPoints(this.getHitPoints() - 1);
            }
        }
    }
}
