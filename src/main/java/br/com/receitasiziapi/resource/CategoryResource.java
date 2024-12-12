package br.com.receitasiziapi.resource;

import br.com.receitasiziapi.dto.CategoryDto;
import br.com.receitasiziapi.interfaces.IResource;
import br.com.receitasiziapi.service.CategoryService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/category" )
@Tag(name = "category", description = "Documentação relacionada a resource(recurso) category")
public class CategoryResource implements IResource<CategoryDto, Integer> {

    final CategoryService categoryService;

    public  CategoryResource( CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * Mètodo para criar T
     *
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201",
                    content = { @Content(schema = @Schema(implementation = UserResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    public CategoryDto create(@RequestBody CategoryDto entity) {
        log.info("CategoryResource::iniciado");
        log.debug("Valores: {}", entity);

        return categoryService.create(entity);
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public CategoryDto get(@PathVariable Integer id) {
        log.info("CategoryResource::get(id)");
        log.debug("Valores: {}", id);

        return categoryService.read(id);
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<CategoryDto> get() {
        log.info("CategoryResource::get");
        log.debug("Valores: sem parâmetro");

        return categoryService.read();
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param entity
     * @return
     */
    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public CategoryDto update(
            @PathVariable Integer id,
            @RequestBody CategoryDto entity) {

        log.info("CategoryResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return categoryService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("CategoryResource::delete");
        log.debug("Valores: {}", id, id);

        categoryService.delete(id);

    }
}