package com.zking.ssm.cy.service;

import com.zking.ssm.baseTest.BaseTest;
import com.zking.ssm.cy.model.SysMenu;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ISysMenuServiceTest extends BaseTest {
    @Autowired
    private ISysMenuService sysMenuService;
    private SysMenu sysMenu;

    @Before
    public void setUp() throws Exception {
        sysMenu = new SysMenu();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listAllMenu() {
        sysMenu.setParentId(1l);
        List<SysMenu> sysMenuList = sysMenuService.listAll(sysMenu);
        System.out.println(sysMenuList);
        System.out.println(sysMenu.getSysMenuList());
    }
}