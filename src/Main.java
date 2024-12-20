public class Main {
    public static void main (String[] agrs) {

       Boss boss = new Boss(  550, 50, WeaponType.FIREARMS);
        System.out.println("Boss info; " + boss.printInfo());

        Skeleton skeleton = new Skeleton( 680,65, WeaponType.LASE, 15);
        Skeleton skeleton1 = new Skeleton( 650, 70, WeaponType.WEAPONS, 20);

        System.out.println("Skeleton info; " + skeleton.printInfo() );
        System.out.println("skeleton1 info; " + skeleton1.printInfo());


    }
}
