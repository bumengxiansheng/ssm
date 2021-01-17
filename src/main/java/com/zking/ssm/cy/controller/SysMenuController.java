package com.zking.ssm.cy.controller;

import com.zking.ssm.cy.model.SysMenu;
import com.zking.ssm.cy.service.ISysMenuService;
import com.zking.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys")
public class SysMenuController {
    @Autowired
    private ISysMenuService sysMenuService;

    @RequestMapping("/listAll")
    @ResponseBody
    public JsonData listAll(SysMenu sysMenu) {
        List<SysMenu> sysMenuList = sysMenuService.listAll(sysMenu);
        JsonData jsonData = new JsonData();
        jsonData.setResult(sysMenuList);

        jsonData.setResult2(sysMenu.getSysMenuList());
        System.out.println("二级菜单集合长度"+sysMenu.getSysMenuList().size());

        jsonData.setMessage("所有菜单查询成功");
        jsonData.setCode(0);
        return jsonData;
    }

}
