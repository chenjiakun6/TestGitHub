package cn.sxt.array2;

/**
 * @author alexander chan
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        String[] str={"阿里","京东","商学院","百度","亚马逊"};
        //testBasicCopy2();
        removeElment(str,1);
    }
    //测试从数组中删除某个元素（本质上还是数组的拷贝）
    public static void testBasicCopy(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2=new String[5];
        System.arraycopy(s1,3,s1,3-1,s1.length-3);
        for(int i=0;i<=s2.length;i++){
            System.out.println(i+"--"+s2[i]);
        }
    }
    //删除数组中指定索引位置的元素，并将原数组返回；
    public static  String[] removeElment(String[] s,int index){

       // System.arraycopy(s,index,s,s,index-1,s.length-index);

        s[s.length-1]=null;
        for(int i=0;i<=s.length;i++){
            System.out.println(i+"--"+s[i]);
        }
        return s;
    }
}
