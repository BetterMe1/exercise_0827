package exercise.exercise_0827;

/**
 * @Description:滴滴笔试
 * @Author:Anan
 * @Date:2019/8/27
 */

//项目分配
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N+1][M+1];
        for(int i=1; i<=N;i++){
            for(int j=1;j<=M; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int j=1;j<=M; j++){
            int max = A[1][1];
            for(int i=1;i<=N;i++){
                if(A[i][j]> max){
                    max = A[i][j];
                }
            }
            count += max;
        }
        System.out.println(count);
    }
}

//几何选择
//通过36%
/*
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
        long result = 0;
        for(int i=0; i<n; i++){
            result+=num[i];
        }
        int gap = 2;
        while(n/gap >=3){
            long max = 0;
            for(int i=0; i<n; i+=gap){
                max+=num[i];
            }
            if(max > result){
                result = max;
            }
            gap*=2;
        }
        System.out.println(result);
    }
}*/
