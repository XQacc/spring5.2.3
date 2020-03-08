package test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Configuration
@ComponentScan("test")
@EnableAspectJAutoProxy
public class Appconfig {
}
