package xmen.doshr.com.volleyokhttpdemo.iservice;

/**
 * Created by wesley on 2016/4/1.
 * 接口回调
 */
public interface CallbackListener<T>
{
    void onSuccess(T response);

    void onFailed(String errMessage);
}
