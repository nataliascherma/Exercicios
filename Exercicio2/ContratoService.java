package Exercicio2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContratoService {

        private PagamentoOnline pagamentoOnline;

        public ContratoService(PagamentoOnline pagamentoOnline) {
            this.pagamentoOnline = pagamentoOnline;
        }

        public void processaContrato(Contrato contrato, int meses) {

            //valor de cada parcela
            double parcela = contrato.getValor_total() / meses;
            double parcelaJuros = parcela;
            for (int i = 1; i <= meses; i++) {
                Date data = addMonthds(contrato.getData_contrato(), i);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String dataFormatada = sdf.format(data);

                double valorJuros = parcela +  pagamentoOnline.juros(parcela, i);
                double valorTotalParcela = valorJuros + pagamentoOnline.taxaDePagamento(parcela);





                System.out.println("Valor da parcela:  " + valorTotalParcela + " Vencimento: " + dataFormatada);

            }

        }

        private Date addMonthds(Date date, int n) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, n);
            return cal.getTime();


        }
    }


