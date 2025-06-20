package com.dao;

import com.entity.CaijiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaijiyuanVO;
import com.entity.view.CaijiyuanView;


/**
 * 采集员
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:34
 */
public interface CaijiyuanDao extends BaseMapper<CaijiyuanEntity> {
	
	List<CaijiyuanVO> selectListVO(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
	
	CaijiyuanVO selectVO(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
	
	List<CaijiyuanView> selectListView(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);

	List<CaijiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
	
	CaijiyuanView selectView(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
	

}
