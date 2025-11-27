package br.com.fiap.model.service;

import br.com.fiap.model.entity.Aluno;
import br.com.fiap.model.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
