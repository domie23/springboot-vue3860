package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghepingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghepingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghepingguView;


/**
 * 综合评估
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface ZonghepingguService extends IService<ZonghepingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghepingguVO> selectListVO(Wrapper<ZonghepingguEntity> wrapper);
   	
   	ZonghepingguVO selectVO(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
   	
   	List<ZonghepingguView> selectListView(Wrapper<ZonghepingguEntity> wrapper);
   	
   	ZonghepingguView selectView(@Param("ew") Wrapper<ZonghepingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghepingguEntity> wrapper);
   	

}

