package com.zking.ssm.cy.service;

import com.zking.ssm.cy.model.SysMenu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISysMenuService {
    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> listAll(SysMenu record);

    List<SysMenu> initChildren(SysMenu record);

}
