package com.zx.sto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper
public interface IStockDao {

    public List<IStockDao> queryList();
}
