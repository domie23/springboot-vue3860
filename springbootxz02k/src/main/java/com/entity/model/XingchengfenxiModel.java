package com.entity.model;

import com.entity.XingchengfenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 行程分析
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public class XingchengfenxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
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
	 * 分析员账号
	 */
	
	private String fenxiyuanzhanghao;
		
	/**
	 * 分析员姓名
	 */
	
	private String fenxiyuanxingming;
		
	/**
	 * 风险评估
	 */
	
	private String fengxianpinggu;
		
	/**
	 * 评估结果
	 */
	
	private String pinggujieguo;
		
	/**
	 * 评估时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pinggushijian;
				
	
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
	 * 设置：分析员账号
	 */
	 
	public void setFenxiyuanzhanghao(String fenxiyuanzhanghao) {
		this.fenxiyuanzhanghao = fenxiyuanzhanghao;
	}
	
	/**
	 * 获取：分析员账号
	 */
	public String getFenxiyuanzhanghao() {
		return fenxiyuanzhanghao;
	}
				
	
	/**
	 * 设置：分析员姓名
	 */
	 
	public void setFenxiyuanxingming(String fenxiyuanxingming) {
		this.fenxiyuanxingming = fenxiyuanxingming;
	}
	
	/**
	 * 获取：分析员姓名
	 */
	public String getFenxiyuanxingming() {
		return fenxiyuanxingming;
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
	 * 设置：评估结果
	 */
	 
	public void setPinggujieguo(String pinggujieguo) {
		this.pinggujieguo = pinggujieguo;
	}
	
	/**
	 * 获取：评估结果
	 */
	public String getPinggujieguo() {
		return pinggujieguo;
	}
				
	
	/**
	 * 设置：评估时间
	 */
	 
	public void setPinggushijian(Date pinggushijian) {
		this.pinggushijian = pinggushijian;
	}
	
	/**
	 * 获取：评估时间
	 */
	public Date getPinggushijian() {
		return pinggushijian;
	}
			
}
