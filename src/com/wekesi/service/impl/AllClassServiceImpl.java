package com.wekesi.service.impl;

import com.wekesi.dao.AllClassMapper;
import com.wekesi.pojo.AllClass;
import com.wekesi.pojo.AllClassExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by weixi on 2017/5/15.
 */
@Service
public class AllClassServiceImpl implements AllClassService {
    @Autowired
    private AllClassMapper allClassMapper;


    @Override

    public List<AllClass> list() {


        AllClassExample example=new AllClassExample();;
        List<AllClass> list = allClassMapper.selectByExample(example);

        return list;
    }
}
