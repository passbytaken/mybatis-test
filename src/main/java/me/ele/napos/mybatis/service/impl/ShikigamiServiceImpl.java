package me.ele.napos.mybatis.service.impl;

import me.ele.napos.mybatis.dao.EleShikigamiMapper;
import me.ele.napos.mybatis.model.EleShikigami;
import me.ele.napos.mybatis.model.EleShikigamiExample;
import me.ele.napos.mybatis.service.ShikigamiService;
import me.ele.napos.mybatis.struct.Shikigami;
import me.ele.napos.mybatis.struct.ShikigamiCreation;
import me.ele.napos.mybatis.struct.transformers.ShikigamiTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakoo on 2017/1/14.
 *
 */
@Service("shikigamiService")
public class ShikigamiServiceImpl implements ShikigamiService{

    @Autowired(required = false)
    private EleShikigamiMapper eleShikigamiMapper;

    public Shikigami getById(int id) {
        EleShikigami eleShikigamiUser = eleShikigamiMapper.selectByPrimaryKey(id);
        if (eleShikigamiUser == null) {
            return null;
        }
        return ShikigamiTransformer.toShikigami(eleShikigamiUser);
    }

    public List<Shikigami> queryAll() {
        EleShikigamiExample example  = new EleShikigamiExample();
        List<EleShikigami> eleShikigamis = eleShikigamiMapper.selectByExample(example);
        List<Shikigami> shikigamis = new ArrayList<Shikigami>();
        for (EleShikigami shikigami : eleShikigamis) {
            shikigamis.add(ShikigamiTransformer.toShikigami(shikigami));
        }
        return shikigamis;
    }

    public Shikigami create(ShikigamiCreation creation) {
        return null;
    }

    public void delete(int id) {

    }
}
