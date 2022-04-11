package com.backend.component;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public interface ImageUploader {

    String upload(MultipartFile multipartFile) throws IOException;

    String changeFileName(MultipartFile uploadFile);

    // 로컬에 파일 업로드 하기
    Optional<File> localUpload(MultipartFile file) throws IOException;
}