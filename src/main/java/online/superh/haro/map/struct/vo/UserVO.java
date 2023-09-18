package online.superh.haro.map.struct.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-14 9:59
 */
@Data
@Accessors(chain = true)
public class UserVO {
    /** 用户编号 **/
    private Integer id;
    /** 用户名 **/
    private String username;
    /** 密码 **/
    private String password;
}
