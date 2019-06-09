package com.persistent.pojo;

import java.util.Date;

/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.pojo
 * @Author: runll
 * @CreateTime: 2019-06-05 18:46
 * @Description: ${Description}
 */
public class IUsers {
    private int student_id;
    private String username;
    private String password;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "IUsers{" +
                "student_id=" + student_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
