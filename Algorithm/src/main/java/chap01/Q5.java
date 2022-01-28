package chap01;

public class Q5 {
    static int med3 (int a, int b, int c){
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
/*    메서드를 이렇게 작성했을 경우 효율이 떨어짐
            첫 번째 if문에서 같다는 수식으로 인해 정수 3개가 모두 동일할 경우를 걸러내지 못한다.*/
}
