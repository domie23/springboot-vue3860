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
 * 用户行程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@TableName("yonghuxingcheng")
public class YonghuxingchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuxingchengEntity() {
		
	}
	
	public YonghuxingchengEntity(T t) {
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
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 行程码
	 */
					
	private String xingchengma;
	
	/**
	 * 核酸码
	 */
					
	private String hesuanma;
	
	/**
	 * 外出地
	 */
					
	private String waichudi;
	
	/**
	 * 行程登记
	 */
					
	private String xingchengdengji;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
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
	 * 设置：行程码
	 */
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
	/**
	 * 设置：核酸码
	 */
	public void setHesuanma(String hesuanma) {
		this.hesuanma = hesuanma;
	}
	/**
	 * 获取：核酸码
	 */
	public String getHesuanma() {
		return hesuanma;
	}
	/**
	 * 设置：外出地
	 */
	public void setWaichudi(String waichudi) {
		this.waichudi = waichudi;
	}
	/**
	 * 获取：外出地
	 */
	public String getWaichudi() {
		return waichudi;
	}
	/**
	 * 设置：行程登记
	 */
	public void setXingchengdengji(String xingchengdengji) {
		this.xingchengdengji = xingchengdengji;
	}
	/**
	 * 获取：行程登记
	 */
	public String getXingchengdengji() {
		return xingchengdengji;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}

}
