package com.qingcheng.goods;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Category;

import java.util.*;

/**
 * category业务逻辑层
 */
public interface CategoryService {


    public List<Category> findAll();


    public PageResult<Category> findPage(int page, int size);


    public List<Category> findList(Map<String,Object> searchMap);


    public PageResult<Category> findPage(Map<String,Object> searchMap,int page, int size);


    public Category findById(Integer id);

    public void add(Category category);


    public void update(Category category);


    public void delete(Integer id);

    /**
     * 前端查询分类三级(树状结构)
     * @return
     */
    public List<Map> findCategoryTree();

    /**
     * 将商品分类树放入缓存中
     */
    public void saveCategoryTreeToRedis();

}
