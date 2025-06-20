package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 综合评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@TableName("zonghepinggu")
public class ZonghepingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghepingguEntity() {
		
	}
	
	public ZonghepingguEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 风险评估
	 */
					
	private String fengxianpinggu;
	
	/**
	 * 预警
	 */
					
	private String yujing;
	
	/**
	 * 处理情况
	 */
					
	private String chuliqingkuang;
	
	/**
	 * 评估日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pingguriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：风险评估
	 */
	public void setFengxianpinggu(String fengxianpinggu) {
		this.fengxianpinggu = fengxianpinggu;
	}
	/**
	 * 获取：风险评估
	 */
	public String getFengxianpinggu() {
		return fengxianpinggu;
	}
	/**
	 * 设置：预警
	 */
	public void setYujing(String yujing) {
		this.yujing = yujing;
	}
	/**
	 * 获取：预警
	 */
	public String getYujing() {
		return yujing;
	}
	/**
	 * 设置：处理情况
	 */
	public void setChuliqingkuang(String chuliqingkuang) {
		this.chuliqingkuang = chuliqingkuang;
	}
	/**
	 * 获取：处理情况
	 */
	public String getChuliqingkuang() {
		return chuliqingkuang;
	}
	/**
	 * 设置：评估日期
	 */
	public void setPingguriqi(Date pingguriqi) {
		this.pingguriqi = pingguriqi;
	}
	/**
	 * 获取：评估日期
	 */
	public Date getPingguriqi() {
		return pingguriqi;
	}

}
