package xmen.doshr.com.volleyokhttpdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.security.MessageDigest;

import xmen.doshr.com.volleyokhttpdemo.Modle.Model;
import xmen.doshr.com.volleyokhttpdemo.R;
import xmen.doshr.com.volleyokhttpdemo.entitiy.UserInfoBean;
import xmen.doshr.com.volleyokhttpdemo.iservice.CallbackListener;

public class MainActivity extends Activity
{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    //初始化
    private void initView()
    {
        Model.getInstance().getLoginService().login(this, this, "18255215889", encode("111111"), new CallbackListener<UserInfoBean>()
        {
            @Override
            public void onSuccess(UserInfoBean response)
            {
                Log.i(TAG, " response " + response);
            }

            @Override
            public void onFailed(String errMessage)
            {
                
            }
        });
    }

    private static String encode(String data)
    {
        // 用于存放返回结果
        String enData = null;
        // 1.存放返回值为哈希值结果
        byte result[] = null;
        if (data != null && data.length() > 0)
        {
            try
            {
                // 2.获得MD5摘要算法的 MessageDigest对象
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null)// 判空
                {
                    // 3.使用给定的字节更新摘要
                    messageDigest.update(data.getBytes());
                    // 4.该函数返回值为存放哈希值结果的byte数组中,获得密文
                    result = messageDigest.digest();
                    // 5.把密文转换成十六进存放在byte数组中
                    enData = toHex(result);
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        // 6.返回密文
        return enData;
    }

    private static String toHex(byte[] data)
    {
        String ret = "";
        // 1.检查参数
        if (data != null && data.length > 0)
        {
            int count = data.length;
            for (int i = 0; i < count; i++)
            {
                // 2. 返回参数的十六进制（基数 16）无符号整数值的字符串。
                String hex = Integer.toHexString(data[i] & 0xFF);
                if (hex.length() == 1)
                {
                    hex = '0' + hex;
                }
                ret += hex;
            }
        }
        return ret;
    }
}
