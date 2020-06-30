package string_and_regex.bai_tap.bai2_regex_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {
    private Pattern pattern;
    private Matcher matcher;
    private String REGEX_PHONE="84\\d{9,10}";
    public RegexPhone(){
        pattern=Pattern.compile(REGEX_PHONE);
    }
    public boolean validate(String regex){
         matcher=pattern.matcher(regex);
         return matcher.matches();
    }

    public static void main(String[] args) {
        RegexPhone regexPhone=new RegexPhone();
        System.out.println( regexPhone.validate("84898605263"));;
    }
}
