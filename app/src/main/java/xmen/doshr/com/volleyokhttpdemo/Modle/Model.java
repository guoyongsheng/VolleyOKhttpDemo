package xmen.doshr.com.volleyokhttpdemo.Modle;

import xmen.doshr.com.volleyokhttpdemo.iservice.ILoginService;
import xmen.doshr.com.volleyokhttpdemo.service.LoginService;

/**
 * Created by wesley on 2016/4/1.
 */
public class Model
{
    private static Model instance;
    private static LoginService loginService;

    private Model()
    {

    }

    //单例模式
    public static synchronized Model getInstance()
    {
        if(instance == null)
        {
            instance = new Model();
        }

        return instance;
    }

    //获取登陆的服务
    public ILoginService getLoginService()
    {
        if(loginService == null)
        {
            loginService = new LoginService();
        }

        return loginService;
    }
}
