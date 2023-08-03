import java.lang.reflect.Array;
import java.util.Scanner;

public class Level_0 {

    public void str() {

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

    public void intplus() {
    
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b = sc.nextInt();
    
            if(a>=-100000 && b<=100000)
            {
                System.out.println("a = "+a);
                System.out.println("b = "+b);
            }
            
    }

    // 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
    public void plus() {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>=1 && b<=100)
            {
                System.out.println(a+ " + "+ b +" = "+(a+b) );
            }
        
    }

    public void strLoop() {
        //문자열 str과 정수 n이 주어집니다.
        // str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
    
        // 1 ≤ str의 길이 ≤ 10
        // 1 ≤ n ≤ 5
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int n = sc.nextInt();
        
        if(str.length()>=1 && str.length()<=10)
        {
            if(n>=1 && n<=5)
            {
                for(int i=0; i<n; i++)
                {
                    System.out.print(str);
                }
                
            }
        }
        System.out.println("");
        System.out.println("other");
        System.out.println(str.repeat(n));
        
    }

    //영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
    public void toLowerCase() {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String answer="";

            if(str.length()>=1 && str.length()<20 )
            {
                char[] arry = str.toCharArray();
            
            // a ~ z 97 ~122
            // A ~ Z 65~90
            
            String temp ="";
            //char 배열로 만들어서 하나씩 꺼내고 (asci 코드 사용) 대소문자 변환하기.
            for(int i = 0; i<arry.length; i++) {
                if( arry[i] >= 97 && arry[i] <= 122 ) {
                    temp = arry[i] + "";
                    answer += temp.toUpperCase();
                } else if( arry[i] >=65 && arry[i] <= 90){
                    temp = arry[i] + "";
                    answer += temp.toLowerCase();
                }
            }
            System.out.println(answer);
            }

            //example
            // for(Character c : str.toCharArray()){
            //     if(Character.isUpperCase(c)){
            //         //stack.push(Character.toLowerCase(c));
            //         answer += Character.toLowerCase(c);
            //     }
            //     else if(Character.isLowerCase(c)){
            //         //stack.push(Character.toUpperCase(c));
            //         answer += Character.toUpperCase(c);
            //     }
            // } 
            // System.out.println(answer);
        
    }

    //특수문자 출력
    public void specialString() {
        System.out.print("!@#$%^&*(\\'\"<>?:;");
        
    }

    //문자열 돌리기
    public void substring(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(a.length()>=1 && a.length()<=10)
        {
            for(int i=0; i<a.length(); i++)
            {
                System.out.println(a.substring(i,i+1));
            }

            //입력받은 a의 값을 char(한글자)로 배열 저장한 것을 ch라고 저장한다. 
            // 그리고 그것을 println()한다. 
            //println은 다음 줄로 넘어가는거라서 한 줄씩 출력된다.
            // if(a.length()>=1 && a.length()<=10)
            // {
            //     for (char ch : a.toCharArray())
            //     System.out.println(ch);
            // }
        }
    }

    //홀짝 구분하기
    //자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 
    //홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
    public void oddeven(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=1 && n<=1000)
        {
            if(n%2==0){
                System.out.println(n+" is even");
            } else if(n%2==1)
            {
                System.out.println(n+" is odd");
            }
        }
    }

    //문자열 겹쳐쓰기
    //쥰내 어려움.
    public void solution() {
        String answer = "";
        String my_string= "He11oWor1d";
        String overwrite_string = "LLOWORL";
        int s = 2;

        String a = my_string.substring(0,s);
        String b = my_string.substring(s+overwrite_string.length());
        
        answer = a+overwrite_string+b;
        System.out.println(answer);
        // String aa = my_string.substring(s,s+overwrite_string.length());
        // System.out.println(aa);
        // answer = my_string.replaceAll(aa, overwrite_string);
        // System.out.println(answer);
    }



    
}
