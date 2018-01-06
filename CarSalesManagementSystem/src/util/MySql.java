package util;

import java.io.*;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 17:39 2017/6/13.
 * @Descrip
 */
public class MySql {

    public static void backup() {
        try {
            /*
            Runtime类封装了运行时的环境。每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
      一般不能实例化一个Runtime对象，应用程序也不能创建自己的 Runtime 类实例，但可以通过 getRuntime 方法获取当前Runtime运行时对象的引用。
      一旦得到了一个当前的Runtime对象的引用，就可以调用Runtime对象的方法去控制Java虚拟机的状态和行为。
             */
            // 它可以执行系统目录下bin下的cmd命令比如windows下的mysql.exe
            Runtime rt = Runtime.getRuntime();

            /*
            用于管理子进程的Process对象
            */
            // 调用 调用mysql的安装目录的命令
            Process child = rt
                    .exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump -hlocalhost -uroot -pyq578797 carsalesmanagementsystem");

            // 设置导出编码为utf-8。这里必须是utf-8
            // 把进程执行中的控制台输出信息写入.sql文件，即生成了备份文件。
            // 注：如果不对控制台信息进行读出，则会导致进程堵塞无法运行
            InputStream in = child.getInputStream();// 控制台的输出信息作为字节输入流
            InputStreamReader xx = new InputStreamReader(in, "utf-8");//解码为字符流
            // 设置解码编码为utf-8。这里必须是utf-8，否则从流中读入的是乱码

            String inStr;
            StringBuffer sb = new StringBuffer("");
            String outStr;
            // 组合控制台输出信息字符串
            BufferedReader br = new BufferedReader(xx);//缓冲字符流

            /*
            *   读一行文字。 一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符终止。
            *   结果包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null
            * */
            while ((inStr = br.readLine()) != null) {
                sb.append(inStr + "\r\n");//结束尾缀
            }
            outStr = sb.toString();

            // 要用来做导入用的sql目标文件：
            // 创建文件输出字节流以指定的名称’写入‘文件.       写出到该 jsppractice.sql 文件
            // 写入是01. 所以需要OutputStreamWriter写入
            String path = "E:\\Users\\ASUS-\\Desktop";
            String filename = "carsalesmanagementsystem.sql";
            File dir = new File(path);
            if(!dir.exists()){
                if(dir.mkdirs()){
                    System.out.println("创建目录成功");
                    File file = new File(path+File.separator+filename);
                    if(!file.exists()){
                        file.createNewFile();
                        System.out.println("创建文件成功");
                    }
                } else{
                    System.out.println("创建目录失败");
                }
            }else{
                System.out.println("目录已存在");
            }
            FileOutputStream fout = new FileOutputStream("E:\\Users\\ASUS-\\Desktop\\carsalesmanagementsystem.sql");
            OutputStreamWriter writer = new OutputStreamWriter(fout, "utf-8"); // 转化为字符输出流写入文件。
            writer.write(outStr);
            writer.flush();
            in.close();
            xx.close();
            br.close();
            writer.close();
            fout.close();

            System.out.println("backup haddown！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void load() {
        try {
            String fPath = "E:\\Users\\ASUS-\\Desktop\\carsalesmanagementsystem.sql";
            Runtime rt = Runtime.getRuntime();

            // 调用 mysql 的 cmd:
            //    rt.exec("create database demo");
            Process child = rt.exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql -uroot -pyq578797 --default-character-set=utf8 carsalesmanagementsystem");
            OutputStream out = child.getOutputStream();// 控制台的输入信息作为输出流
            String inStr;
            StringBuffer sb = new StringBuffer("");
            String outStr;
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(fPath), "utf8"));
            while ((inStr = br.readLine()) != null) {
                sb.append(inStr + "\r\n");
            }
            outStr = sb.toString();

            OutputStreamWriter writer = new OutputStreamWriter(out, "utf8");
            writer.write(outStr);
            // 注：这里如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免
            writer.flush();
            // 别忘记关闭输入输出流
            out.close();
            br.close();
            writer.close();

            System.out.println("/* Load OK! */");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
