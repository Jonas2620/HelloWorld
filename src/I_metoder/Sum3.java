package I_metoder;

public class Sum3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 18;
        int sum;

        sum=plus(a, b, c);
        System.out.println("Summen er "+sum);
    }
    static int plus(int x, int y, int z){
        int result = x + y + z;
        return result;
    }
}
