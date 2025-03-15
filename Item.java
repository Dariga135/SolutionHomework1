class Item {
    private String name;
    private int healthBoost;
    private int experienceBoost;

    public Item(String name, int healthBoost, int experienceBoost) {
        this.name = name;
        this.healthBoost = healthBoost;
        this.experienceBoost = experienceBoost;
    }

    public String getName() {
        return name;
    }

    public int getHealthBoost() {
        return healthBoost;
    }

    public int getExperienceBoost() {
        return experienceBoost;
    }
}

