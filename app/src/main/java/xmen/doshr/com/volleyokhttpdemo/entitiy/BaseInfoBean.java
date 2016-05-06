package xmen.doshr.com.volleyokhttpdemo.entitiy;

import java.io.Serializable;

/**
 * Created by wesley on 2016/4/1.
 */
public class BaseInfoBean implements Serializable
{
    private int code;
    private String msg;

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
