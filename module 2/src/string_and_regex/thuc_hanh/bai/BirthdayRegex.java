package string_and_regex.thuc_hanh.bai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdayRegex {
    private  Pattern pattern;
    private Matcher matcher;
    private String BIRTHDAY_REGEX="^\\d{2}-\\d{2}-\\d{4}$";
            public BirthdayRegex(){
        pattern= Pattern.compile(BIRTHDAY_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        BirthdayRegex birthdayRegex=new BirthdayRegex();
        System.out.println( birthdayRegex.validate("12-12-1999"));
    }
}
