package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxiyuanView;


/**
 * 分析员
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:34
 */
public interface FenxiyuanService extends IService<FenxiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxiyuanVO> selectListVO(Wrapper<FenxiyuanEntity> wrapper);
   	
   	FenxiyuanVO selectVO(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
   	
   	List<FenxiyuanView> selectListView(Wrapper<FenxiyuanEntity> wrapper);
   	
   	FenxiyuanView selectView(@Param("ew") Wrapper<FenxiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxiyuanEntity> wrapper);
   	

}

