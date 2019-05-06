package com.bdqn.controller;


import com.bdqn.pojo.TestTbGrade;
import com.bdqn.service.TestTbGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return testTbGradeService.removeById(id);
    }

    @PostMapping("/select")
    public List<TestTbGrade> list(){
        return testTbGradeService.list();
    }
}
