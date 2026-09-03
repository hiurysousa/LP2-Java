# Lista de Exercícios Práticos de Programação em Java

Esta lista foi elaborada com foco na prática progressiva de programação em Java, abrangendo desde os conceitos fundamentais de sintaxe e controle de fluxo até abstrações avançadas de Programação Orientada a Objetos (POO).

---

## Nível 1: Básico — Entrada/Saída, Operações e Condicionais

### Exercício 1: Conversor de Temperatura e Paridade
**Conceitos:** `Scanner`, operações matemáticas, estruturas condicionais (`if/else`), concatenação de `String`.

**Descrição:**
Escreva um programa em Java que:
1. Peça ao usuário para digitar uma temperatura em graus Celsius ($C$).
2. Converta a temperatura para Fahrenheit ($F$) utilizando a fórmula: $F = 1.8 \times C + 32$.
3. Exiba o valor em Fahrenheit formatado.
4. Verifique se o valor inteiro da temperatura em Fahrenheit é **par** ou **ímpar** e exiba essa informação na tela.

---

### Exercício 2: Manipulador de Nomes e Seleção por Código
**Conceitos:** Manipulação de `String` (`length`, `charAt`, `toUpperCase`), estrutura de seleção múltipla (`switch-case`).

**Descrição:**
Crie um programa que leia o nome completo de um usuário e um código de perfil de acesso (1 - Administrador, 2 - Instrutor, 3 - Aluno). O programa deve:
1. Exibir o tamanho total de caracteres do nome digitado (incluindo espaços).
2. Exibir a primeira e a última letra do nome em caixa alta (`toUpperCase`).
3. Utilizar uma estrutura `switch-case` para imprimir uma mensagem de boas-vindas personalizada de acordo com o código do perfil lido (ex: "Bem-vindo, Administrador [Nome]!"). Caso digite um código inválido, informe "Perfil Inválido".

---

## Nível 2: Intermediário — Repetição e Métodos Estáticos

### Exercício 3: Validador de Números Primos no Intervalo
**Conceitos:** Estruturas de repetição (`while` ou `do-while`, `for`), métodos estáticos (`public static boolean`).

**Descrição:**
1. Crie um método estático chamado `ehPrimo(int n)` que receba um número inteiro e retorne `true` se ele for primo e `false` caso contrário.
2. No método `main`, utilize um laço `do-while` para solicitar repetidamente um número positivo ao usuário.
3. Para cada número digitado, utilize o método `ehPrimo` e exiba se ele é primo ou não.
4. O programa deve encerrar sua execução apenas quando o usuário digitar um valor negativo.

---

### Exercício 4: Análise de Notas com Vetor (Array)
**Conceitos:** Vetores (`arrays`), leitura com `Scanner`, estruturas de repetição (`for`).

**Descrição:**
Escreva um programa que leia a nota de 5 alunos e as armazene em um vetor de `double`.
O programa deve:
1. Calcular e exibir a média aritmética da turma.
2. Determinar e exibir a maior nota digitada.
3. Contar e exibir quantos alunos ficaram com nota acima ou igual à média da turma.

---

## Nível 3: Intermediário Avançado — Coleções Dinâmicas e Início de POO

### Exercício 5: Gerenciador de Lista de Tarefas com ArrayList
**Conceitos:** `ArrayList`, manipulação de listas (`add`, `get`, `remove`, `size`), menu com `do-while` e `switch-case`.

**Descrição:**
Desenvolva um programa que simule um gerenciador de tarefas utilizando `ArrayList<String>`. O sistema deve exibir um menu contendo:
1. Adicionar tarefa
2. Listar tarefas
3. Remover tarefa pelo índice
4. Sair

O laço deve repetir até que a opção de sair seja escolhida. Garanta que, ao tentar remover uma tarefa, seja verificado se o índice informado é válido (dentro dos limites de `0` até `size() - 1`).

---

### Exercício 6: Modelagem de Conta Bancária com Encapsulamento
**Conceitos:** Classes, atributos privados, métodos construtores, métodos acessadores e modificadores (`getters/setters`), validação de regras de negócio.

**Descrição:**
Crie uma classe chamada `ContaBancaria` com os seguintes atributos privados:
* `numeroConta` (int)
* `titular` (String)
* `saldo` (double)

