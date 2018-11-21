package aircraftcarrier;

public class Aircraft {

    int ammo;
    int maxAmmo;
    int baseDmg;
    boolean priority;

    public Aircraft() {
        /*this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
        this.priority = priority;*/
    }

    public Aircraft(int ammo, int maxAmmo, int baseDmg, boolean priority) {
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
        this.priority = priority;
    }

    public int fight() {
        int dmg = this.ammo * this.baseDmg;
        this.ammo = 0;
        return dmg;
    }

    public int refill(int supply) {
        this.ammo = this.maxAmmo;
        int remainder = supply - (this.maxAmmo - this.ammo);
        return remainder;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + this.getClass().getSimpleName() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDmg + ", All Damage: " + this.fight();
    }

    public boolean isPriority() {
        return priority;
    }

}
