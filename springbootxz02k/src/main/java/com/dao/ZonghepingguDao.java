package com.dao;

import com.entity.ZonghepingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghepingguVO;
import com.entity.view.ZonghepingguView;


/**
 * 综合评估
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface ZonghepingguDao extends BaseMapper<ZonghepingguEntity> {
	
	List<ZonghepingguVO> selectListVO(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
	
	ZonghepingguVO selectVO(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
	
	List<ZonghepingguView> selectListView(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);

	List<ZonghepingguView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
	
	ZonghepingguView selectView(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
	

}
