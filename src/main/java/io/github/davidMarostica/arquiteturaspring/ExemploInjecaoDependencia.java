package io.github.davidMarostica.arquiteturaspring;

import io.github.davidMarostica.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import io.github.davidMarostica.arquiteturaspring.todos.TodoValidator;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null;// new SimpleJpaRepository<TodoEntity, Integer>(null, null);
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoService = new TodoService(repository, todoValidator, sender);


//        BeanGerenciado beanGerenciado = new BeanGerenciado(null);
//        beanGerenciado.setValidator(todoValidator);
//        if(codicao == true){
//            beanGerenciado.setValidator();
//        }
    }
}