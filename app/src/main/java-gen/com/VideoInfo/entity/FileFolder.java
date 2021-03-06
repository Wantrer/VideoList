package com.VideoInfo.entity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FILE_FOLDER".
 */
public class FileFolder {

    private Long id;
    private String file_Name;
    private String file_Path;
    private Boolean file_check;

    public FileFolder() {
    }

    public FileFolder(Long id) {
        this.id = id;
    }

    public FileFolder(Long id, String file_Name, String file_Path, Boolean file_check) {
        this.id = id;
        this.file_Name = file_Name;
        this.file_Path = file_Path;
        this.file_check = file_check;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFile_Name() {
        return file_Name;
    }

    public void setFile_Name(String file_Name) {
        this.file_Name = file_Name;
    }

    public String getFile_Path() {
        return file_Path;
    }

    public void setFile_Path(String file_Path) {
        this.file_Path = file_Path;
    }

    public Boolean getFile_check() {
        return file_check;
    }

    public void setFile_check(Boolean file_check) {
        this.file_check = file_check;
    }

}
