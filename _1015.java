import java.util.*;
public class _1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] P = new int[N];
        int[] check = new int[N];
        for(int i = 0 ; i < N ; i++) {
            A[i] = sc.nextInt(); //배열 A입력받기
            B[i] = A[i]; //배열 A 그대로 B에 저장
            check[i] = 0; //A[P[i]] = B[i] 법칙을 적용했는지 확인하기 위한 배열
        }
        Arrays.sort(B); //B 정렬
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(B[j] == A[i] && check[j] == 0) { //정리 3번 법칙 적용
                    P[i] = j;
                    check[j] = 1;
                    break;
                }
            }
        }

        for(int i = 0 ; i < N ; i++)
            System.out.print(P[i]+ " ");
    }
}
