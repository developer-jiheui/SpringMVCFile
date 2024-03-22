package com.gdu.prj08.config;

import com.gdu.prj08.aspect.MyAfterAspect;
import com.gdu.prj08.aspect.MyAroundAspect;
import com.gdu.prj08.aspect.MyBeforeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AppConfig {

    @Bean
    public MyAroundAspect myAroundAspect(){
        return new MyAroundAspect();
    }

    @Bean
    public MyBeforeAspect myBeforeAspect(){
        return new MyBeforeAspect();
    }

    @Bean
    public MyAfterAspect myAfterAspect(){
        return new MyAfterAspect();
    }
}
