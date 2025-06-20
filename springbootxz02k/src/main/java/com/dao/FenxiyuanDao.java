package com.dao;

import com.entity.FenxiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxiyuanVO;
import com.entity.view.FenxiyuanView;


/**
 * 分析员
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:34
 */
public interface FenxiyuanDao extends BaseMapper<FenxiyuanEntity> {
	
	List<FenxiyuanVO> selectListVO(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
	
	FenxiyuanVO selectVO(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
	
	List<FenxiyuanView> selectListView(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);

	List<FenxiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
	
	FenxiyuanView selectView(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
	

}
