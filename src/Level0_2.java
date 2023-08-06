import java.sql.Array;

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
        // System.out.println(solution2(a, b));

        //수 조작하기 1
        // int a=0;
        // String b ="wsdawsdassw";
        // System.out.println(solution(a, b));

        //수 조작하기 2
        int[] a = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}	;
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
    public String solution2(int[] numLog) {
        String answer = "";
        return answer;
    }
    
}
