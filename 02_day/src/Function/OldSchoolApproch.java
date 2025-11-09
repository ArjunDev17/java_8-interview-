package Function;

import java.util.function.Function;
class StringLengthFunction implements Function<String,Integer>{
    @Override
    public Integer apply(String str){
        if(str==null)return 0;
        return str.length();
    }
}
public class OldSchoolApproch  {
    public static void main(String[] args) {
        Function<String,Integer> stringIntegerFunction=new StringLengthFunction();
        Integer codeNeeTi = stringIntegerFunction.apply("CodeNeeTi");
        System.out.println("Length of CodeNeeTi is :"+codeNeeTi);
    }
}
