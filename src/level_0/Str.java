package level_0;

import java.util.Scanner;

public class Str {

    public static void main(Str[] args) {

        //문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
        //1 ≤ str의 길이 ≤ 1,000,000
        // str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.length()>=1 && a.length()<=1000000)
        {
            System.out.println(a);
        }
        
    }
    
}
