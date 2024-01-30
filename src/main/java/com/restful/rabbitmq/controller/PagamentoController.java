package com.restful.rabbitmq.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pagamento")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PagamentoController {
}
