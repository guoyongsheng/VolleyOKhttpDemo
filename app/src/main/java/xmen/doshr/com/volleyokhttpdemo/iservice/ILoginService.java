package xmen.doshr.com.volleyokhttpdemo.iservice;

import android.content.Context;

/**
 * Created by wesley on 2016/4/1.
 * 登陆的接口
 */
public interface ILoginService
{
    /**
     * 登陆
     * @param userName 用户名
     * @param password 密码
     */
    void login(Context context, Object tag, String userName, String password, CallbackListener listener);
}
