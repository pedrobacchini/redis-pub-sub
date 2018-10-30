package com.github.pedrobacchini;

import com.github.pedrobacchini.domain.Revista;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EditoraTest {

    private Editora editora;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-redis-pubsub.xml");
        editora = context.getBean(Editora.class);
    }

    @Test
    public void test() throws InterruptedException {
        Revista revista = new Revista(116, "Tudo que voce precisa saber sobre JREDIS");
        editora.publicarRevista(revista);
        Thread.sleep(100);
    }
}
