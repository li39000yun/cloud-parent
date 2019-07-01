package com.tz4cloud.tz.laboratory.util;

import cn.hutool.core.io.FileUtil;
import com.tz4cloud.tz.laboratory.vo.FastDFSFile;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FastDFSUtils {

    // 初始化对象
    static TrackerServer trackerServer;
    static TrackerClient trackerClient;
    static StorageServer storageServer;
    static StorageClient storageClient;

    // 初始化配置文件
    static {
        try {
            String confFilePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();
            ClientGlobal.init(confFilePath);
            trackerClient = new TrackerClient();
            trackerServer = trackerClient.getConnection();
            storageServer = trackerClient.getStoreStorage(trackerServer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 上传文件,参数为FastDFSFile
     *
     * @param file
     * @return
     */
    public static String[] upload(FastDFSFile file) {
        NameValuePair[] metaList = new NameValuePair[1];
        metaList[0] = new NameValuePair("author", file.getAuthor());
        storageClient = new StorageClient(trackerServer, storageServer);
        String[] uploadResult = null;
        try {
            uploadResult = storageClient.upload_file(file.getContent(), file.getExt(), metaList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        String groupName = uploadResult[0];
        String remoteFileName = uploadResult[1];
        System.out.println("组名：" + groupName + "：远程文件名：" + remoteFileName);
        return uploadResult;
    }

    /**
     * 上传文件,重载一个直接传入MultipartFile的方法
     *
     * @param multipartFile
     * @return
     */
    public static String[] upload(MultipartFile multipartFile) throws IOException {
        FastDFSFile file = initFastDFSFile(multipartFile);
        return upload(file);
    }

    /**
     * 上传文件,重载一个直接传入File的方法
     *
     * @param file
     * @return
     */
    public static String[] upload(File file) {
        FastDFSFile fastDFSFile = initFastDFSFile(file);
        return upload(fastDFSFile);
    }

    /**
     * 获取文件信息
     *
     * @param groupName
     * @param remoteFileName
     * @return
     */
    public static FileInfo getFileInfo(String groupName, String remoteFileName) {
        try {
            storageClient = new StorageClient(trackerServer, storageServer);
            return storageClient.get_file_info(groupName, remoteFileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 下载文件
     *
     * @param groupName
     * @param remoteFileName
     * @return
     */
    public static InputStream downloadFile(String groupName, String remoteFileName) {
        try {
            storageClient = new StorageClient(trackerServer, storageServer);
            byte[] bytes = storageClient.download_file(groupName, remoteFileName);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            return inputStream;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 删除文件
     *
     * @param groupName
     * @param remoteFileName
     * @throws IOException
     * @throws MyException
     */
    public static void deleteFile(String groupName, String remoteFileName) throws IOException, MyException {
        storageClient = new StorageClient(trackerServer, storageServer);
        int i = storageClient.delete_file(groupName, remoteFileName);
        System.out.println("删除成功：" + i);
    }

    /**
     * 将MultipartFile初始化为FastDFSFile
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static FastDFSFile initFastDFSFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        byte[] file_buff = null;
        InputStream inputStream = file.getInputStream();
        if (inputStream != null) {
            int len1 = inputStream.available();
            file_buff = new byte[len1];
            inputStream.read(file_buff);
        }
        inputStream.close();
        FastDFSFile fastDFSFile = new FastDFSFile(fileName, file_buff, ext);
        return fastDFSFile;
    }

    /**
     * 将MultipartFile初始化为FastDFSFile
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static FastDFSFile initFastDFSFile(File file) {
        String fileName = file.getName();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        FastDFSFile fastDFSFile = new FastDFSFile(fileName, FileUtil.readBytes(file), ext);
        return fastDFSFile;
    }

    /**
     * 获取tracker在服务器的路径
     *
     * @return
     * @throws IOException
     */
    public static String getTrackerUrl() throws IOException {
        return "http://" + trackerServer.getInetSocketAddress().getHostString() + ":" + ClientGlobal.getG_tracker_http_port() + "/";
    }
}
