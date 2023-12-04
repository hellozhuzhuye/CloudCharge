package top.smartsoftware.cloud.service.impl;

import top.smartsoftware.cloud.entity.User;
import top.smartsoftware.cloud.mapper.UserMapper;
import top.smartsoftware.cloud.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xjx
 * @since 2023-11-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
