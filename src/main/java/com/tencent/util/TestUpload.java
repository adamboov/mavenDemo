package com.tencent.util;

import java.io.File;

public class TestUpload {
	public static void main(String[] args) {
		String name = "file";
        //1.创建文件
        File file = new File("D:\\Download\\360安全浏览器下载\\JavaScript网页设计300例.chm");
        //2.调用方法，传入要在服务器上保存的目录及文件名    和  文件
        TencentUploadUtil.uploadFile(name+"/"+"test.chm",file);
    }	
}
