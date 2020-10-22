package basics;


import java.util.Scanner;

public class ExercisesPersonal {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
//            System.out.print(i + "\t");
            if (i == 10) {
//                System.out.println();
            }
        }
        System.out.println();
        int y = 2;
        while (y <= 100) {
//            System.out.print(y + "\t");
            y += 2;
        }
//        System.out.println();

        int arr[] = new int[5];

//        System.out.println(Arrays.toString(arr));
//        int arr2[] = new int[5];

        String brand = "Panasonic";

        for (char brandCharac : brand.toCharArray()) {
//            System.out.println(brandCharac);
        }

        for (int i = 0; i < brand.length(); i++) {
//            System.out.println(brand.substring(i, i + 1));
//            System.out.println(brand.charAt(i));
        }

//        System.out.println(brand.toLowerCase());
//        System.out.println(brand.toUpperCase());

//        System.out.println(addTwo(10, 20));

        Scanner in = new Scanner(System.in);

        Object t = 9, s = "teste", r = true, v = 3.56;

        System.out.println(t.getClass());
        System.out.println(s.getClass());
        System.out.println(r.getClass());
        System.out.println(v.getClass());

        System.out.println("Enter the language code: ");
        String countryCody = in.nextLine();
        switch (countryCody) {
            case "en":
                System.out.println("I Love you");
                break;
            case "pt-br":
                System.out.println("Eu amo você");
                break;
            case "es":
                System.out.println("Te amo");
                break;
            case "jp":
                System.out.println("Aishiteru");
                break;
            case "kr":
                System.out.println("Saranghae");
                break;
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("Country  Cody not Supported");
                break;


        }

    }

    public static int addTwo(int a, int b) {
        return a + b;
    }
}
