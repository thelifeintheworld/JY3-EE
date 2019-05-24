package com.test.utils;

import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class FileAction {
    /**
     * 上传图片的工具类
     * @param file1
     * @return
     */
    public static  String uploadFile(Part file1){

        String s = file1.getSubmittedFileName();
//    System.out.println(s);
        InputStream inputStream = null;
        OutputStream os = null;
        try {
            inputStream = file1.getInputStream();
            //创建UUID
            UUID uuid = UUID.randomUUID();
            String str = (uuid+s);
           os = new FileOutputStream("F:\\imgs\\"+str);
            int buffer=0;
            byte[] bd = new byte[1024];
            while ((inputStream.read(bd))!= -1){
                os.write(bd,0,buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  null;
    }

}
