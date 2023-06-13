package com.lqt;

import java.util.Scanner;

public class lqt {
    public static void main(String[] args) {
        showMenu();
    }
    //显示零钱通导航
    public static void showMenu(){
        boolean loop = true;
        double money = 0;
        //余额
        double blance=0;
        //零钱通明细
        //消费项目
        String note="";
        String detail="\n"+"收益入账 +"+money+"\t"+blance;


        while (loop){
            System.out.println("==========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退    出");
            System.out.println("请选择(1-4):");
            Scanner scanner = new Scanner(System.in);
            char key = scanner.next().charAt(0);
            switch (key){
                case '1':
                    System.out.println("零钱通明细");
                    //显示明细
                    System.out.println(detail);
                    break;
                case '2':
                    System.out.println("收益入账");

                    money= scanner.nextDouble();
                    if (money>blance){
                        System.out.println("消费金额不能大于余额");
                    }
                    blance+=money;
                    detail+="\n"+"收益入账 +"+money+"\t"+blance;
                    break;
                case '3':
                    System.out.println("消费项目");
                    note=new Scanner(System.in).next();
                    System.out.println("消费金额");
                    money= scanner.nextDouble();
                    blance-=money;
                    detail+="\n"+note+" -"+money+"\t"+blance;
                    break;
                case '4':
                    System.out.println("你是否退出 y/n");
                    while(true){
                        char yn=scanner.next().charAt(0);
                        if(yn=='y' ||yn=='n'){
                            System.out.println("退出系统");
                            if (yn=='y'){
                                loop=false;

                            }
                    }


                    break;
            }
        }

    }
}}
