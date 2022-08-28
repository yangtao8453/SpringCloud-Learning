package live.yangtao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author yangtao
 * @since 2022/8/28 22:18
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        int i = 1 / 0;
    }

}
