package com.example.sale.controller;

//
import org.springframework.util.StringUtils;
import com.example.sale.Upload.FileUploadUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

import static antlr.StringUtils.*;

@RestController
@RequestMapping("api/v1/Receipt")

public class ReserveUploadController {

    @PostMapping( "/Upload")
   public void saveImage(@RequestParam("files")MultipartFile[] files){
        String uploadDir = "PaymentReceiptsFolder";
        Arrays.asList(files).stream().forEach(file->{
            String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
            System.out.println(fileName);
            try{
                FileUploadUtil.saveFile(uploadDir,fileName,file );
            }catch(IOException ioException) {
                return ;
            }
            });
    }
}

