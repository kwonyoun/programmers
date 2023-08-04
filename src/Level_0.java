
import java.util.Scanner;

public class Level_0 {

    //생성자
    public Level_0 ()
    {
        //문자열안에 문자열
        // String str1="ppprrrogrammers";
        // String str2="pppp";
        // int a = stringinstring( str1,  str2);
        // System.out.println(a);

        //문자열 섞기
        // String str1="aaaaa";
        // String str2="bbbbb";
        // String a = stringMix( str1,  str2);
        // System.out.println(a);

        //문자 리스트를 문자열로 변환하기
        // String[] arr = {"a","b","c"};
        // String a = listToString(arr);
        // System.out.println(a);

        //문자열 곱하기
        // String my_string="string";
        // int k = 3 ;
        // String a = solution(my_string, k);
        // System.out.println(a);

        //더 크게 합치기
        // int a=9;
        // int b=91;
        // int c = solution(a, b);
        // System.out.println(c);

        //두 수의 연산값 비교하기
        //int a =2;
        // int b =91;
        // int c = intCompare(a, b);
        // System.out.println(c);

        //n의 배수
        // int num =98;
        // int n=2;
        // int a = solution181937(num, n);
        // System.out.println(a);
        
        //공배수
        // int number =60;
        // int n=2;
        // int m=3;
        // int a = solution181936(number, n, m);
        // System.out.println(a);

        //홀짝에 따라 다른 값 반환하기
        // int n =8;
        // int a = solution181935(n);
        // System.out.println(a);

        //조건 문자열
        String ineq = "<";
        String eq= "=";
        int n=20;
        int m=50;
        int a = solution181934(ineq, eq, n, m);
        System.out.println(a);
    }

    //////////////////////////////////////////////////////////////

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

        // char[] my_chars = my_string.toCharArray();
        // char[] overwrite_chars = overwrite_string.toCharArray();
        // for (int i=0; i<overwrite_chars.length; i++) {
        //     my_chars[s + i] = overwrite_chars[i];
        // }
        // return String.valueOf(my_chars);
    }

    //문자열안에 문자열
    public int stringinstring(String str1, String str2){
        
        if(str1.contains(str2))
        {
            return 1;
        } else {
            return 2;
        }

        // return (str1.contains(str2)? 1: 2);
    }

    //문자열 섞기
    public String stringMix(String str1, String str2) {
        String answer = "";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
            answer += b[i];
            //example
            // answer += String.valueOf(str1.charAt(i));
            // answer += String.valueOf(str2.charAt(i));
        }


        

        return answer;
    } 

    //문자 리스트를 문자열로 변환하기
    public String listToString(String[] arr) {
        String answer="";
        StringBuilder bulider = new StringBuilder();
        for (String a:arr) {
            bulider.append(a);
        }
        //example
        // return String.join("ff", arr);

        return bulider.toString();
    }

    //문자열 곱하기
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
        //example
        // return my_string.repeat(k);
    }

    //더 크게 합치기
    public int solution(int a, int b) {
        int answer = 0;

        //example
        String aa= ""+a+b;
        String bb = ""+b+a;
        int int1 = Integer.parseInt(aa);
        int int2 = Integer.parseInt(bb);

        //my answer
        // StringBuilder sb = new StringBuilder();
        // sb.append(a);
        // sb.append(b);
        // int int1 = Integer.parseInt(sb.toString()); 

        // StringBuilder sb2 = new StringBuilder();
        // sb2.append(b);
        // sb2.append(a);
        // int int2 = Integer.parseInt(sb2.toString()); 

        if (int1 == int2) 
        {
            return int1;
        } 
        else if(int1>int2)
        {
            return int1;
        }
        else{
            return int2;
        }
    }

    //두 수의 연산값 비교하기
    public int intCompare(int a, int b) {
        int answer = 0;

        int aa = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int bb = 2*a*b;

        return aa == bb ? aa : Math.max(aa, bb);

        //my answer
        // String aa = String.valueOf(a);
        // String bb = String.valueOf(b);
        // int cc = Integer.parseInt(aa+bb);
        // if(cc == 2*a*b )
        // {
        //     return cc;
        // }
        // else if(cc > 2*a*b)
        // {
        //     return cc;
        // }
        // else
        // {
        //     return 2*a*b;
        // }

        //exmaple
        // int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        // int ab2 = 2 * a * b;

        //ab와 ab2가 같다면, ab를 리턴한다.
        //ab와 ab2가 같지 않다면, Math.max(ab, ab2)를 리턴한다.
        //Math.max() -> 두 인자값 중 큰 값을 리턴하는 함수이다.  
        // return ab == ab2 ? ab : Math.max(ab, ab2);
    } 

    //n의 배수
    public int solution181937(int num, int n) {
        int answer = 0;
        if (num%n==0) {
            return 1;
        }else {
            return answer;
        }
    }

    //공배수
    public int solution181936(int number, int n, int m) {
        int answer = 0;
        if (number%n==0 && number%m==0) {
            return 1;
        }
        else
        {
            return answer;
        }
        //example
        // return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    //홀짝에 따라 다른 값 반환하기
    public int solution181935(int n) {
        int answer = 0;
        if (n%2==1) {
            for (int i = 1; i <= n; i=i+2) {
                answer += i;
            }
        }
        else if (n%2==0)
        {
            for (int i = 2; i <= n; i= i+2) {
                answer += i*i;
            }
        }
        return answer;
    }

    //조건 문자열
    public int solution181934(String ineq, String eq, int n, int m) {
        int answer = 0;
        return answer;
    }



    
}
