package co.istad.chhaya.fswd_sbapp.bean;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class MyBeanController {
    // 1. declare dependency
    private final MyAnnotationBean bean; // required dependency
    private MyAnnotationBean bean2; // optional dependency

    // 2. inject dependency (constructor based)
    public MyBeanController(MyAnnotationBean bean) {
        this.bean = bean;
    }

    // 3. inject dependency (setter based)
    @Autowired
    public void setBean(MyAnnotationBean bean2) {
        this.bean2 = bean2;
    }

    @GetMapping("/bean")
    public List<MyAnnotationBean> getBean(){
    System.out.println("Bean: " + bean);
    System.out.println("Bean2: " + bean2);
    bean.name = "Dara";
    bean2.name = "Kanha";
    return List.of(bean, bean2);
    }
}
