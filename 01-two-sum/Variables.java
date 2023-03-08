/* 
Data Type	    Size	Description

byte	1 byte	Stores  whole numbers from -128 to 127
short	2 bytes	Stores  whole numbers from -32,768 to 32,767
int	    4 bytes	Stores  whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores  whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float	4 bytes	Stores  fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores  fractional numbers. Sufficient for storing 15 decimal digits

boolean	1 bit	Stores  true or false values
char	2 bytes	Stores  a single character/letter or ASCII values

 */
public class Variables {
    public static void main(String[] args) {
        /* String 必须双大括号，最好设置前端eslint结尾必须; */
        String myStr = "ss";

        /* 数字类型 */
        byte myByte = 11;
        int myNum = 111;
        long myLong = 111l;
        float myFloat = 11;
        /* 简单一律 double 声明数字 */
        double myDouble = 11;
        /* char 必须单引号 */
        char myChar = 'D';

        boolean myBool = true;
    

        final int myConst = 112;
        /* 错误: 无法为最终变量myConst分配值 */
        // myConst = 11;

        System.out.println(myStr);
        
        System.out.println(myNum);

    }
}