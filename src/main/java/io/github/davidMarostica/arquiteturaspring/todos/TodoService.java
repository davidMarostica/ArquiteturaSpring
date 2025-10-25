package io.github.davidMarostica.arquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final TodoValidator validator;
    private final MailSender mailSender;

    public TodoService(TodoRepository repository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    // Salva um novo Todo após validação
    public TodoEntity salvar(TodoEntity novoTodo) {
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    // ATUALIZAÇÃO: Retorna a entidade atualizada
    public TodoEntity atualizarStatus(TodoEntity todo) {
        if (!repository.existsById(todo.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo não encontrado");
        }

        // Salva a entidade e armazena o resultado (embora 'save' geralmente retorne o que recebeu)
        TodoEntity todoAtualizado = repository.save(todo);

        String status = Boolean.TRUE.equals(todo.getConcluido()) ? "Concluído" : "Não concluído";
        mailSender.enviar("Todo \"" + todo.getDescricao() + "\" foi atualizado para " + status);

        // Retorna a entidade atualizada
        return todoAtualizado;
    }

    // Busca um Todo por ID com tratamento de erro
    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo não encontrado"));
    }
}