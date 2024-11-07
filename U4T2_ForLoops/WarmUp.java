package U4T2_ForLoops;

public class WarmUp {
    public static void main(String[] args) {
        String str = "";
        String str2 = "";

        for (int i = 1; i <= 10; i++) {
            str += i + " ";
        }
        System.out.println(str);

        for (int i = 1; i < 11; i++) {
            str2 += i + " ";
        }
        System.out.println(str2);

        str = "";
        for (int i = 15; i > 0; i--) {
            str += i + " ";
        }
        System.out.println(str);

        str2 = "";
        for (int i = 15; i >= 1; i--) {
            str2 += i + " ";
        }
        System.out.println(str2);

        str = "";
        for (int i = 0; i <= 20; i+=2) {
            str += i + " ";
        }
        System.out.println(str);

        str2 = "";
        for (int i = 0; i <= 20; i++) {
            if (i != 0){
                i++;
            }
            str2 += i + " ";
        }
        System.out.println(str2);
    }
}