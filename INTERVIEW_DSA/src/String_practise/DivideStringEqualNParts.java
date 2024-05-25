package String_practise;

public class DivideStringEqualNParts {
    public static void main(String[] args) {
        String inputString = "ThisIsAStringToDivide";
        int numberOfParts = 3;

        String[] parts = divideStringIntoEqualParts(inputString, numberOfParts);

        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static String[] divideStringIntoEqualParts(String input,int N){
        int partLen = input.length()/N;
        String[] strArr = new String[N];
        return strArr;

    }
}
