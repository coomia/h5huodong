package com.jeecg.p3.jiugongge.entity;

import java.util.Date;
import java.util.List;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActJiugongge:配置<br>
 * @author junfeng.zhou
 * @since：2015年11月16日 11时07分11秒 星期一 
 * @version:1.0
 */
public class WxActJiugongge implements Entity<String> {
	private static final long serialVersionUID = 1L;
private List<WxActJiugonggeRelation> awarsList;
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}

		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getHdurl() {
		return hdurl;
	}
	public void setHdurl(String hdurl) {
		this.hdurl = hdurl;
	}
	public String getFoucsUserCanJoin() {
		return prizeStatus;
	}
	public void setPrizeStatus(String prizeStatus) {
		this.prizeStatus = prizeStatus;
	}
	public String getJwid() {
	public List<WxActJiugonggeRelation> getAwarsList() {
		return awarsList;
	}
	public void setAwarsList(List<WxActJiugonggeRelation> awarsList) {
		this.awarsList = awarsList;
	}
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	
}
