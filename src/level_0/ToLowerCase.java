package level_0;

import java.util.Scanner;

//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
public class ToLowerCase {

    public static void main(String[] args) {
        
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
    
}
