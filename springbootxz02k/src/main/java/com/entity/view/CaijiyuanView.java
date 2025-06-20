package com.entity.view;

import com.entity.CaijiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采集员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:34
 */
@TableName("caijiyuan")
public class CaijiyuanView  extends CaijiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaijiyuanView(){
	}
 
 	public CaijiyuanView(CaijiyuanEntity caijiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, caijiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
