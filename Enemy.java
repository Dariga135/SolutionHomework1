class Enemy {
    private String type;
    private int damage;
    private int experienceReward;

    public Enemy(String type, int damage, int experienceReward) {
        this.type = type;
        this.damage = damage;
        this.experienceReward = experienceReward;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getExperienceReward() {
        return experienceReward;
    }
}