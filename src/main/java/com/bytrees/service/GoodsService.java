package com.bytrees.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bytrees.entity.Goods;
import com.bytrees.mapper.GoodsMapper;

public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public Goods get(int goodsId) {
        return goodsMapper.get(goodsId);
    }
}
