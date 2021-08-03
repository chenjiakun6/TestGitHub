package cn.sxt.array2;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

/**
 * 测试冒泡排序
 * @author alexander chan
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values={2,5,33,76,32,6,4};
        int temp=0;
        for(int i=0;i<values.length-1;i++){
            boolean flag=true;
            for(int j=0;j<values.length-1-i;j++){
                //比较大小
                if(values[j]>values[j+1]){
                    temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;

                    flag=false;
                }
                System.out.println(Arrays.toString(values));
            }
            if(flag){
                System.out.println("结束！！！");
                break;
            }
            System.out.println("#######");
        }

    }
}
