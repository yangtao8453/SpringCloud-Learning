package live.yangtao.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author yangtao
 * @since 2022/8/29 0:22
 */
@RestController
@RequestMapping("/http")
public class HttpController {

    @GetMapping("/string")
    public String test(@RequestParam("msg") String msg) {
        return msg;
    }

    @GetMapping("/map")
    public String testRequestParam(@RequestParam Map<String, Object> params) {
        return JSON.toJSONString(params);
    }

    @PostMapping
    public String testPost(@RequestBody Map<String, Object> params) {
        return JSON.toJSONString(params);
    }

}
