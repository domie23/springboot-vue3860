package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XingchengfenxiEntity;
import com.entity.view.XingchengfenxiView;

import com.service.XingchengfenxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 行程分析
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@RestController
@RequestMapping("/xingchengfenxi")
public class XingchengfenxiController {
    @Autowired
    private XingchengfenxiService xingchengfenxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XingchengfenxiEntity xingchengfenxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fenxiyuan")) {
			xingchengfenxi.setFenxiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XingchengfenxiEntity> ew = new EntityWrapper<XingchengfenxiEntity>();
		PageUtils page = xingchengfenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingchengfenxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XingchengfenxiEntity xingchengfenxi, 
		HttpServletRequest request){
        EntityWrapper<XingchengfenxiEntity> ew = new EntityWrapper<XingchengfenxiEntity>();
		PageUtils page = xingchengfenxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingchengfenxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XingchengfenxiEntity xingchengfenxi){
       	EntityWrapper<XingchengfenxiEntity> ew = new EntityWrapper<XingchengfenxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xingchengfenxi, "xingchengfenxi")); 
        return R.ok().put("data", xingchengfenxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XingchengfenxiEntity xingchengfenxi){
        EntityWrapper< XingchengfenxiEntity> ew = new EntityWrapper< XingchengfenxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xingchengfenxi, "xingchengfenxi")); 
		XingchengfenxiView xingchengfenxiView =  xingchengfenxiService.selectView(ew);
		return R.ok("查询行程分析成功").put("data", xingchengfenxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XingchengfenxiEntity xingchengfenxi = xingchengfenxiService.selectById(id);
        return R.ok().put("data", xingchengfenxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XingchengfenxiEntity xingchengfenxi = xingchengfenxiService.selectById(id);
        return R.ok().put("data", xingchengfenxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XingchengfenxiEntity xingchengfenxi, HttpServletRequest request){
    	xingchengfenxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingchengfenxi);
        xingchengfenxiService.insert(xingchengfenxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XingchengfenxiEntity xingchengfenxi, HttpServletRequest request){
    	xingchengfenxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingchengfenxi);
        xingchengfenxiService.insert(xingchengfenxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XingchengfenxiEntity xingchengfenxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xingchengfenxi);
        xingchengfenxiService.updateById(xingchengfenxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xingchengfenxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XingchengfenxiEntity> wrapper = new EntityWrapper<XingchengfenxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fenxiyuan")) {
			wrapper.eq("fenxiyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xingchengfenxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
