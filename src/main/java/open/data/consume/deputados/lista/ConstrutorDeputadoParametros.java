package open.data.consume.deputados.lista;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

import open.data.consume.commom.date.ValidateSimpleDate;

public class ConstrutorDeputadoParametros {

    private String parametros = "?";

    public ConstrutorDeputadoParametros setId(Integer id) {
        this.parametros += "&id=" + id;
        return this;
    }

    public ConstrutorDeputadoParametros setNome(String nome) {
        this.parametros += "&nome=" + nome;
        return this;
    }

    public ConstrutorDeputadoParametros setIdLegislatura(Integer legislatura) {
        this.validateInteger(legislatura);
        this.parametros += "&idLegislatura=" + legislatura;
        return this;
    }

    public ConstrutorDeputadoParametros setSiglaUf(String uf) {
        this.parametros += "&siglaUf=" + uf;
        return this;
    }

    public ConstrutorDeputadoParametros setSiglaPartido(String partido) {
        this.parametros += "&siglaPartido=" + partido;
        return this;
    }

    public ConstrutorDeputadoParametros setSiglaSexo(String siglaSexo) {
        this.validateSiglaSexo(siglaSexo);
        this.parametros += "&siglaSexo=" + siglaSexo;
        return this;
    }

    public ConstrutorDeputadoParametros setItens(Integer numberOfItens) {
        this.validateInteger(numberOfItens);
        this.parametros += "&itens=" + numberOfItens;
        return this;
    }

    public ConstrutorDeputadoParametros setDataInicio(String dataInicio) {
        this.validateDate(dataInicio);
        this.parametros = "&dataInicio=" + dataInicio;
        return this;
    }

    public ConstrutorDeputadoParametros setDataFim(String dataFim) {
        this.validateDate(dataFim);
        this.parametros = "&dataFim=" + dataFim;
        return this;
    }

    public ConstrutorDeputadoParametros setOrdenarPor(String ordenarPor) {
        this.validateOrderBy(ordenarPor);
        this.parametros += "&ordernarPor=" + ordenarPor;
        return this;
    }

    private void validateOrderBy(String field) {
        List<String> listPermitedFields = 
            Arrays.asList("id", "idLegislatura", "nome", "siglaUF", "siglaPartido");

        if(!listPermitedFields.contains(field)) {
            this.callInvalidParameterException(
                "A ordenação pode ser feito por id," + 
                " idLegislatura, nome, siglaUF, siglaPartido"
                );
        }
    }

    private void validateDate(String date) {
        if(!ValidateSimpleDate.isValid(date)) {
            this.callInvalidParameterException("Data fornecida nao possui formato valido");
        }
    }

    private void validateInteger(Integer number) {
        if(number < 0) {
            this.callInvalidParameterException("Parametro fornecido deve ser positivo");
        }
    }

    private void validateSiglaSexo(String siglaSexo) {
         if(siglaSexo != "F" && siglaSexo != "M") {
            this.callInvalidParameterException("Sigla sexo deve ser igual a F ou M");
        }
    }

    private void callInvalidParameterException(String message) {
        throw new InvalidParameterException(message);
    }

    @Override
    public String toString() {
        return this.parametros;
    }

}
