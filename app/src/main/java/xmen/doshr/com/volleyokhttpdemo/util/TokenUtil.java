package xmen.doshr.com.volleyokhttpdemo.util;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import xmen.doshr.com.volleyokhttpdemo.entitiy.BaseDTO;

/**
 * Created by wesley on 2016/4/1.
 */
public class TokenUtil<T>
{
    private static TokenUtil instance;


    public TokenUtil()
    {

    }


    public static TokenUtil getInstance()
    {
        if (instance == null)
        {
            instance = new TokenUtil();
        }

        return instance;
    }

    //判空
    public boolean checkIsNull(T value)
    {
        if (value == null)
        {
            return true;
        }


        return false;
    }


    //token校验
    public boolean checkToken(BaseDTO value)
    {
        if (value == null)
        {
            return false;
        }

        return false;
    }


    public Type getType()
    {
        Type type = new TypeToken<T>()
        {
        }.getType();
        return type;
    }
}
