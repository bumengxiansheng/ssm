package com.zking.ssm.cy.service.impl;

import com.zking.ssm.cy.mapper.SysMenuMapper;
import com.zking.ssm.cy.model.SysMenu;
import com.zking.ssm.cy.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements ISysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public int deleteByPrimaryKey(Long menuId) {
        return 0;
    }

    @Override
    public int insert(SysMenu record) {
        return 0;
    }

    @Override
    public int insertSelective(SysMenu record) {
        return 0;
    }

    @Override
    public SysMenu selectByPrimaryKey(Long menuId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SysMenu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysMenu record) {
        return 0;
    }

    @Override
    public List<SysMenu> listAll(SysMenu record) {
        List<SysMenu> sysMenuList = sysMenuMapper.listAll(record);
        record.setSysMenuList(sysMenuMapper.initChildren(record));
        return sysMenuList;
    }

    @Override
    public List<SysMenu> initChildren(SysMenu record) {
        List<SysMenu> children = sysMenuMapper.initChildren(record);
        return null;
    }


}
