﻿package ProductOfTwoNumber;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;

                if (num1 >= 0 && num1 <= 100 && num2 >=1 && num2 <= 100) {
                    answer = num1 * num2;
                }

                return answer;
            }
        }
    }
}