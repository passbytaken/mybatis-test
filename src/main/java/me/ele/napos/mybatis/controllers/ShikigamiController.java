package me.ele.napos.mybatis.controllers;

import me.ele.napos.mybatis.service.ShikigamiService;
import me.ele.napos.mybatis.struct.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jakoo on 2017/1/16.
 */

@RestController
@RequestMapping("/sh")
public class ShikigamiController {
    @Autowired
    private ShikigamiService shikigamiService;


    @RequestMapping(value = "shikigami/{id}")
    public ShikigamiResult getById(@PathVariable int id) {
        Shikigami shikigami = shikigamiService.getById(id);

        if (shikigami == null) {
            return new ShikigamiResult(StatusType.EXCEPTION, "式神不存在");
        }

        ShikigamiResult result = new ShikigamiResult(StatusType.SUCCESS);
        result.setShikigami(shikigami);
        return result;
    }

    @RequestMapping(value = "queryAll")
    public Map<String, Object> queryAll() {
        Map<String, Object> map  = new HashMap<String, Object>();
        map.put("result", shikigamiService.queryAll());
        return map;
    }


    @RequestMapping(value = "create", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ShikigamiResult create(@RequestBody ShikigamiCreation creation) {
        if (creation == null) {
            return new ShikigamiResult(StatusType.EXCEPTION, "输入信息不合法");
        }

        if (StringUtils.isEmpty(creation.getName())) {
            return new ShikigamiResult(StatusType.EXCEPTION, "式神名不能为空");
        }

        ShikigamiResult result = new ShikigamiResult(StatusType.SUCCESS);
        result.setShikigami(shikigamiService.create(creation));
        return result;
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public void delete(@RequestBody int id) {
        shikigamiService.delete(id);
    }
}
