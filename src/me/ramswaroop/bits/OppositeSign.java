package me.ramswaroop.bits;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 6/14/15
 * @time: 12:24 AM
 */
public class OppositeSign {

    public static int isOppositeSign(int a, int b) {
        return (a ^ b) >>> 31;
    }

    public static void main(String a[]) {
        System.out.println(isOppositeSign(-5, -3));
        System.out.println(isOppositeSign(-5, 3));
        System.out.println(isOppositeSign(5, -3));
    }
}
