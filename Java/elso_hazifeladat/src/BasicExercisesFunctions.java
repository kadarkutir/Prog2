import java.util.Locale;

public class BasicExercisesFunctions {

    //1. feladat
    static void OnetoHundred(){
        for(int i = 0; i<101 ; i++)
            System.out.println(i);
    }

    //2. feladat
    static void FizzBuzz(){
        for(int i = 1; i<101; i++){
            if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
            else if(i%5==0) System.out.println("Buzz");
            else if(i%3==0) System.out.println("Fizz");
        }
    }

    //3. feladat
    static void Prime(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    //4. feladat
    static void FibonacciNumbers(int n){
        int f[] = new int[n + 2];

        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) f[i] = f[i - 1] + f[i - 2];

        for (int j = 0; j < n; j++) System.out.print(f[j] + " ");
    }

    //5. feladat
    static void gcdCal(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Greatest Common Divisor of " + n1 + " and " + n2 +" is " + gcd + ".");
    }

    //6. feladat
    static void Palindrome(String text) {
        String clean = text.toLowerCase();
        boolean flag = false;
        int forward = 0;
        int backward = clean.length() - 1;

        while (forward < backward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            if (forwardChar != backwardChar) flag = false;
            else flag = true;
        }

        if (!flag) System.out.println(text + " is not a Palindrome word.");
        else System.out.println(text + " is a Palindrome word.");
    }

        //7.feladat
        static void Subs(String text){
            String clean = text.toLowerCase();
            int counter = 0;

            while(counter<clean.length()) {
                if(clean.charAt(counter) =='a') break;
                counter++;
            }

            if(counter<clean.length()) System.out.println(clean.substring(counter,counter += 4));
            else System.out.println("");
        }

        //Part II

        //1. feladat
        static void StringFind(String text){
            String clean = text.toLowerCase();

            for(int i = 0; i < clean.length(); i++) {

                char textchar = clean.charAt(i);

                if(textchar =='a') System.out.println("a found");
                else if(textchar == 'b') System.out.println("b found");
                else if(textchar == 'c') System.out.println("c found");
                else System.out.println(textchar);
            }
        }

        //2. feladat
        static void ArrayMax(int [] array){
            int max = 0;

            for(int i=0; i<array.length; i++ ) {
                if(array[i]>max) {
                    max = array[i];
                }
            }
            System.out.println("The Largest number in the array is " + max);
        }

        //3. feladat
        static void ReverseNumber(int num){
            int reversed = 0;

            while(num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;

                num /= 10;
            }

            System.out.println("The reversed number: " + reversed);
        }

        //4. feladat
        static void OperatorNums(char operator, int num1, int num2){

            if(operator == '+') System.out.println("The addition of " + num1 + " and " + num2 + " is " + (num1+num2));
            else if (operator == '-') System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1-num2));
            else if (operator == '/') System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1/num2));
            else if (operator == '*') System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
            else System.out.println("Not a proper operator");

        }

        //5. feladat
        static void StringX(String text){

            char[] chars =  text.toCharArray();

            for(int i = 1;i < text.length(); i+=2){
                chars[i]='x';
            }

            for(int j = 4; j< chars.length; j+=5){
                chars[j]='X';
            }

            for(int e = 0; e < chars.length; e++) System.out.print(chars[e]);
        }
}
