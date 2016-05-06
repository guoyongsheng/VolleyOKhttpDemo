package xmen.doshr.com.volleyokhttpdemo.entitiy;

import java.io.Serializable;

/**
 * Created by wesley on 2016/4/1.
 */
public class UserInfoBean implements Serializable
{
    private int id; //id
    private String username; //用户名
    private String mobile; //电话号码
    private String introduce; //简介
    private String sex; //性别
    private String age; //年龄

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getIntroduce()
    {
        return introduce;
    }

    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }
}
