package com.codingdojo.groupproject.s3Services;


public interface S3Services {
	public void downloadFile(String keyName);
	public void uploadFile(String keyName, String uploadFilePath);
}
