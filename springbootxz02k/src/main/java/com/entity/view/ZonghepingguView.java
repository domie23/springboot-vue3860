package com.entity.view;

import com.entity.ZonghepingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合评估
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@TableName("zonghepinggu")
public class ZonghepingguView  extends ZonghepingguEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghepingguView(){
	}
 
 	public ZonghepingguView(ZonghepingguEntity zonghepingguEntity){
 	try {
			BeanUtils.copyProperties(this, zonghepingguEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
