package br.com.receitasiziapi.service;

import br.com.receitasiziapi.dto.UserDto;
import br.com.receitasiziapi.interfaces.IService;
import br.com.receitasiziapi.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService implements IService<UserDto, Integer> {

    final UserRepository userRepository;

    public UserService(UserRepository produtoRepository) {
        this.userRepository = produtoRepository;
    }

     /**
     * Esse método cria um novo usuario.
     *
     * @param entity Objeto UserDto contendo os dados do produto a ser criado.
     * @return Retorna o UserDto criado.
     */
    @Override
    public UserDto create(UserDto entity) {
        log.info("ProdutoService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de um usuario específico com base no ID fornecido.
     *
     * @param id ID do usuario a ser retornado.
     * @return Retorna o UserDto correspondente ao ID fornecido.
     */
    @Override
    public UserDto read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todos os usuarios.
     *
     * @return Retorna uma lista de UserDto contendo todos os usuarios.
     */
    @Override
    public List<UserDto> read() {
        log.info("ProdutoService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de um produto existente com base no ID fornecido.
     *
     * @param id ID do User a ser atualizado.
     * @param entity Objeto UserDto contendo os novos dados do User.
     * @return Retorna o UserDto atualizado.
     */
    @Override
    public UserDto update(Integer id, UserDto entity) {
        log.info("UserService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui um User específico com base no ID fornecido.
     *
     * @param id ID do User a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("UserService::delete(id)");
    }
}