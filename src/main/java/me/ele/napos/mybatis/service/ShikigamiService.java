package me.ele.napos.mybatis.service;

import me.ele.napos.mybatis.struct.Shikigami;
import me.ele.napos.mybatis.struct.ShikigamiCreation;

import java.util.List;

/**
 * Created by jakoo on 2017/1/14.
 */
public interface ShikigamiService {
    Shikigami getById(int id);

    List<Shikigami> queryAll();

    Shikigami create(ShikigamiCreation creation);

    void delete(int id);
}
