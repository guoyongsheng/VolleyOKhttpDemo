package xmen.doshr.com.volleyokhttpdemo.service;

import android.content.Context;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import xmen.doshr.com.volleyokhttpdemo.entitiy.UserDTO;
import xmen.doshr.com.volleyokhttpdemo.iservice.CallbackListener;
import xmen.doshr.com.volleyokhttpdemo.iservice.ILoginService;
import xmen.doshr.com.volleyokhttpdemo.util.RequestUtil;

/**
 * Created by wesley on 2016/4/1.
 * 登陆的service
 */
public class LoginService implements ILoginService
{
    private static final String TAG = "LoginService";

    @Override
    public void login(Context context, Object tag, String userName, String password, final CallbackListener listener)
    {
        String url = "http://192.168.0.30:8082/dsweb/ai/account/loginInfo.json";
        Map<String, String> params = new HashMap<>();
        params.put("telephone", userName);
        params.put("password", password);
        params.put("position", "");

        /*RequestUtil.post(context, tag, url, params, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                Log.i(TAG, " response = " + response);
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Log.i(TAG, " VolleyError = " + error);
            }
        });*/

        Type type = new TypeToken<UserDTO>()
        {
        }.getType();
        RequestUtil.post(context, tag, url, type, params, new Response.Listener<UserDTO>()
        {
            @Override
            public void onResponse(UserDTO response)
            {
                Log.i(TAG, " response = " + response);
            }
        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Log.i(TAG, " VolleyError = " + error);
            }
        });
    }
}
