package com.dao;

import com.entity.CaijishujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaijishujuVO;
import com.entity.view.CaijishujuView;


/**
 * 采集数据
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface CaijishujuDao extends BaseMapper<CaijishujuEntity> {
	
	List<CaijishujuVO> selectListVO(@Param("ew") Wrapper<CaijishujuEntity> wrapper);
	
	CaijishujuVO selectVO(@Param("ew") Wrapper<CaijishujuEntity> wrapper);
	
	List<CaijishujuView> selectListView(@Param("ew") Wrapper<CaijishujuEntity> wrapper);

	List<CaijishujuView> selectListView(Pagination page,@Param("ew") Wrapper<CaijishujuEntity> wrapper);
	
	CaijishujuView selectView(@Param("ew") Wrapper<CaijishujuEntity> wrapper);
	

}
