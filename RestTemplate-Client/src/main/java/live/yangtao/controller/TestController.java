package live.yangtao.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangtao
 * @since 2022/8/28 22:50
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String test() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:10003/http/map";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, Object> params = new HashMap<>();
        params.put("p1", "v1");
        params.put("p2", "v2");

        StringBuilder paramsSb = new StringBuilder();
        params.forEach((k, v) -> {
            paramsSb.append("&").append(k.toString()).append("=").append(v.toString());
        });
        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<Object> res = restTemplate.exchange(url + "?" + paramsSb.substring(1), HttpMethod.GET, httpEntity, Object.class);
        return "This is test.";
    }

}
