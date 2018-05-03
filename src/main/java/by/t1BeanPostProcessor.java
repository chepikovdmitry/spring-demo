package by;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class t1BeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        System.out.println("t1BeanPostProcessor.postProcessBeforeInitialization"+" - "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("t1BeanPostProcessor.postProcessAfterInitialization"+" - "+beanName);
        return bean;
    }
}
