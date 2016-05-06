package xmen.doshr.com.volleyokhttpdemo.entitiy;

import java.io.Serializable;

/**
 * Created by wesley on 2016/4/1.
 */
public class UserDTO extends BaseDTO implements Serializable
{
    private UserInfoBean accountInfoDTO;

    public UserInfoBean getAccountInfoDTO()
    {
        return accountInfoDTO;
    }

    public void setAccountInfoDTO(UserInfoBean accountInfoDTO)
    {
        this.accountInfoDTO = accountInfoDTO;
    }
}
