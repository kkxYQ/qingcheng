package com.qingcheng.system;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.system.Menu;

import java.util.*;

/**
 * menu业务逻辑层
 */
public interface MenuService {


    public List<Menu> findAll();


    public PageResult<Menu> findPage(int page, int size);


    public List<Menu> findList(Map<String,Object> searchMap);


    public PageResult<Menu> findPage(Map<String,Object> searchMap,int page, int size);


    public Menu findById(String id);

    public void add(Menu menu);


    public void update(Menu menu);


    public void delete(String id);

    public List<Map> findAllMenu();

    public List<Map> findAllMenuAdmin(String name);

    public List<Map> findMenuListByParentId(List<Menu> menuList,String ParentId);

}
