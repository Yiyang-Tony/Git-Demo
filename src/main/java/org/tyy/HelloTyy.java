package org.tyy;

import java.util.Scanner;

/**
 * @ClassName HelloTyy
 * @Description TODO
 * @Author TongYiyang
 * @Date 2020/2/3 18:02
 * @Version 1.0
 */
public class HelloTyy {
    /*
     * @Author TongYiyang
     * @Description //TODO
     * @Date 18:29 2020/2/3
     * @Param [args]
     * @Return void
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        int result;
        x = sc.nextInt();
        y = sc.nextInt();
        result = sum(x,y);
        System.out.print("x + y = " + result);
        sc.close();
    }
    /*
     * @Author TongYiyang
     * @Description //TODO
     * @Date 18:29 2020/2/3
     * @Param [a, b]
     * @Return int
     */
    public static int sum(int a,int b){
        return a+b;
    }
}
