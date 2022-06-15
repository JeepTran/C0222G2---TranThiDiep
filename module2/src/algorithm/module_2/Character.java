package algorithm.module_2;

public class Character {
    String solution(String str) {
        String string = "";
        string += str.toLowerCase().charAt(0);
        for (int i = 1; i<str.length();i++){
            if (str.charAt(i) < 'a') {
                string+=" ";
            }
            string+=str.toLowerCase().charAt(i);
        }
        return string;
    }
}
