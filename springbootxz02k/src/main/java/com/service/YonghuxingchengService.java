package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxingchengView;


/**
 * 用户行程
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface YonghuxingchengService extends IService<YonghuxingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxingchengVO> selectListVO(Wrapper<YonghuxingchengEntity> wrapper);
   	
   	YonghuxingchengVO selectVO(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
   	
   	List<YonghuxingchengView> selectListView(Wrapper<YonghuxingchengEntity> wrapper);
   	
   	YonghuxingchengView selectView(@Param("ew") Wrapper<YonghuxingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxingchengEntity> wrapper);
   	

}

