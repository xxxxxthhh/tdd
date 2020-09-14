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
            if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
                vowelCount ++;
            }
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
}
