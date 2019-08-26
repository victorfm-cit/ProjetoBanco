package ProjectBank;

import ProjectBank.Classes.ContaBanco;

public class Application {
    public static void main(String[] args) {
    ContaBanco pessoa1 = new ContaBanco(100, true);
    pessoa1.setNumConta(1111);
    pessoa1.setDono(" Irineu Pereira");
    pessoa1.abrirConta(" CC");



    ContaBanco pessoa2 = new ContaBanco(150, false);
    pessoa2.setDono(" Creuza");
    pessoa2.setNumConta(2222);
    pessoa2.abrirConta(": CP");


    pessoa1.depositar(300);
    pessoa2.depositar(500);
    pessoa2.sacar(500);
    pessoa2.fecharConta();

    pessoa1.estadoAtual();
    pessoa2.estadoAtual();
    }
}
