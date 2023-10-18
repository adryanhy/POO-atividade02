import java.time.LocalDateTime;
import java.time.LocalDate;

class Funcionario {
    private String nome;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Gerente extends Funcionario {
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

class Secretaria extends Funcionario {
    private String telefone;
    private String ramal;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}

class Operador extends Funcionario {
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}

class RegistroPonto {
    private int idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public int getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(int idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}

class ControlePonto {
    public static String registraEntrada(Funcionario func) {
        LocalDateTime now = LocalDateTime.now();
        return "Entrada registrada para " + func.getNome() + " em " + now;
    }

    public static String registraSaida(Funcionario func) {
        LocalDateTime now = LocalDateTime.now();
        return "Saída registrada para " + func.getNome() + " em " + now;
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setId(1);
        gerente.setLogin("joao123");
        gerente.setSenha("senha123");

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Maria");
        secretaria.setId(2);
        secretaria.setTelefone("123-456-7890");
        secretaria.setRamal("101");

        ControlePonto controle = new ControlePonto();

        System.out.println(controle.registraEntrada(gerente));
        System.out.println(controle.registraEntrada(secretaria));

        System.out.println(controle.registraSaida(gerente));
        System.out.println(controle.registraSaida(secretaria));
    }
}
