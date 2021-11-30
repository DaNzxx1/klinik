package model;

import java.util.ArrayList;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@ToString
public class Contrato {
    
    private int idContrato;
    private Cliente idCliente;
    private Usuario atendente;
    private String status;
    private Date data_contrato;
    private Date hora_contrato;
    private ArrayList<ContratoServico> carrinho;

    public Contrato() {
    }

    public Contrato(int idContrato, Cliente idCliente, Usuario atendente, String status, Date data_contrato, Date hora_contrato, ArrayList<ContratoServico> carrinho) {
        this.idContrato = idContrato;
        this.idCliente = idCliente;
        this.atendente = atendente;
        this.status = status;
        this.data_contrato = data_contrato;
        this.hora_contrato = hora_contrato;
        this.carrinho = carrinho;
    }
    
}