package huawei.interview;

public class Main {
    static int invert(int x){
        if(x ==0){
            return 0;
        }
        int result = 0;
        String str = x+"";
        boolean isPostive = true;
        if (str.charAt(0) == '-'){
            isPostive = false;
        }
        StringBuilder res = new StringBuilder();
        if(isPostive){
            // 正数以及0
            for (int i = 0; i < str.length(); i++) {
                res.append(str.charAt(str.length()-i-1));
            }
        }else{
            for (int i = 1; i < str.length(); i++) {
                res.append(str.charAt(str.length()-i));
            }
        }
        // 去除res开头的0
        int lengthOfZeros = 0;

        while (res.charAt(lengthOfZeros) == '0'){
            lengthOfZeros ++;
        }
        String resFinal = res.substring(lengthOfZeros);

        //处理超出范围的情况
        if(resFinal.length()==10&&isPostive&& resFinal.compareTo(""+2147483647)>0 ||resFinal.length()==10&&resFinal.compareTo("2147483648")>0){
            return 0;
        }
        result = Integer.parseInt(resFinal);
        if(!isPostive){
            result = 0-result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(invert(123));
        System.out.println(invert(-123));
        System.out.println(invert(120));
        System.out.println(invert(0));
        System.out.println(Integer.MAX_VALUE);
        System.out.println((invert(Integer.MAX_VALUE)));
        //-2147483648
        System.out.println(Integer.MIN_VALUE);
        System.out.println((invert(Integer.MIN_VALUE)));

    }
}
