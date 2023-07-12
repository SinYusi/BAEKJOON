import java.util.*;
public class _1011_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();
        int distance[] = new int[user];
        int count = 0;

        for(int i = 0 ; i<user;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            distance[i]=y-x;
        }

        for(int i = 0 ; i < user ; i++){
            int max = (int)Math.sqrt(distance[i]); //max를 거리의 제곱근으로 저장 후 소수점 첫째자리에서 내림

            if(max == Math.sqrt(distance[i])) count = max * 2 - 1;
            else if(distance[i]<=max * max + max) count = max * 2;
            else count = max * 2 + 1;

            System.out.println(count);
        }
    }
}
