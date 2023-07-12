import java.util.*;
public class _1011{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt(); //테스트 개수 입력받기
        int distance[] = new int[user];
        int count = 0;

        for(int i = 0 ; i<user ; i++){ //테스트 개수만큼 x, y값 입력받기
            int x = sc.nextInt();
            int y = sc.nextInt();

            distance[i]=y-x; //y에서 x를 뺀 값이 거리이고 이 거리를 distance 배열에 저장
        }

        for(int i = 0 ; i < user ; i++){ //테스트 개수만큼 반복
            if(distance[i] == 0) count = 0; //거리가 0이라면 움직일 필요가 없으므로 count = 0
            else if(distance[i] == 1) count = 1; //거리가 1이면 1번만 움직이면 되므로 count = 1
            else if(distance[i]==2)count=2; //거리가 2라면 '1 1' 이렇게 두 번 움직이면 되므로 count = 2
            else if(distance[i]<0)System.out.println("잘못된 형식"); //음수라면 y값이 더 큰 것으로 입력된 것으로 잘못된 형식
            else{ //distance >= 3인 경우
                int standard = 2; //기준 => 이 기준은 우주선이 이동한 최대 거리
                int clock = 0; //클록
                int time = 0; //시간
                count = 3; //count는 3부터 시작
                for(int j = 3 ; j < distance[i];j++){
                    time++; //거리 1을 움직이는 동안 시간 1이 증가한다고 생각.
                    //이 시간은 우주선이 한번 움직이는 동안 걸리는 시간임
                    if(time==standard){ //시간이 최대로 이동해야하는 거리와 같다면
                        count++; //새로 움직여야 하므로 count에 1을 추가
                        time=0; //시간이 standard를 넘으면 안되므로 다시 0으로 초기화
                        clock++; //클록 1 추가
                    }
                    if(clock==2){ //만약 클록이 2라면 최대 거리를 1 증가시켜줘야 한다는 소리
                        clock=0; //다시 0으로 초기화
                        standard++; //이동해야 하는 최대 거리를 1 증가
                    }
                }
                System.out.println(count); //count 출력
            }
        }
    }
}