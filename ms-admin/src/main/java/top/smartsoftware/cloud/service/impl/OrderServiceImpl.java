package top.smartsoftware.cloud.service.impl;

import top.smartsoftware.cloud.entity.Order;
import top.smartsoftware.cloud.mapper.OrderMapper;
import top.smartsoftware.cloud.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
