package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DaoshixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DaoshixinxiView;


/**
 * 导师信息
 *
 * @author 
 * @email 
 * @date 2024-03-05 13:56:41
 */
public interface DaoshixinxiService extends IService<DaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaoshixinxiView> selectListView(Wrapper<DaoshixinxiEntity> wrapper);
   	
   	DaoshixinxiView selectView(@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaoshixinxiEntity> wrapper);
   	

}

