import java.util.ArrayList;
import java.util.stream.Stream;

public class Mommifier {

    public static void main(){
        System.out.println("cool");
    }
    public boolean vowelRateSatisfiy(String s){
        // return true;
        int stringLength = s.length();
        float vowelsRate;

        int vowelCount = 0;

        for (int i = 0; i < stringLength; i++){
            String ch = String.valueOf(s.charAt(i)).toLowerCase();
            vowelCount = getVowelCount(vowelCount, ch);
        }
        // System.out.println(vowelCount);

        vowelsRate = (float) vowelCount / stringLength;
        // System.out.println(vowelsRate);

        if (vowelsRate > 0.3){
            return true;
        }else {
            return false;
        }
    }

    private int getVowelCount(int vowelCount, String ch) {
        if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            vowelCount ++;
        }
        return vowelCount;
    }

    public String insertMommy(String s) {

        if (vowelRateSatisfiy(s)){
            String insertedString="";
            for (int i = 0; i < s.length()-1; i++){
                String prev = s.valueOf(s.charAt(i));
                String next = s.valueOf(s.charAt(i+1));
                insertedString += prev;
                //两个相同的元音，中间进行插入
                if (getVowelCount(0,prev) != 0 && prev.equals(next)){
                    insertedString+="mommy";
                }
            }
            insertedString += s.charAt(s.length()-1);
            return insertedString;
        }else {
            return s;
        }
    }

}
