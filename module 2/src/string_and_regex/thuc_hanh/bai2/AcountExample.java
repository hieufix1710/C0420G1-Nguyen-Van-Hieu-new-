package string_and_regex.thuc_hanh.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcountExample {

    private String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AcountExample(){

    }
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();

    }

    public static void main(String[] args) {
        AcountExample acountExample=new AcountExample();
        System.out.println( acountExample.validate("123abc_"));;
    }
}
