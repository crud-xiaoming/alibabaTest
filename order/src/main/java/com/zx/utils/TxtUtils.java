package com.zx.utils;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtUtils {

    public static void main(String[] args) {
        String fileName = "test.txt"; // 这是你的文件名
        BufferedReader br = null;

        try {
            // 创建一个FileReader对象
            FileReader fr = new FileReader(fileName);
            // 创建一个BufferedReader对象，将FileReader对象作为参数传入
            br = new BufferedReader(fr);

            String line = null;

            // 使用readLine()方法读取文件内容
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
