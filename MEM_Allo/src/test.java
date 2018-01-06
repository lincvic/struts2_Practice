
/**
 * Created by 王一疆 on 01/01/2018
 */
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;


//进程控制块

class PCB {
    //记录控制块的名字
    String name;
    //记录存储块的容量

    int memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

//存储块
class Memorys {
    String name;
    int size;
    String station = "空闲";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        String str = "\t" + this.name + "\t" + this.size + "\t" + this.station;
        return str;
    }
}

class Methid {

    //存储块用的是List

    public void swap(ArrayList<Memorys> list) {
        //swap方法排序
        System.out.println("将存储块大小进行排序之后：");
        for (int i = 0; i < list.size() - 1; i++) {
            //冒泡排序
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).size > list.get(j).size) {
                    Object obj = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, (Memorys) obj);
                }
            }
        }
    }

    public void print(ArrayList<Memorys> list) {             //输出
        System.out.println("\t存储块名\t存储大小\t存储状态");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t"+list.get(i));
        }
    }
}

class Access {
    Scanner input = new Scanner(System.in);
    Methid methid = new Methid();

    public void mainMethid(String str, Vector<PCB> pcbs, ArrayList<Memorys> list) {
        while (true) {
            System.out.println("请输入你要操作的步骤:");
            System.out.print("  1:运行进程");
            System.out.print("  2:回收进程");
            System.out.println("  3:结束当前算法");
            System.out.print("请输入：");
            int p = input.nextInt();
            if (p == 1) {
                /*----------运行进程运行进程运行进程-------------------*/
                System.out.println("请输入当前要运行的进程名");
                String name = input.next();
                for (int i = 0; i < pcbs.size(); i++) {
                    if (name.equals(pcbs.get(i).name)) {
                        //输入要运行的进程名和第i个PCB的名字相同
                        /*将空闲区按其在存储空间中的起始地址递增的顺序排列。为作业分配存储空间时，从空闲区链的始端开始
                        *查找，选择第一个满足要求的空闲区，而不管它究竟有多大。*/
                        if (str.equals("A")) {
                            //-----------如果输入A,最先适应法
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).size >= pcbs.get(i).memory && list.get(j).station.equals("空闲")) {
                                    Memorys memorys = new Memorys();
                                    list.get(j).setStation(name + "正在运行");
                                    //初始化beyond
                                    int beyond = 0;
                                    //beyond=存储块大小-pcb的所占内存大小
                                    beyond = list.get(j).size - pcbs.get(i).memory;
                                    if (beyond != 0) {
                                        list.get(j).setSize(pcbs.get(i).memory);
                                        list.add(j + 1, memorys);
                                        list.get(j + 1).setName("副存储块");
                                        list.get(j + 1).setSize(beyond);
                                    }
                                    methid.print(list);
                                    break;
                                }
                            }
                        }
                        /*最佳适应算法是从全部空闲区中找出能满足作业要求的、且大小最小的空闲分区的一种计算方法，这种方法能使碎片尽量小。*/
                        else if (str.equals("B")) {
                            //最佳适应法
                            Memorys memorys = new Memorys();
                            int beyond = 100;
                            int ss = -1;
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).size >= pcbs.get(i).memory && list.get(j).station.equals("空闲")) {
                                    if ((list.get(j).size - pcbs.get(i).memory) < beyond) {
                                        beyond = list.get(j).size - pcbs.get(i).memory;
                                        ss = j;
                                    }
                                }
                            }
                            if (beyond != -1) {
                                list.get(ss).setStation(name + "正在运行");
                                list.get(ss).setSize(pcbs.get(i).memory);
                                if (beyond != 0) {
                                    list.add(ss + 1, memorys);
                                    list.get(ss + 1).setName("副存储块");
                                    list.get(ss + 1).setSize(beyond);
                                }
                            }
                            methid.print(list);
                            break;
                        }
                    }
                }
            } else if (p == 2) {
                /*--------------------结束进程---------------*/
                System.out.println("请输入要结束的进程名");
                String name = input.next();
                String names = name + "正在运行";
                for (int i = 0; i < list.size(); i++) {
                    if (names.equals(list.get(i).station)) {
                        list.get(i).setStation("空闲");
                        if (list.get(i + 1).name.equals("副存储块")) {
                            list.get(i).size = list.get(i).size + list.get(i + 1).size;
                            list.remove(i + 1);
                        }
                        methid.print(list);
                        break;
                    }
                }
            } else if (p == 0) {
                /*-----------------结束当前算法-------------------*/
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getStation() != "空闲") {
                        list.get(i).setStation("空闲");
                        if (list.get(i + 1).name.equals("副存储块")) {
                            list.get(i).size = list.get(i).size + list.get(i + 1).size;
                            list.remove(i + 1);
                        }
                    }
                }
                break;
            }
        }
    }
}

//主方法

public class test {
    private static Scanner input;

    public static void main(String args[]) {
        Vector<PCB> pcbs = new Vector<PCB>();
        System.out.println("请输入进程数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            PCB pcb = new PCB();
            System.out.println("请输入第" + (i + 1) + "个进程的名字 运行所占内存 用空格隔开");
            pcb.name = input.next();
            pcb.memory = input.nextInt();
            pcbs.add(pcb);
        }
        System.out.println("定义存储块数，并为其分配区间：");
        int m = input.nextInt();
        ArrayList<Memorys> list = new ArrayList<Memorys>();
        for (int i = 0; i < m; i++) {
            Memorys nck = new Memorys();
            System.out.println("请输入第" + (i + 1) + "个存储块的存储名和存储大小：");
            nck.name = input.next();
            nck.size = input.nextInt();
            list.add(nck);
        }
        while (true) {
            System.out.println("选择算法：");
            System.out.println("  A:最先适应");
            System.out.println("  B:最佳适应");
            String str = input.next();
            Methid methid = new Methid();
            if (str.equals("A")) {
                methid.swap(list);
                methid.print(list);
                Access access = new Access();
                access.mainMethid(str, pcbs, list);
            } else if (str.equals("B")) {
                methid.print(list);
                Access access = new Access();
                access.mainMethid(str, pcbs, list);

            }
        }
    }
}