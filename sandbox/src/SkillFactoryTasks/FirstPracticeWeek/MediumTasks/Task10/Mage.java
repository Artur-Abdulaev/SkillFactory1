package SkillFactoryTasks.FirstPracticeWeek.MediumTasks.Task10;

public class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    String fight(Mage mage) {
        switch (mageType(mage)) {
            case "fire":
                if (type.equals("ice")) {
                    return mage.name;
                } else if (type.equals("earth")) {
                    return name;
                } else {
                    if (mage.level > level) {
                        return mage.name;
                    } else if (mage.level < level) {
                        return name;
                    } else if (mage.damage > damage) {
                        return mage.name;
                    } else if (mage.damage < damage) {
                        return name;
                    } else return "draw";
                }

            case "ice":
                if (type.equals("earth")) {
                    return mage.name;
                } else if (type.equals("fire")) {
                    return name;
                } else {
                    if (mage.level > level) {
                        return mage.name;
                    } else if (mage.level < level) {
                        return name;
                    } else if (mage.damage > damage) {
                        return mage.name;
                    } else if (mage.damage < damage) {
                        return name;
                    } else return "draw";
                }


            case "earth":
                if (type.equals("fire")) {
                    return mage.name;
                } else if (type.equals("ice")) {
                    return name;
                } else {
                    if (mage.level > level) {
                        return mage.name;
                    } else if (mage.level < level) {
                        return name;
                    } else if (mage.damage > damage) {
                        return mage.name;
                    } else if (mage.damage < damage) {
                        return name;
                    } else return "draw";
                }
        }
        return "draw";
    }


    String mageType(Mage mage) {
        return mage.type;
    }
}
