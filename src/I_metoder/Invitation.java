package I_metoder;

public class Invitation {
    public static void main(String[] args) {
       printInvitation("Ole", "Fodbold");
       printInvitation("Pia", "Playstation 5");
       printInvitation("Ulla", "Kage");
    }

    static void printInvitation(String name, String gave) {
        System.out.println("Kære " +name);
        System.out.println("Det ville glæde mig at se dig til mind fødselsdag");
        System.out.println("Onsdag 4/6 kl 14:00");
        System.out.println("Venlig hilsen");
        System.out.println("Bjørn");
        System.out.println("PS: medbring "+gave);

    }
}
