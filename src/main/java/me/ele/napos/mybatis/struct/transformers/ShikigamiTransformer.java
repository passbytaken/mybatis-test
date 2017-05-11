package me.ele.napos.mybatis.struct.transformers;


import me.ele.napos.mybatis.model.EleShikigami;
import me.ele.napos.mybatis.struct.Shikigami;

/**
 * Created by jakoo on 2017/1/14.
 */
public class ShikigamiTransformer {

    public static Shikigami toShikigami(EleShikigami shikigami) {
        Shikigami shikigami1 = new Shikigami();

        shikigami1.setId(shikigami.getId());
        shikigami1.setName(shikigami.getName());
        shikigami1.setType(shikigami.getType());
        shikigami1.setCv(shikigami.getCv());
        shikigami1.setAttackNum(shikigami.getAttackNum());
        shikigami1.setAttackType(shikigami.getAttackType());

        shikigami1.setLivesNum(shikigami.getLivesNum());
        shikigami1.setLivesType(shikigami.getLivesType());

        shikigami1.setDefenseNum(shikigami.getDefenseNum());
        shikigami1.setDefenseType(shikigami.getDefenseType());

        shikigami1.setSpeedNum(shikigami.getSpeedNum());
        shikigami1.setSpeedType(shikigami.getSpeedType());

        shikigami1.setCriticalNum(shikigami.getSpeedNum());
        shikigami1.setCriticalType(shikigami.getCriticalType());

        return shikigami1;
    }

}
