package org.codeman.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author hdgaadd
 * created on 2022/12/23
 */
@Slf4j
public abstract class AbstractAdapter implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("template logic execution!");
        log.info("template logic execution!");
        log.info("template logic execution!");

        initialized();

        log.info("template logic execution!");
        log.info("template logic execution!");
        log.info("template logic execution!");

    }

    // abstract交予子类实现，protected保护该方法不被通过new子类进行调用
    protected abstract void initialized();
}