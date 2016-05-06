package xmen.doshr.com.volleyokhttpdemo.entitiy;

import java.io.Serializable;

/**
 * Created by wesley on 2016/4/1.
 */
public class BaseDTO implements Serializable
{
    private BaseInfoBean respStatus;
    private int vaild;

    public int getVaild()
    {
        return vaild;
    }

    public void setVaild(int vaild)
    {
        this.vaild = vaild;
    }

    public BaseInfoBean getRespStatus()
    {
        return respStatus;
    }

    public void setRespStatus(BaseInfoBean respStatus)
    {
        this.respStatus = respStatus;
    }
}
