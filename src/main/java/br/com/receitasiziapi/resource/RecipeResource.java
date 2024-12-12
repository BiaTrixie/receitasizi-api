package br.com.receitasiziapi.resource;

import br.com.receitasiziapi.dto.RecipeDto;
import br.com.receitasiziapi.interfaces.IResource;
import br.com.receitasiziapi.service.RecipeService;
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
@RequestMapping(value = "/api/v1/recipe" )
@Tag(name = "recipe", description = "Documentação relacionada a resource(recurso) recipe")
public class RecipeResource implements IResource<RecipeDto, Integer> {

    final RecipeService recipeService;

    public RecipeResource(RecipeService recipeService) {
        this.recipeService = recipeService;
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

    public RecipeDto create(@RequestBody RecipeDto entity) {
        log.info("RecipeResource::iniciado");
        log.debug("Valores: {}", entity);

        return recipeService.create(entity);
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
    public RecipeDto get(@PathVariable Integer id) {
        log.info("RecipeResource::get(id)");
        log.debug("Valores: {}", id);

        return recipeService.read(id);
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
    public List<RecipeDto> get() {
        log.info("RecipeResource::get");
        log.debug("Valores: sem parâmetro");

        return recipeService.read();
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
    public RecipeDto update(
            @PathVariable Integer id,
            @RequestBody RecipeDto entity) {

        log.info("RecipeResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return recipeService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("RecipeResource::delete");
        log.debug("Valores: {}", id, id);

        recipeService.delete(id);

    }
}