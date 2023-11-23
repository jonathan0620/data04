package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기2 {

	public static void main(String[] args) {
		Solution02 s = new Solution02();
		int[] num_list = { 1, 2, 3, 4, 5, 33, 22, 55, 11 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution02 {
	public int[] solution(int[] num_list) {
		//역순으로 정렬해보기 --> 내림차순
		//오름차순으로 정렬 --> 거꾸로 집어 넣기
		Arrays.sort(num_list);
		System.out.println(Arrays.toString(num_list));
		//거꾸로 집어 넣기 위해서는 끝에서부터 하나씩 위치값을 감소시키는 j변수 필요
		int[] answer = new int[num_list.length];
		int j = answer.length -1;
		for (int i = 0; i < answer.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
		return answer;
	}
}