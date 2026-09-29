package br.com.ecommerce.pagamento_service.service.impl;

import br.com.ecommerce.pagamento_service.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PagamentoServiceImpl implements PagamentoService {

    @Override
    public String processar() {
        double chance = Math.random();
        if (chance > 0.5) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Falha no pagamento");
        }
        return "Pagamento Aprovado!";
    }
}
