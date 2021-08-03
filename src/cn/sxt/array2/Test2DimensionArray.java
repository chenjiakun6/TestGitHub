package cn.sxt.array2;

/**
 * 测试二维数组
 * @author alexander chan
 */
public class Test2DimensionArray {
    public static void main(String[] args) {
       // int[] a=new int[3];
        //Car[] cars=new Car[3];

        int[] [] a=new int[3][];

        a[0]=new int[]{20,30};
        a[1]=new int[]{10,15,80};
        a[2]=new int[]{50,60};

        System.out.println(a[0][1]);

        int[][] b={
                {22,33},
                {38,23}
        };
        System.out.println(b[0][1]);
    }
}

class Car{

}