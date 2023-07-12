import java.math.BigInteger;
import java.util.*;
public class _1010 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt(); //테스트 케이스의 수
        int N[] = new int[test];
        int M[] = new int[test];
        for(int i = 0 ; i<test ; i++){//테스트 케이스의 수만큼 게이트 입력
            N[i] = sc.nextInt();
            M[i] = sc.nextInt();
        }

        BigInteger denominator[] = new BigInteger[test];
        BigInteger numerator[] = new BigInteger[test];

        for(int i = 0 ; i<test ; i++){ //BigInteger 객체 초기화
            denominator[i] = new BigInteger("1");//denominator = 분모(1로 초기화)
            numerator[i]=new BigInteger("1");//numerator = 분자(1로 초기화)
        }

        for(int i = 0 ; i < test ; i++){ //테스트 케이스의 수만큼 반복
            for(int j = M[i]-N[i]+1 ; j<=M[i] ; j++){
                BigInteger Bj = BigInteger.valueOf(j);
                numerator[i] = numerator[i].multiply(Bj); //분자 구하기
            }
            for(int j = 1 ; j <= N[i] ; j++){
                BigInteger Bj = BigInteger.valueOf(j);
                denominator[i] = denominator[i].multiply(Bj); //분모 구하기
            }

            System.out.println(numerator[i].divide(denominator[i])); //결과값 출력
        }
    }
}
