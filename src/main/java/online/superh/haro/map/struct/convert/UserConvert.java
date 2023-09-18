package online.superh.haro.map.struct.convert;

import online.superh.haro.map.struct.pojo.UserDO;
import online.superh.haro.map.struct.vo.UserDetailVO;
import online.superh.haro.map.struct.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-09-14 10:04
 */
@Mapper
//声明它是一个 MapStruct Mapper 映射器
public interface UserConvert {

    //获得 MapStruct 帮我们自动生成的 UserConvert 实现类的对象
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserVO convert(UserDO userDO);


    @Mappings(value = {
            @Mapping(source = "id", target = "userId")
    })
    UserDetailVO convertDetail(UserDO userDO);

}
