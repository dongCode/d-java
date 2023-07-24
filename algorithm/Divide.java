// https://leetcode.cn/problems/xoh6Oh/?envType=study-plan-v2&envId=coding-interviews-special
public class Divide {

    static boolean haveSameSign(int a,int b) {
        return (a >= 0 && b >= 0) || (a < 0 && b < 0);
    }
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }

        // 异或符号，即除了相同以外为假，其余与或相同,便捷的判断两个数是否是相同的正负符号
        int sign = haveSameSign(dividend, divisor) ? 1 : -1;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int quotient = 0;

        while(absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;

            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            absDividend -= temp;
            quotient += multiple;
        }
        
        return sign * quotient;
    }
}
