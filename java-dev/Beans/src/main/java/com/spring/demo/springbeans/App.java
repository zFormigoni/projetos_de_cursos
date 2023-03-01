package com.spring.demo.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);

        livro.setNome("nome ");
        livro.setCodigo("codigo");
        autor.setNome("Autor");
        livro.exibir();
    }
}
