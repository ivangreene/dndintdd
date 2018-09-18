import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Abilities {

    private static Map<Integer, Integer> modifiers = ImmutableMap.<Integer, Integer>builder()
            .put(1, -5)
            .put(2, -4)
            .put(3, -4)
            .put(4, -3)
            .put(5, -3)
            .put(6, -2)
            .put(7, -2)
            .put(8, -1)
            .put(9, -1)
            .put(10, 0)
            .put(11, 0)
            .put(12, 1)
            .put(13, 1)
            .put(14, 2)
            .put(15, 2)
            .put(16, 3)
            .put(17, 3)
            .put(18, 4)
            .put(19, 4)
            .put(20, 5)
            .build();

    public static int modifierForAbility(int abilityLevel) {
        return modifiers.get(abilityLevel);
    }

    private int strength;
    private int dexterity;
    private int constitution;
    private int wisdom;
    private int intelligence;
    private int charisma;

    public Abilities() {
        this.strength = 10;
        this.dexterity = 10;
        this.constitution = 10;
        this.wisdom = 10;
        this.intelligence = 10;
        this.charisma = 10;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getStrengthModifier() {
        return modifierForAbility(strength);
    }

    public int getDexterityModifier() {
        return modifierForAbility(dexterity);
    }

    public int getConstitutionModifier() {
        return modifierForAbility(constitution);
    }

    public int getWisdomModifier() {
        return modifierForAbility(wisdom);
    }

    public int getIntelligenceModifier() {
        return modifierForAbility(intelligence);
    }

    public int getCharismaModifier() {
        return modifierForAbility(charisma);
    }
}
