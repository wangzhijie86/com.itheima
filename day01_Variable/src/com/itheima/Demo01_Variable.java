package com.itheima;
        /*
        变量定义格式：
        数据类型 变量名 = 变量值;

        基本数据类型：
        byte,short,int,long,float,double,char,boolean

        变量的使用：
        取值格式：变量名

        修改值格式：变量名 = 变量值;
        */
public class Demo01_Variable {
    public static void main(String[] args) {
        //1.0定义变量。整型int类型，变量名a，值为10；
        int a = 10;
        //2.0输出变量，打印到屏幕或者输出设备；
        System.out.println(a);
        //1.1定义变量的另一种方式；
        int b;
        b = 20;
        System.out.println(b);
        //1.3修改变量
        //int a = 10.2; 错误1.首先整形不能赋值为浮点型
        //int a = 10.2; 错误2.在同一块作用域，类型相同变量名相同会出现错误，指针无法指向。
        //float a = 10.1; 结论，同一作用域只能变量名是唯一的，和数据类型无关。

        //3.0修改变量
        a = 12;

        int c;
        c = a + b;
        System.out.println(c);










    }
}
