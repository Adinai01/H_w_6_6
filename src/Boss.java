public class Boss extends GameEntity  {
    private WeaponType weapon;

    public Boss(int health, int damage, WeaponType weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Health: " + this.getHealth() + "\nDamage: " +
                this.getDamage() + "\nWeapon: " + this.getWeapon();
    }

}
