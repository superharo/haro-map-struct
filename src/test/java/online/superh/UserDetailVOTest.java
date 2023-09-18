package online.superh;

import online.superh.haro.map.struct.convert.UserConvert;
import online.superh.haro.map.struct.pojo.UserDO;
import online.superh.haro.map.struct.vo.UserDetailVO;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-14 10:22
 */
public class UserDetailVOTest {

    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO().setId(1).setUsername("yudaoyuanma").setPassword("buzhidao");
        UserDetailVO userDetailVO= UserConvert.INSTANCE.convertDetail(userDO);
        System.out.println(userDetailVO);
    }

}
