package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController("/" )
public class TestController {
    @RequestMapping(value="data.json")
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","刘笑锋996");
        resultMap.put("mynumber","2012020045");
        return resultMap;
    }
}