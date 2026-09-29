package br.com.ecommerce.pagamento_service.controller;
import br.com.ecommerce.pagamento_service.service.PagamentoService;
import br.com.ecommerce.pagamento_service.service.impl.PagamentoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento/v1")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/processar")
    public ResponseEntity<String> processar() {
        return ResponseEntity.ok(pagamentoService.processar());
    }
}
