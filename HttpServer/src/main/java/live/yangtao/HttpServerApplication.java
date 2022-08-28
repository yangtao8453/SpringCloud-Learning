package live.yangtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 提供接口服务
 * @author yangtao
 * @since 2022/8/29 0:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HttpServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpServerApplication.class, args);
    }
}
