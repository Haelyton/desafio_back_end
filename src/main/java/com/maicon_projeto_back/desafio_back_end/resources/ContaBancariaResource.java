package com.maicon_projeto_back.desafio_back_end.resources;


import com.maicon_projeto_back.desafio_back_end.Services.ContaBancariaService;
import com.maicon_projeto_back.desafio_back_end.entity.ContaBancaria;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContaBancariaResource {


    @Autowired
    private ContaBancariaService contaBancariaService;


    @PostMapping()
    public Response createContaBancaria(ContaBancaria conta) {
        contaBancariaService.createContaBancaria(conta);
        return Response.status(Response.Status.CREATED).build();
    }

}
