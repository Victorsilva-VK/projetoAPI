package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servicos.apiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        apiServico apiServico = new apiServico();
        try {
            EnderecoDto enderecoDto = apiServico.getEndereco("50930000");
            System.out.println(enderecoDto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}