package com.thinkgem.jeesite.common.fastweixin.api.response;

import com.thinkgem.jeesite.common.fastweixin.api.entity.Group;

/**
 * @author peiyu
 */
public class CreateGroupResponse extends BaseResponse {

//    private String id;
//    private String name;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
	
	private Group group;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	
}
