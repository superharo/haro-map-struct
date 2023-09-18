package online.superh;

import online.superh.haro.map.struct.convert.UserConvert;
import online.superh.haro.map.struct.pojo.UserDO;
import online.superh.haro.map.struct.vo.UserVO;

/**
 * Unit test for simple App.
 */
public class UserVOTest {

    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO().setId(1).setUsername("yudaoyuanma").setPassword("buzhidao");
        UserVO userVO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userVO);
    }

}
