package tech.shop.ease;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * feat: Knife4j 接口文档配置
 * https://doc.xiaominfo.com/knife4j/documentation/get_start.html
 *
 * @author jony
 */
@Configuration
public class Knife4jConfig {
    @Bean
    public GroupedOpenApi systemApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"tech.shop.ease.module.auth"};
        return GroupedOpenApi.builder().group("1").displayName("认证 API").pathsToMatch(paths).packagesToScan(packagedToMatch).build();
    }

    @Bean
    public GroupedOpenApi quartzApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"tech.shop.ease.module.user"};
        return GroupedOpenApi.builder().group("2").displayName("用户 API").pathsToMatch(paths).packagesToScan(packagedToMatch).build();
    }

    @Bean
    public GroupedOpenApi monitorApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"tech.shop.ease.fresh"};
        return GroupedOpenApi.builder().group("3").displayName("new API").pathsToMatch(paths).packagesToScan(packagedToMatch).build();
    }

    // @Bean
    // public GroupedOpenApi memberApi() {
    //     String[] paths = {"/**"};
    //     String[] packagedToMatch = {"tech.jony.member"};
    //     return GroupedOpenApi.builder()
    //             .group("4")
    //             .displayName("Member API")
    //             .pathsToMatch(paths)
    //             .packagesToScan(packagedToMatch).build();
    // }
    //
    // @Bean
    // public GroupedOpenApi iotApi() {
    //     String[] paths = {"/**"};
    //     String[] packagedToMatch = {"tech.jony.iot"};
    //     return GroupedOpenApi.builder()
    //             .group("5")
    //             .displayName("Iot API")
    //             .pathsToMatch(paths)
    //             .packagesToScan(packagedToMatch).build();
    // }
    //
    // @Bean
    // public GroupedOpenApi messagewallApi() {
    //     String[] paths = {"/**"};
    //     String[] packagedToMatch = {"tech.jony.wall"};
    //     return GroupedOpenApi.builder()
    //             .group("6")
    //             .displayName("MessageWall API")
    //             .pathsToMatch(paths)
    //             .packagesToScan(packagedToMatch).build();
    // }

    @Bean
    public GroupedOpenApi otherApi() {
        String[] paths = {"/**"};
        String[] packagedToMatch = {"tech.shop.ease"};
        return GroupedOpenApi.builder().group("99").displayName("Other API").pathsToMatch(paths).packagesToExclude("tech.shop.ease.module.auth", "tech.shop.ease.module.user", "tech.shop.ease.fresh").packagesToScan(packagedToMatch).build();
    }

    @Bean
    public OpenAPI openApi() {
        Contact contact = new Contact();
        contact.setName("Jony SpringBoot init");

        return new OpenAPI().info(new Info().title("SpringBoot脚手架").description("快速启动一个Web项目").contact(contact).version("1.1").termsOfService("https://leapsss.tech"));
    }
}
