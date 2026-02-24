package co.istad.chhaya.fswd_sbapp.bean;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


// @Scope("prototype") // MyAnnotationBean lg jea singleton tt ai ber hav scope, dak prototype vea klay jea scope prototype venh
// MyAnnotationBean bean = new MyAnnotationBean()
// MyAnnotationBean auto singleton

@RestController
@Setter
@Getter
@Component
public class MyAnnotationBean {
    String name;
}
