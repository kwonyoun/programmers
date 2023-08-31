import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Level0_2 {

    //생성자
    public Level0_2()
    {
        // 코드 처리하기
        // String n ="abc1abc1abc";
        // String a = solution181932(n);
        // System.out.println(a);

        // 등차수열의 특정한 항만 더하기
        // int a=3; 
        // int d=4; 
        // boolean[] included = {true, false, false, true, true};
        // int rt = solution181931(a,d,included);
        // System.out.println(rt);

        // 글자 이어 붙여 문자열 만들기
        // String a="cvsgiorszzzmrpaqpe"; 
        // int[] included = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        // String rt = solution181915(a,included);
        // System.out.println(rt);

        //원소들의 곱과 합
        // int[] a = {3, 4, 5, 2, 1};
        // System.out.println(solution(a));

        //이어 붙인 수
        // int[] a = {3, 4, 5, 2, 1};
        // System.out.println(solution1(a));

        //카운트 업
        // int a=3;
        // int b=10;
        // System.out.println(solution181920(a, b));

        //수 조작하기 1
        // int a=0;
        // String b ="wsdawsdassw";
        // System.out.println(solution(a, b));

        //수 조작하기 2
        // int[] a = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}	;
        // System.out.println(solution2(a));

        //문자열을 정수로 변환하기
        // String n = "10";
        



        //두 수의 나눗셈
        // int aa= 7;
        // int b=3;
        // System.out.println(solution(aa, b));

        // 배열의 평균값
        // int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(solution120817(a));

        //양꼬치
        // int a =10;
        // int b=3;
        // System.out.println(solution120830(a, b));

        //편지
        // String a= "happy birthday!";
        // System.out.println(solution120898(a));

        //배열 뒤집기
        // int[] answer = {1, 2, 3, 4, 5};
        // System.out.println(solution120821(answer));

        //배열 원소의 길이
        // String[] answer = {"We", "are", "the", "world!"};
        // System.out.println(solution120854(answer));

        //최댓값 만들기 (1)
        // int[] a = {0, 31, 24, 10, 1, 9};
        // System.out.println(solution120847(a));

        // 피자 나눠 먹기 (1)
        // int n = 15;
        // System.out.println(solution120814(n));

        //배열 두배 만들기
        // int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        // int[] a = solution120809(numbers);
        // System.out.println(a);

        //배열 자르기
        // int[] a = {1, 3, 5,1,5};
        // int num1 = 2;
        // int num2 =3;
        // int[] t = solution(a, num1, num2);
        // System.out.println(t);
    
        //짝수 홀수 개수
        // int[] answer = {1,2,3,4,5};
        // int[] a = solution120824(answer);
        // System.out.println(a);

        // 서울에서 김서방 찾기
        // String[] seoul = {"Jane", "Kim"};
        // String answer = solution12919(seoul);
        // System.out.println(answer);
        
        //OX퀴즈
        // String[] a = {"3 - 4 = -3", "5 + 6 = 11"};
        // String[] rt = solution(a);
        // System.out.println(rt);

        //부분 문자열 이어 붙여 문자열 만들기
        // String[] my_strings ={"progressive", "hamburger", "hammer", "ahocorasick"};
        // int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        // String rt = solution(my_strings, parts);
        // System.out.println(rt);

        //문자열의 뒤의 n글자
        // String str = "ProgrammerS123";
        // int in = 11;
        // String rt = solution181910(str, in);
        // System.out.println(rt);

        //문자열의 앞의 n글자
        // String str = "ProgrammerS123";
        // int in = 11;
        // String rt = solution181910(str, in);
        // System.out.println(rt);

        //마지막 두 원소
        // int[] num = {2, 1, 6};
        // int[] rt = solution181927(num);
        // System.out.println(rt);

        //모음 제거
        // String st ="nice to meet you";
        // String rt = solution120849(st);
        // System.out.println(rt);

        //아이스 아메리카노
        // int mn = 15500;
        // int[] rt = solution120819(mn);
        // System.out.println(rt);

        //문자열 뒤집기
        // String a = "nijnuoy";
        // String rt = solution120822(a);
        // System.out.println(rt);

        //머쓱이보다 키 큰 사람
        // int[] a={149, 180, 192, 170};
        // int b= 167;
        // int rt = solution(a, b);
        // System.out.println(rt);

        //순서쌍의 개수
        int a=20;
        int rt = solution120836(a);
        System.out.println(rt);
        
    }

    //코드 처리하기
    //진심 모르것다...
    //못품
    public String solution181932(String code) {
        String answer = "";
        
        int mode =0;

        // for (int i = 0; i < code.length(); i++) {

        //     if (code.charAt(i)==1) {
        //         mode = 1- mode;
        //     } else if 
            
        // }
        // return "".equals(answer)? "EMPTY" : answer;

        // int mode = 0;
        // for (int i = 0; i < code.length(); i++) {
        //     if (code.charAt(i) == '1') mode = 1 - mode;
        //     else if (i % 2 == mode) answer += code.charAt(i);
        // }
        // return "".equals(answer) ? "EMPTY" : answer;
        return "";

    }

    //등차수열의 특정한 항만 더하기
    public int solution181931(int a, int d, boolean[] included) {
        int answer = 0;

        //0부터 4까지 반복한다. 
        for (int i = 0; i < included.length; i++) {

            //만약 included[0]이 "true"라면 
            if(included[i] == true)
            {
                //answer = answer + ( a + (d * i))
                System.out.println(answer); 
                answer += (a + (i* d)); //첫째항 a와 공차 d
                System.out.println("i: "+i);
                
            }
        }
        return answer;
    }

    //글자 이어 붙여 문자열 만들기
    public String solution181915(String my_string, int[] index_list) {
        String answer = "";
        //0부터 index_list의 길이까지.
        for (int i = 0; i < index_list.length; i++) {
                //my_string의 각 char값을 가져온다. 몇 번째의 값을 가져오냐??
                //index_list의 순서대로.
                answer += my_string.charAt(index_list[i]);
        }
        
        return answer;

        //example
        // StringBuilder sb = new StringBuilder();
        // for (int idx : index_list)
        //     sb.append(my_string.charAt(idx));

        // return sb.toString();
    }

    //원소들의 곱과 합
    //좀 더 간결하게 하는 방법을 숙지해야긋다..
    public int solution(int[] num_list) {

        int answer = 0;
        int s2=1;
        int aaaa=0;

        int aa=0;

        //각 원소 합의 제곱
        for (int i=0; i<num_list.length; i++) {
            answer += num_list[i];
            double db = Math.pow(answer, 2);
            aaaa = (int) db;

            // System.out.println("i: "+Math.pow(answer, 2));
        }

        //각 원소의 곱
        for (int i = 0; i < num_list.length; i++) {
            s2 *= num_list[i];
            // System.out.println("*: "+s2);
        }

        if (s2<aaaa) {
            aa = 1;
        } else if (s2>aaaa) {
            aa= 0;
        }

        return aa;
    }

    //이어 붙인 수
    public int solution1(int[] num_list) {
        int answer = 0;

        String odd="";
        String even="";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]%2==1) {
                odd += num_list[i];
            } else if (num_list[i]%2 == 0) {
                even += num_list[i];
            }
        }
        answer = Integer.parseInt(odd)+Integer.parseInt(even);

        return answer;
    }

    //카운트 업
    //못품
    public int[] solution2(int start, int end) {
        
        //생성할 배열의 사이즈를 계산한다.
        //배열은 0부터 시작이므로 1을 더한다. 
        int size = end - start + 1;

        //배열 사이즈 계산한 값으로 지정하기.
        int[] answer = new int[size];
        
        //answer.length까지 이므로 배열사이즈는 이미 정해져 있음.
        for (int i = 0; i < answer.length; i++) {

            //배열 시작 숫자를 start로 1씩 더하여 저장한다.
            //배열을 생성할 때 start~end로 해야할 줄 알았는데, end는 배열 사이즈를 설정할때만 쓰이는 듯 하다?!
            answer[i] = start++; 
        }
        
        return answer;
    
    }

    //수 조작하기 1
    public int solution(int n, String control) {
        int answer = 0;

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w' ) {
                n += 1;
            }
            else if (control.charAt(i) == 's') {
                n -= 1;
            }
            else if (control.charAt(i) == 'd') {
                n += 10;
            }
            else if (control.charAt(i) == 'a') {
                n -= 10;
            } 
               
        }
        return n;
    }

    //방법2
    // for(char ch : control.toCharArray()) {
    //     switch(ch) {
    //         case 'w': answer += 1; break;
    //         case 's': answer -= 1; break;
    //         case 'd': answer += 10; break;
    //         case 'a': answer -= 10; break;
    //         default:break;
    //     }
    // }

    //수 조작하기 2
    //못품
    public String solution2(int[] numLog) {
        String answer = "";

        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1)
                answer += 'w';
            else if(numLog[i] - numLog[i - 1] == -1)
                answer += 's';
            else if (numLog[i] - numLog[i - 1] == 10)
                answer += 'd';
            else
                answer += 'a';
        }
        // for (int i : numLog) {
            // if (numLog[i] == numLog[0] ) {
            //     switch (i) {
            //         case value:
                        
            //             break;
                
            //         default:
            //             break;
            //     }
            // }
        // }
        
        return answer;
    }

    //문자열을 정수로 변환하기
    public int solution(String n_str) {
        int answer = 0;
        answer =  Integer.parseInt(n_str);        
        return answer;
    }

    //두 수의 나눗셈
    public int solution(int num1, int num2) {
        int answer = 0;
        double a = (double) num1/num2;
        double b =   a*1000;
        int c= (int) Math.floor(b);
        answer = Integer.parseInt(String.valueOf(c));
        return answer;
    }

    //짝수의 합
    public int solution(int n) {
        int answer = 0;
        for(int i =2; i<=n; i=i+2)
        {
            answer +=i;
        }
        return answer;
    }
    
    // 배열의 평균값
    public double solution120817(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer/numbers.length;
    }

    // 양꼬치
    public int solution120830(int n, int k) {
        int answer = 0;
        int a= n/10;
        answer = 12000*n+2000*k-a*2000;    
        return answer;
    }

    //편지
    public int solution120898(String message) {
        int answer = 0;
        answer = message.length() *2;
        return answer;
    }

    //배열 뒤집기
    public int[] solution120821(int[] num_list) {

        //example
        // int[] answer = new int[num_list.length];
        // int startIdx = 0;
        // for(int i = num_list.length-1; i>=0; i--){
        //     answer[startIdx] = num_list[i];
        //     startIdx++;
        // }

        int[] answer = new int[num_list.length]; //같은 배열의 수를 만들겠다.

        for(int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
            System.out.println(answer[num_list.length - i - 1]);    
        }
        return answer;
    }

    //배열 원소의 길이
    public int[] solution120854(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    //최댓값 만들기 (1)
    public int solution120847(int[] numbers) {
        int answer = 0;
        // for (int i = 0; i < numbers.length; i++) {
        //    Arrays.sort(numbers);
        //    answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        // }
        // return answer;

        //example
        for(int i=0; i<numbers.length-1;i++){ //배열 중 하나 빼고서 
            for(int j=i+1; j<numbers.length; j++){ //배열 전체 중
                // System.out.println(numbers[i]);
                // answer = Math.max(answer,numbers[i]);
                answer = Math.max(answer,numbers[i]*numbers[j]);
            }
        }
        return answer;
    }

    // 피자 나눠 먹기 (1)
    public int solution120814(int n) {
        int answer = 0;

        int pizza = n/7;
        if (n%7 !=0) {
            answer = pizza+1;
        }else
        {
            answer = pizza;
        }
        return answer;

        //example
        // answer = (n%7==0) ? n/7 : n/7 + 1;
        // return answer;
    }

    //배열 두배 만들기
    public int[] solution120809(int[] numbers) {
        //배열의 길이를 먼저 정해줘야 하는구나?
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i]*2;
            System.out.println(answer[i]);
        }
        return answer;
    }

    //배열 자르기
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1 +1 ];
        System.out.println(answer.length);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i+num1];
            System.out.println(answer[i]);
        }
        return answer;

        //example
        // int[] answer = new int[num2 - num1 + 1];
        // for (int i = num1; i <= num2; i++) {
        //     answer[i -num1] = numbers[i];
        // }
        // return answer;
    }

    //짝수 홀수 개수
    public int[] solution120824(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]%2==0) {
                answer[0]++;
            } else if(num_list[i]%2==1)
            {
              answer[1]++;
            }
            
        }
        return answer;
    }

    // 서울에서 김서방 찾기
    public String solution12919(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+ i+"에 있다";
            }
        }
        return answer;

        //"김서방은 1에 있다"
    }

    //
    public int solution12931(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    //OX퀴즈
    //못품
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String a="";
        String plus="+";
        String minus="-";
        for (int i = 0; i < quiz.length; i++) {
            a =quiz[0].replaceAll(" ", "");
            // System.out.println(quiz[0].replaceAll(" ", ""));
            // System.out.println(quiz[i]);
            // answer= quiz[0].split("=",2);
            // System.out.println(answer);
            answer = a.split("=",2);
            if(plus.equals("+"))
            {
                answer=a.split(plus,2);
            }
            
            System.out.println(answer[1]);
        }
        return answer;
    }

    //카운트 업
    public int[] solution181920(int start_num, int end_num) {
        
        int size = end_num - start_num +1; //배열의 크기 설정
        int[] answer = new int[size]; //설정한 크기로 배열 만들기

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num++;
            System.out.println(answer[i]);
        }
        return answer;
    }

    //부분 문자열 이어 붙여 문자열 만들기
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i]; //my_strings의 배열 순서
            answer += str.substring(parts[i][0],parts[i][1]+1);
            //substring(시작 인덱스,종료 다음 인덱스); -> '종류다음인덱스' 때문에 +1을 한다. 
            //0번째,
        }
        return answer;
    }

    //문자열의 뒤의 n글자
    public String solution181910(String my_string, int n) {
        String answer = "";
        answer=my_string.substring(my_string.length()-n);
        //substring(시작 인덱스); -> 시작인덱스부터 끝까지 출력됨.
        return answer;
    }

    //문자열의 앞의 n글자
    public String solution181907(String my_string, int n) {
        String answer = "";
        answer=my_string.substring(0,n);
        //substring(시작 인덱스); -> 시작인덱스부터 끝까지 출력됨.
        return answer;
    }

    //마지막 두 원소
    public int[] solution181927(int[] num_list) {
        int size = num_list.length+1; //배열사이즈 설정
        int[] answer = new int[size]; //배열 만들기
        int p =0; //추가할 값 선언하기

        //배열이니까 마지막 수는 '-1' 했다.
        if ((num_list[num_list.length-1])>(num_list[num_list.length-2])) {
            p = num_list[num_list.length-1]-num_list[num_list.length-2];
        } else {
            p = num_list[num_list.length-1]*2;
        }
        //num_list의 길이만큼 반복한다. 
        for (int i = 0; i < num_list.length; i++) {  
            //answer의 배열크기는 num_list보다 하나 크다. 그래서 마지막 하나가 남음.
            //남은 자리를 위해서 설정한 p로 채운다. 
            answer[i] = num_list[i];
        }
        //배열이니까 length에서 -1하기.
        //answer 배열의 마지막 수 는 p로 설정한다. 
        answer[answer.length - 1] = p;
        
        System.out.println("p"+p);
        
        return answer;
    }

    //모음 제거
    public String solution120849(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");

        //방법2
        // String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        // for(String vowel : vowels){
        //     if(my_string.contains(vowel)){
        //         my_string = my_string.replace(vowel, "");
        //     }
        // }
        
        return answer;
    }

    //아이스 아메리카노
    public int[] solution120819(int money) {
        int[] answer = new int[2];
        int ice = 5500;
        int cnt = money/ice;
        if (money%ice == 0) { 
            answer[0]=cnt;
            answer[1]=0;
        } else {
            answer[0]=cnt;
            answer[1]=money%ice; 
        }
        //방법
        // answer[0] = money/5500;
        // answer[1] = money%5500;

        return answer;
    }

    //문자열 뒤집기
    public String solution120822(String my_string) {
        String answer = "";
        StringBuffer a = new StringBuffer(my_string);
        answer=a.reverse().toString();
        
        return answer;
    }

    //머쓱이보다 키 큰 사람
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height ) {
                answer++;
            }
            
        }
        return answer;
    }

    //순서쌍의 개수
    public int solution120836(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {   
                //약수의 갯수
                answer++;
            } 
        }
        return answer;
    }


}
