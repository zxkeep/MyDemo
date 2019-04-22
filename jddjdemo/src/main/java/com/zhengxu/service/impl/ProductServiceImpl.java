package com.zhengxu.service.impl;

import com.zhengxu.domain.Product;
import com.zhengxu.mapper.ProductMapper;
import com.zhengxu.service.IProductService;
import com.zhengxu.utils.RedisCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements IProductService  {

    @Autowired
    private RedisCacheManager redisCacheManager;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {

        List<Product> list = null;
        try {
//            Set<String> allKeys = redisCacheManager.getAllKeys();
//            list = new ArrayList<>();
//            for(String key:allKeys ){
//                Product p = (Product) redisCacheManager.get(key);
//                list.add(p);
//            }
            list = (List<Product>) redisCacheManager.get("product");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list==null || list.size()<0){
            System.out.println("从数据库获取："+productMapper.selectAll());
            return productMapper.selectAll();
        }else{
            list.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o1.getId()-o2.getId());
                }
            });
            System.out.println("从redis获取："+list);
            return list;
        }
    }
}
