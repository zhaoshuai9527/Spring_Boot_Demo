package com.zs.service;

import com.zs.com.zs.dao.LableDao;
import com.zs.entity.Lable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class LableService {
    @Autowired
    private LableDao lableDao;
    //用于缓存查询
    //啥时候用@Autowired && @Resource
    @Resource
    private RedisTemplate<String,Lable> redisTemplate;

    //查询全部
    public List<Lable> findAll(){
        return lableDao.findAll();
    }

    //缓存查询
    public Lable findByLableIdFromRedis(String id){
        Lable lable = redisTemplate.opsForValue().get("Lable"+id);
        if (lable == null ){
             lable = lableDao.findByLableId(id);
            redisTemplate.opsForValue().set("Lable"+id,lable,100000, TimeUnit.DAYS);
        }
        return lable;
    }
}
