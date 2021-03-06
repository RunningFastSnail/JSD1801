package com.entor.bms.utils;

import com.entor.bms.entity.BookInfo;
import com.entor.bms.entity.UserInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteUtils {
    public static final String USER_FILE_PATH = "user";
    public static final String BOOK_FILE_PATH = "book";

    /**
     * @param line 待写入文件的字符串
     * @param path 待写入文件的路径
     */
    public static void singleWrite(String line, String path) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(line);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读文件，取得所有的userinfo记录
     *
     * @return
     */
    public static List<UserInfo> readAllUserRecords() {
        List<UserInfo> list = new LinkedList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(USER_FILE_PATH));
            String line;
            while ((line = br.readLine()) != null) {
                UserInfo userInfo = EditUtils.stringToUserInfo(line);
                list.add(userInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;


    }

    /**
     * 读文件，取得所有的bookinfo记录
     *
     * @return 记录的集合，通过判断集合的元素个数，确定是否正确返回
     */
    public static List<BookInfo> readAllBookRecords() {
        List<BookInfo> list = new LinkedList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(BOOK_FILE_PATH));
            String line;
            while ((line = br.readLine()) != null) {
                BookInfo bookInfo = EditUtils.stringToBookInfo(line);
                list.add(bookInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 新的书籍信息覆盖旧的书籍信息
     *
     * @param list
     * @param bookFilePath
     */
    public static void multiWrite(List<BookInfo> list, String bookFilePath) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(bookFilePath,false));
            for (BookInfo bookInfo : list) {
                bw.write(EditUtils.bookInfoToString(bookInfo));
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
