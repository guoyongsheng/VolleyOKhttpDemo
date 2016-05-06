package xmen.doshr.com.volleyokhttpdemo.util;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.volley.VolleyUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;

import java.io.InputStream;

/**
 * Created by wesley on 2016/4/1.
 * 网络请求 volley工具类
 */
public class VolleyUtil
{
    private static VolleyUtil instance;
    private static Context context;
    private RequestQueue requestQueue;

    private VolleyUtil(Context context)
    {
        this.context = context;
        getRequestQueue();
    }

    //单例模式
    public static synchronized VolleyUtil getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new VolleyUtil(context);
        }

        return instance;
    }

    //获取请求队列
    private RequestQueue getRequestQueue()
    {
        if (requestQueue == null && context != null)
        {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext(), new OkHttpStack());
            Glide.get(context.getApplicationContext()).register(GlideUrl.class, InputStream.class, new VolleyUrlLoader.Factory(requestQueue));
        }

        return requestQueue;
    }

    //添加请求
    public <T> void addToRequest(Request<T> request, Object tag)
    {
        if(request != null)
        {
            request.setTag(tag);
            getRequestQueue().add(request);
        }
    }

    //取消请求
    public void cancelAllRequest(Object tag)
    {
        getRequestQueue().cancelAll(tag);
    }
}
