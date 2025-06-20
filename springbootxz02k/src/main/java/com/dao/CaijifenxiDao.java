package com.dao;

import com.entity.CaijifenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaijifenxiVO;
import com.entity.view.CaijifenxiView;


/**
 * 采集分析
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface CaijifenxiDao extends BaseMapper<CaijifenxiEntity> {
	
	List<CaijifenxiVO> selectListVO(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
	
	CaijifenxiVO selectVO(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
	
	List<CaijifenxiView> selectListView(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);

	List<CaijifenxiView> selectListView(Pagination page,@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
	
	CaijifenxiView selectView(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
	

}
