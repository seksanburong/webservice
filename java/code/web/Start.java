package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Initialize.class);
    }
}
@SpringBootApplication
class Initialize{}

@RestController
class sample{
    @GetMapping("/area") //http://localhost:30000/area?width=8.0&&height=4.0
    double area(double width,double height){
        return width*height;
    }
}
