package cn.sxt.array2;

import java.util.Arrays;

/**
 * @author alexander chan
 */
public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] emp1={1001,"陈家坤",18,"学生","2001.05.03"};
        Object[] emp2={1002,"陈家坤1",19,"学生","2002.05.03"};
        Object[] em3={1003,"陈家坤2",20,"学生","2003.05.03"};

        Object[][] tableData=new Object[3][];
        tableData[0]=emp1;
        tableData[1]=emp2;
        tableData[2]=em3;


        for(Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
    }
}
