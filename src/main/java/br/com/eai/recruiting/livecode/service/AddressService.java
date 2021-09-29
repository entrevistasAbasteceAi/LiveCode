package br.com.eai.recruiting.livecode.service;

import br.com.eai.recruiting.livecode.repository.AddressRepository;
import br.com.eai.recruiting.livecode.request.AddressRequest;
import br.com.eai.recruiting.livecode.response.AddressResponse;
import org.springframework.web.client.RestTemplate;

public class AddressService {

    /*
        TODO: Cadastrar um novo endereço e busca conforme a versao abaixo:
         v1 - viacep => https://viacep.com.br/
         v2 - apicep => https://ws.apicep.com/cep/CEP.json
     */
    public AddressResponse create(AddressRequest addressRequest){


        return null;
    }
}
