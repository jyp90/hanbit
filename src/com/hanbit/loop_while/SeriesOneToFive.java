package com.hanbit.loop_while;

/**
@FILE  : SeriesOneToFive.java
@DATE  : 2016. 12. 23.
@AUTHOR: J.John Park
@STORY
	1부터 5까지의 합 구하기(diff=1) to use while break

 */
public class SeriesOneToFive {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (true) {
			sum += i;
			if(i==5) {
				break;
			}
			i++;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
