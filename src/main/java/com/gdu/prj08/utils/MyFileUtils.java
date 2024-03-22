package com.gdu.prj08.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class MyFileUtils {

    //현재 날짜
    public static final LocalDate TODAY = LocalDate.now();

    //업로드 경로 반환
    public String getUploadPath(){
        return "/upload" + DateTimeFormatter.ofPattern("/yyyy/MM/dd").format(TODAY);
    }

    //저장될 파일명 반환
    public String getFileSystemName(String originalFileName){
        //파일명.확장자
        //.tar.gz ; 확장자에 마침표가 들어있는 경우도 있음
        //.png
        String extName = null;
        if(originalFileName.endsWith("tar.gz")){
            extName = ".tar.gz";
        }else{
            //마지막 . 부터 끝까지
            extName = originalFileName.substring(originalFileName.lastIndexOf("."));
        }
        return UUID.randomUUID().toString().replace("-","")+ extName;
    }

}
