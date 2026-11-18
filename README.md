# 🏦 Sistema Bancário em Java (POO)

Um projeto prático desenvolvido em Java para simular operações bancárias básicas, aplicando os principais pilares da **Programação Orientada a Objetos (POO)**.

## 📋 Sobre o Projeto

O sistema modela a estrutura de um banco simples, permitindo gerenciar clientes e diferentes modalidades de contas bancárias. O foco principal é demonstrar na prática como organizar regras de negócio utilizando classes, herança e sobrescrita de métodos.

### Conceitos de POO Aplicados
* **Encapsulamento:** Proteção dos atributos das classes (`saldo`, `titular`, `nome`, `limite`) com acesso controlado por métodos públicos e protegidos (`protected`).
* **Herança:** Criação de tipos específicos de conta (`ContaComum` e `ContaEspecial`) a partir de uma classe base (`ContaBancaria`).
* **Polimorfismo:** Sobrescrita (`@Override`) do método `sacar` na `ContaEspecial` para considerar o valor do limite adicional além do saldo disponível.
* **Composição / Associação:** Relacionamento entre `ContaBancaria` e `Cliente`, além da classe `Banco` atuando como intermediária nas transações.

## 🚀 Funcionalidades

* **Cadastro de Clientes:** Criação de titulares vinculados às contas.
* **Conta Comum:** Permite saques apenas dentro do limite do saldo disponível em conta.
* **Conta Especial:** Permite saques utilizando o saldo somado a um limite de crédito pré-aprovado (cheque especial).
* **Operações Bancárias:**
  * Depósito de valores positivos.
  * Saque com validação de saldo/limite.
  * Transferência segura entre contas (só credita no destino se o débito na origem for bem-sucedido).

## 🗂️ Estrutura dos Arquivos

* `Cliente.java`: Representa o titular da conta bancária.
* `ContaBancaria.java`: Classe base com os atributos e comportamentos padrão de uma conta.
* `ContaComum.java`: Especialização de `ContaBancaria` sem limite extra.
* `ContaEspecial.java`: Especialização de `ContaBancaria` com regra própria de saque utilizando limite.
* `Banco.java`: Classe responsável por intermediar saques, depósitos e transferências entre contas.
* `Main.java`: Classe principal contendo cenários de teste e exibição dos saldos finais.

## 💻 Como Executar

### Pré-requisitos
* Ter o **Java JDK** (versão 8 ou superior) instalado na máquina.

### Passo a passo
1. Clone este repositório:
   ```bash
   git clone https://github.com
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd sistema-bancario-java-poo
   ```
3. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
4. Execute a classe principal:
   ```bash
   java Main
   ```

## 📊 Exemplo de Saída

Ao executar a classe `Main.java` com os cenários de teste configurados, o console exibirá o saldo final de cada cliente após todas as movimentações:

```text
João: R\$ -230.00
Maria: R\$ 350.00
Pedro: R\$ 90.00
```
*(Nota: O saldo de João fica negativo pois ele utiliza o limite de R$ 300,00 da sua Conta Especial).*
