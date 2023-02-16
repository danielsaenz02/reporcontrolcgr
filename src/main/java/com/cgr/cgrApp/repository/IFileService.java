package com.cgr.cgrApp.repository;

import com.cgr.cgrApp.entity.File;

import java.io.InputStream;

public interface IFileService {
    public String uploadFileAzure(String filename, InputStream content, long length, Integer idComplaint);

}
