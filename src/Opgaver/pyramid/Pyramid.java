package Opgaver.pyramid;
import java.util.Random;

class Pyramid {
    private int side;
    private int height;

    public Pyramid(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public double calculateVolume() {
        return (side * side * height) / 4;
    }

    @Override
    public String toString() {
        return "Pyramid - Side: " + side + ", Height: " + height;
    }
}

class PyramidsUdregn {
    public static void main(String[] args) {
        Random rand = new Random();

        Pyramid pyramid1 = new Pyramid(1 + rand.nextInt(25), 1 + rand.nextInt(25));
        Pyramid pyramid2 = new Pyramid(1 + rand.nextInt(25), 1 + rand.nextInt(25));
        Pyramid pyramid3 = new Pyramid(1 + rand.nextInt(25), 1 + rand.nextInt(25));

        System.out.println(pyramid1.toString());
        System.out.println("Volume: " + pyramid1.calculateVolume());

        System.out.println(pyramid2.toString());
        System.out.println("Volume: " + pyramid2.calculateVolume());

        System.out.println(pyramid3.toString());
        System.out.println("Volume: " + pyramid3.calculateVolume());
    }
}
