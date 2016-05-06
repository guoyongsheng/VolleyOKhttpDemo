package xmen.doshr.com.volleyokhttpdemo.util;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by wesley on 2016/4/1.
 */
public class RequestUtil
{

    /**
     * post请求
     *
     * @param context       上下文对象
     * @param tag           标志
     * @param url           请求地址
     * @param params        参数
     * @param listener      正确的回调
     * @param errorListener 错误的回调
     */
    public static void post(Context context, Object tag, String url, final Map<String, String> params, Response.Listener listener, Response.ErrorListener errorListener)
    {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, listener, errorListener)
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError
            {
                return params;
            }
        };
        VolleyUtil.getInstance(context).addToRequest(stringRequest, tag);
    }


    /**
     * 自定义post请求
     *
     * @param context
     * @param tag
     * @param type
     * @param params
     * @param listener
     * @param errorListener
     */
    public static void post(Context context, Object tag, String url, Type type, final Map<String, String> params, Response.Listener listener, Response.ErrorListener errorListener)
    {
        GsonRequest gsonRequest = new GsonRequest(Request.Method.POST, url, type, listener, errorListener)
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError
            {
                return params;
            }
        };

        VolleyUtil.getInstance(context).addToRequest(gsonRequest, tag);
    }
}
