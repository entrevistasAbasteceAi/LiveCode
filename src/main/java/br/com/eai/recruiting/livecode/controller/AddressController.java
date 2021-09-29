package br.com.eai.recruiting.livecode.controller;

import br.com.eai.recruiting.livecode.request.AddressRequest;
import br.com.eai.recruiting.livecode.request.AddressesRequest;
import br.com.eai.recruiting.livecode.response.AddressResponse;
import br.com.eai.recruiting.livecode.response.AddressesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    /*
        TODO: Cadastrar um novo endereço e busca conforme a versao abaixo:
         v1 - viacep => https://viacep.com.br/
         v2 - apicep => https://ws.apicep.com/cep/CEP.json
     */
    @PostMapping
    public AddressResponse create(AddressRequest addressRequest) {

        return new AddressResponse();
    }

    /*
        TODO: CRIAÇAO DE ENDEREÇOS EM LOTE(LISTA) E NAO PODE TER ENDEREÇO DUPLICADO NA LISTA!
         CASO EXISTA, RETORNAR ERRO
     */
    @PostMapping("/create_batch")
    public AddressesResponse creationBatch(AddressesRequest addressesRequest){

        return new AddressesResponse();
    }


    /*
        TODO: Buscar todos os endereços cadastrados no BD pelo CEP informado
         e com paginação
     */
    @GetMapping
    public AddressesResponse getAllByZipCode(String zipCode,
                                    Integer pageCurrent,
                                    Integer limit) {

        return new AddressesResponse();
    }







}
