package com.cl.entity;

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
 * 导师信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 13:56:41
 */
@TableName("daoshixinxi")
public class DaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaoshixinxiEntity() {
		
	}
	
	public DaoshixinxiEntity(T t) {
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
	 * 导师姓名
	 */
					
	private String daoshixingming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 研究方向
	 */
					
	private String yanjiufangxiang;
	
	/**
	 * 研究成果
	 */
					
	private String yanjiuchengguo;
	
	/**
	 * 擅长方向
	 */
					
	private String shanzhangfangxiang;
	
	/**
	 * 个人成就
	 */
					
	private String gerenchengjiu;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：导师姓名
	 */
	public void setDaoshixingming(String daoshixingming) {
		this.daoshixingming = daoshixingming;
	}
	/**
	 * 获取：导师姓名
	 */
	public String getDaoshixingming() {
		return daoshixingming;
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
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：研究方向
	 */
	public void setYanjiufangxiang(String yanjiufangxiang) {
		this.yanjiufangxiang = yanjiufangxiang;
	}
	/**
	 * 获取：研究方向
	 */
	public String getYanjiufangxiang() {
		return yanjiufangxiang;
	}
	/**
	 * 设置：研究成果
	 */
	public void setYanjiuchengguo(String yanjiuchengguo) {
		this.yanjiuchengguo = yanjiuchengguo;
	}
	/**
	 * 获取：研究成果
	 */
	public String getYanjiuchengguo() {
		return yanjiuchengguo;
	}
	/**
	 * 设置：擅长方向
	 */
	public void setShanzhangfangxiang(String shanzhangfangxiang) {
		this.shanzhangfangxiang = shanzhangfangxiang;
	}
	/**
	 * 获取：擅长方向
	 */
	public String getShanzhangfangxiang() {
		return shanzhangfangxiang;
	}
	/**
	 * 设置：个人成就
	 */
	public void setGerenchengjiu(String gerenchengjiu) {
		this.gerenchengjiu = gerenchengjiu;
	}
	/**
	 * 获取：个人成就
	 */
	public String getGerenchengjiu() {
		return gerenchengjiu;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
