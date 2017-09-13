import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az inputot: ");

        StringBuilder str = new StringBuilder();
        str.append(scanner.nextLine());

        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " " };
        String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "|" };

        System.out.println(str);

        morse(String.valueOf(str),alpha,dottie);
    }

    private static void morse(String scan,String[] alpha,String[] dottie){
        char [] stringArray = scan.toCharArray();

        for(int i = 0; i < dottie.length;i++){
            if(String.valueOf(stringArray[0]).equals(dottie[i])){
                morseToString(stringArray,alpha,dottie);
                break;
            }else{
                stringToMorse(stringArray,alpha,dottie);
                break;
            }
        }
    }

    private static void stringToMorse(char[] stringArray,String[] alpha,String[] dottie){
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                String cica = String.valueOf(stringArray[i]);
                if(cica.equals(alpha[j])){
                    str.append(dottie[j]);
                }
            }
        }
        System.out.println(str);
    }

    private static void morseToString(char[] stringArray,String[] alpha,String[] dottie){
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            if(!"|".equals(String.valueOf(stringArray[i]))){
                str.append(stringArray[i]);
            }else{
                for (int j = 0; j < dottie.length; j++) {
                    if(String.valueOf(str).equals(dottie[j])){
                        System.out.println(alpha[j]);
                    }
                }
            }
        }
    }
}