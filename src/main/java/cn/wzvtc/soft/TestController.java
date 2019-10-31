package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@CrossOrigin(origins = "http://127.0.0.1:5500")
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