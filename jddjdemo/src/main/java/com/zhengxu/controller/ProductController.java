package com.zhengxu.controller;

import com.zhengxu.domain.Product;
import com.zhengxu.service.IProductService;
import com.zhengxu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVo add(@RequestBody Product product){
        productService.add(product);
        ResultVo resultVo = new ResultVo();
        resultVo.setErrCode("0000");
        resultVo.setErrMsg("操作成功。。。");
        return resultVo;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody Product product){
        productService.update(product);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public void update(@RequestBody Long id){
        productService.delete(id);
    }

    @RequestMapping(value = "/queryOne",method = RequestMethod.POST)
    public Product queryOne(@RequestBody Long id){
        return productService.getOne(id);
    }

    @RequestMapping(value = "/queryAll",method = RequestMethod.POST)
    public List queryAll(){
        return productService.getAll();
    }
}
