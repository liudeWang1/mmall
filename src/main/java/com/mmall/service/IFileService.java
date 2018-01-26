package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 汪刘德 on 2018/1/14.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
