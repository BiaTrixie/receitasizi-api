package br.com.receitasiziapi.resource;
import java.util.List;

import br.com.receitasiziapi.dto.CuisineDto;
import br.com.receitasiziapi.interfaces.IResource;
import br.com.receitasiziapi.service.CuisineService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/cuisine" )
@Tag(name = "cuisine", description = "Documentação relacionada a resource(recurso) cuisine")
public class CuisineResource implements IResource<CuisineDto, Integer> {

    final CuisineService cuisineService;

    public CuisineResource(CuisineService cuisineService) {
        this.cuisineService = cuisineService;
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
                    content = { @Content(schema = @Schema(implementation = CuisineResource.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    public CuisineDto create(@RequestBody CuisineDto entity) {
        log.info("CusineResource::iniciado");
        log.debug("Valores: {}", entity);

        return cuisineService.create(entity);
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
    public CuisineDto get(@PathVariable Integer id) {
        log.info("CuisineResource::get(id)");
        log.debug("Valores: {}", id);

        return cuisineService.read(id);
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
    public List<CuisineDto> get() {
        log.info("CuisineResource::get");
        log.debug("Valores: sem parâmetro");

        return cuisineService.read();
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
    public CuisineDto update(
            @PathVariable Integer id,
            @RequestBody CuisineDto entity) {

        log.info("CusinieResource::update");
        log.debug("Valores: {} e {}", id, entity);

        return cuisineService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("CusineResource::delete");
        log.debug("Valores: {}", id, id);

        cuisineService.delete(id);

    }
}