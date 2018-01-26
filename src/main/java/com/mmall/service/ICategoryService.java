package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.List;

/**
 * Created by 汪刘德 on 2018/1/12.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
