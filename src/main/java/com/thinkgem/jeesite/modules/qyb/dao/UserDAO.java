package com.thinkgem.jeesite.modules.qyb.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.qyb.entity.WUser;

import java.util.List;

@MyBatisDao
public interface UserDAO extends CrudDao<WUser> {

  WUser getByOpenid(String openid);

  int updateLevel(WUser entity);


  List<WUser> findByCpy(String cpyId);

}
