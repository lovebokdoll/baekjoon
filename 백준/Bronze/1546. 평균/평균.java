import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 점수 배열에 담기
        int num = sc.nextInt();
        //타입[] 변수 = new 타입[길이]
        double[] score = new double[num]; //num개의 요소를 가짐
        /*연속적인 데이터를 담을 수 있음 => 성적을 저장하고 평균값을 구한다. 
          많은 양의 데이터를 다루고 싶은 경우 배열에 담아 사용 */
        for(int i=0; i<num; i++){
            score[i]=sc.nextInt();
        }
        //배열안에서 최댓값 찾기
        double max =0;
        for(int i=0; i<num; i++){
            if(score[i]>max){
                max=score[i];
            }
        }
        // 새로운 평균 내기
        double sum =0;
          for(int i=0; i<num; i++){
            sum += (score[i]/max)*100; //점수들을 더함
        }
            System.out.println(sum/num); //점수 / 갯수 => 새로운 평균
        }
    }
