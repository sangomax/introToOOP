package week1.forloops;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(verifyNumber(i));
        }
    }

    public static String verifyNumber(int num) {
        String answer = "";

        if (num % 3 == 0) {
            answer += "Fizz";
        }

        if (num % 5 == 0) {
            answer += "Buzz";
        }

        if (answer == "") {
            return num +"";
        } else {
            return answer;
        }
    }
}
