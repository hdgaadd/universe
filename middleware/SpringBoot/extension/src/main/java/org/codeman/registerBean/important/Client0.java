package org.codeman.registerBean.important;

import lombok.extern.slf4j.Slf4j;
import org.codeman.registerBean.component.User;
import org.codeman.registerBean.factorybean.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author hdgaadd
 * created on 2022/12/20
 *
 * description: 通过implements ImportSelector指定bean的位置，把bean交给Spring管理
 */
@Slf4j
@Import(value = UserImportSelector.class)
public class Client0 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(UserFactory.class);
        context.refresh();

        User user = context.getBean(User.class);
        log.info("the obtained bean is : " + user);
    }
}