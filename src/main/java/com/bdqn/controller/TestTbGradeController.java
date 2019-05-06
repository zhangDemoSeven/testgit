package com.bdqn.controller;


import com.bdqn.service.TestTbGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张佳伟
 * @since 2019-05-06
 */
@RestController
public class TestTbGradeController {

    @Autowired
    private TestTbGradeService testTbGradeService;

    @PostMapping("/del")
    public boolean del(Integer id){
//return true;
        return testTbGradeService.removeById(id);
    }
}
