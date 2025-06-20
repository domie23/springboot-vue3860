package com.dao;

import com.entity.YonghuxingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxingchengVO;
import com.entity.view.YonghuxingchengView;


/**
 * 用户行程
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface YonghuxingchengDao extends BaseMapper<YonghuxingchengEntity> {
	
	List<YonghuxingchengVO> selectListVO(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
	
	YonghuxingchengVO selectVO(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
	
	List<YonghuxingchengView> selectListView(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);

	List<YonghuxingchengView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
	
	YonghuxingchengView selectView(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
	

}
