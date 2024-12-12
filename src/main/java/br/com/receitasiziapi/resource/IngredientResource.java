package br.com.receitasiziapi.resource;

import br.com.receitasiziapi.dto.IngredientDto;
import br.com.receitasiziapi.interfaces.IResource;
import br.com.receitasiziapi.service.IngredientService;
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
@RequestMapping(value = "/api/v1/ingredient" )
@Tag(name = "ingredient", description = "Documentação relacionada a resource(recurso) ingredient")
public class IngredientResource implements IResource<IngredientDto, Integer> {

    final IngredientService ingredientService;

    public IngredientResource(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
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

    public IngredientDto create(@RequestBody IngredientDto entity) {
        log.info("IngredientResource::iniciado");
        log.debug("Valores: {}", entity);

        return ingredientService.create(entity);
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
    public IngredientDto get(@PathVariable Integer id) {
        log.info("IngredientResource::get(id)");
        log.debug("Valores: {}", id);

        return ingredientService.read(id);
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
    public List<IngredientDto> get() {
        log.info("IngredientResource::get");
        log.debug("Valores: sem parâmetro");

        return ingredientService.read();
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
    public IngredientDto update(
            @PathVariable Integer id,
            @RequestBody IngredientDto entity) {

        log.info("IngredientResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return ingredientService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("IngredientResource::delete");
        log.debug("Valores: {}", id, id);

        ingredientService.delete(id);

    }
}