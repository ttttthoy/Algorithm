package programmars;
//숫자 문자열과 영단어
public class num_eng {
    public int solution(String s){
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        System.out.print(s);
        if(s != null) {
            for(int i = 0; i<num.length; i++){
                s = s.replace(eng[i], num[i]);
            }
        }
        return Integer.parseInt(s);
    }
}
