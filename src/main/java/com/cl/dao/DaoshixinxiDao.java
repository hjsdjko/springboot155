package com.cl.dao;

import com.cl.entity.DaoshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DaoshixinxiView;


/**
 * 导师信息
 * 
 * @author 
 * @email 
 * @date 2024-03-05 13:56:41
 */
public interface DaoshixinxiDao extends BaseMapper<DaoshixinxiEntity> {
	
	List<DaoshixinxiView> selectListView(@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);

	List<DaoshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);
	
	DaoshixinxiView selectView(@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);
	

}
