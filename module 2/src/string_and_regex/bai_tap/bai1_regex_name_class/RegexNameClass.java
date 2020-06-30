package string_and_regex.bai_tap.bai1_regex_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNameClass {
    private Pattern pattern;
    private Matcher matcher;
    private String NAME_CLASS="[A-Z]\\d{2}\\d{2}[A-Z]\\d";
    public RegexNameClass(){
        pattern=Pattern.compile(NAME_CLASS);
    }
    public boolean validate(String regex){
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexNameClass regexNameClass=new RegexNameClass();
        System.out.println(regexNameClass.validate("C0420G1"));;
    }
}
