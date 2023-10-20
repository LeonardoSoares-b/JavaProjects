package quintaQuestao;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static final String[] MESES = {
        "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(String mesStr, int dia, int ano) {
        this.dia = dia;
        this.mes = converterMesStrParaInt(mesStr);
        this.ano = ano;
    }

    public Data(int diaDoAno, int ano) {
        this.ano = ano;

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mes = 1;

        while (diaDoAno > diasPorMes[mes]) {
            diaDoAno -= diasPorMes[mes];
            mes++;
        }

        this.mes = mes;
        this.dia = diaDoAno;
    }

    public void exibirData1() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    public void exibirData2() {
        System.out.printf("%s %d, %04d%n", MESES[mes], dia, ano);
    }

    public void exibirData3() {
        System.out.printf("%03d %04d%n", getDiaDoAno(), ano);
    }

    private int getDiaDoAno() {
        int diaDoAno = dia;

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i < mes; i++) {
            diaDoAno += diasPorMes[i];
        }

        return diaDoAno;
    }

    private int converterMesStrParaInt(String mesStr) {
        for (int i = 1; i <= 12; i++) {
            if (MESES[i].equalsIgnoreCase(mesStr)) {
                return i;
            }
        }

        return -1;
    }

}