**Requisitos:**
1. Crie um construtor que receba o número da conta e o nome do titular, inicializando o saldo em `0.0`.
2. Implemente os métodos `depositar(double valor)` e `sacar(double valor)`.
    * O saque só deve ser realizado se houver saldo suficiente e se o valor for maior que zero.
3. Crie os métodos *getters* e *setters* adequados (não permita que o saldo seja alterado diretamente pelo *setter* sem validação).
4. No método `main`, instancie uma conta, realize um depósito, tente um saque válido e um saque inválido, exibindo o saldo final.

---

## Nível 4: Avançado — Herança, Sobrescrita e Polimorfismo

### Exercício 7: Sistema de Imóveis (Aluguel e Venda)
**Conceitos:** Herança (`extends`), modificadores de acesso (`protected`/`private`), sobrescrita de métodos (`@Override`), uso da palavra-chave `super`.

**Descrição:**
Com base no exemplo de domínio de imóveis:
1. Crie uma classe base chamada `Imovel` com atributos `endereco` (String) e `valorBase` (double). Crie o construtor e um método `calcularComissao()` que retorna 2% do `valorBase`.
2. Crie a subclasse `Aluguel` que herda de `Imovel`. Adicione o atributo `valorMensalidade` (double). Sobrescreva o método `calcularComissao()` para retornar exatamente o valor de 1 mensalidade.
3. Crie a subclasse `Venda` que herda de `Imovel`. Sobrescreva o método `calcularComissao()` para que a comissão corresponda a 6% do `valorBase`.
4. Instancie objetos de `Aluguel` e `Venda` no `main` e exiba a comissão de cada um.

---

### Exercício 8: Polimorfismo com Folha de Pagamento
**Conceitos:** Polimorfismo, lista de objetos de superclasse (`ArrayList<Superclasse>`), reuso de código.

**Descrição:**
Aproveitando a estrutura do Exercício 7 (ou criando uma hierarquia equivalente para `Funcionario`, `FuncionarioCLT` e `PrestadorServico`):
1. Crie uma lista `ArrayList<Imovel>` no `main`.
2. Adicione na mesma lista objetos do tipo `Aluguel` e `Venda`.
3. Percorra a lista com um laço de repetição e chame o método `calcularComissao()` para cada elemento.
4. Demonstre o conceito de **polimorfismo** imprimindo os valores de comissão calculados de forma específica para cada tipo de imóvel através da mesma referência da superclasse.

---

## Nível 5: Mestre — Classes Abstratas e Interfaces

### Exercício 9: Sistema de Folha com Classe Abstrata
**Conceitos:** Classes Abstratas (`abstract class`), métodos abstratos, obrigatoriedade de implementação nas subclasses.

**Descrição:**
1. Crie uma classe abstrata chamada `FuncionarioAbstrato` contendo os atributos `nome` (String) e `cpf` (String).
2. Declare um método abstrato `public abstract double calcularSalario()`.
3. Crie duas subclasses concretas:
    * `FuncionarioHorista`: possui os atributos `horasTrabalhadas` (int) e `valorHora` (double).
    * `FuncionarioAssalariado`: possui o atributo `salarioFixo` (double).
4. Implemente obrigatoriamente o método `calcularSalario()` em ambas as subclasses, aplicando as fórmulas correspondentes a cada regime de trabalho.
5. Instancie ambas as classes no `main` e exiba o salário final de cada funcionário.

---

### Exercício 10: Calculadora Geométrico-Tributária com Interfaces
**Conceitos:** Interfaces (`interface`), contrato de métodos, múltiplas implementações, integração de todos os tópicos (POO, ArrayList, loops e condicionais).

**Descrição:**
1. Crie uma interface chamada `Calculavel` que declare o método `double calcularArea()`.
2. Crie uma segunda interface chamada `Tributavel` que declare o método `double calcularImposto()`.
3. Crie as classes:
    * `Quadrado`: implementa `Calculavel` (Atributo: `lado`).
    * `Retangulo`: implementa `Calculavel` e `Tributavel` (Atributos: `largura`, `altura`. O imposto cobrado é de 5% sobre o valor da área).
4. No método `main`:
    * Crie uma lista de figuras geométricas (`ArrayList<Calculavel>`).
    * Adicione quadrados e retângulos na lista.
    * Percorra a lista exibindo a área de cada figura.
    * Se a figura também for uma instância de `Tributavel` (utilize a verificação `instanceof`), exiba também o imposto devido.