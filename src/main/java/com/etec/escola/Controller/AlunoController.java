package com.etec.escola.Controller;

import com.etec.escola.Service.Aluno_Service;

public class AlunoController {
    private final Aluno_Service  alunoService;

    public AlunoController(Aluno_Service alunoService) {
        this.alunoService = alunoService;
    }
}
