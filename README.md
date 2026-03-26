# Simulação de Lojinha Online (Arquitetura Monolítica)

## Introdução e Contexto do Trabalho

Este projeto foi desenvolvido como uma atividade prática com o objetivo de evoluir a modelagem de um sistema de e-commerce (Lojinha Online) a partir de um Diagrama de Contexto (N0) inicial. 

O foco do trabalho abrange desde a modelagem conceitual e lógica do sistema até a sua implementação funcional simulada. Para isso, o projeto foi dividido na entrega de quatro artefatos principais:
1. **Diagrama de Atividades (UML):** Representando o fluxo principal de navegação e compra.
2. **Diagrama Entidade-Relacionamento (DER):** Modelando a estrutura de dados persistente.
3. **Simulação em Java:** Uma API simulando o backend do sistema.
4. **Aplicação de Padrões de Projeto:** Uso obrigatório do padrão *Singleton* para o gateway de pagamento.

---

## Conceitos Fundamentais

### O que é uma Lojinha Online?
No contexto deste sistema, uma "lojinha online" é uma plataforma de comércio eletrônico (e-commerce) simplificada que permite a um cliente realizar todo o fluxo de compra de maneira digital. O sistema é responsável por gerenciar a identificação do cliente, exibir o catálogo de produtos disponíveis, registrar o pedido, calcular os valores e coordenar a comunicação com um sistema externo para o processamento e validação do pagamento.

### O que é uma Arquitetura Cliente-Servidor Monolítica?
A arquitetura base escolhida para este projeto é a **Cliente-Servidor Monolítica**. Ela se define por duas características principais:

* **Cliente-Servidor:** Existe uma separação clara entre quem consome o serviço (o Cliente, que pode ser um navegador ou aplicativo) e quem processa as regras de negócio e acessa o banco de dados (o Servidor).
* **Monolítica:** Refere-se à forma como o backend (servidor) é construído. Em um monólito, **todas as responsabilidades e módulos do sistema estão agrupados em uma única base de código e executados como um único processo**. Ou seja, as funções de listagem de produtos, gerenciamento de carrinho, criação de pedidos e a integração com o pagamento compartilham a mesma memória e o mesmo espaço de aplicação. É uma arquitetura excelente para sistemas iniciais por ser mais simples de desenvolver, testar e fazer o *deploy* (implantação).

---

## Estrutura do Projeto

Neste repositório, você encontrará a seguinte estrutura de arquivos:

* `docs/`: Contém as imagens do Diagrama de Atividades (UML) e do Diagrama Entidade-Relacionamento (DER).
* `src/`: Contém o código-fonte da simulação desenvolvida em Java.
* `README.md`: Documentação principal do projeto.

---

## Principais Decisões Arquiteturais e Padrões de Projeto

### Uso do Padrão Singleton

Para a parte de pagamento do sistema, utilizei o padrão de projeto **Singleton** na classe `PagamentoService`.

A ideia foi garantir que exista apenas **uma única instância** dessa classe durante toda a execução do programa. Isso faz sentido porque o serviço de pagamento simula um sistema externo, e normalmente esse tipo de sistema trabalha com uma única conexão centralizada.

### Por que escolhi usar Singleton?

- Evita criar várias instâncias desnecessárias para processar pagamentos  
- Mantém o controle do pagamento em um único ponto do sistema  
- Deixa o projeto mais organizado e próximo de um cenário real  

### Como implementei

A implementação foi feita de forma simples e eficiente:

- Construtor privado → impede que outras classes criem instâncias diretamente  
- Variável estática → armazena a única instância da classe  
- Método `getInstance()` → responsável por criar (se necessário) e retornar essa instância  

Com isso, sempre que o sistema precisa processar um pagamento, ele usa a mesma instância do serviço.

---


## Descrição do Fluxo do Diagrama de Atividades

O diagrama representa o funcionamento de uma lojinha online, abrangendo desde o acesso inicial do usuário até a conclusão do processo de compra.

### 1. Início e Acesso
O processo tem início com o acesso do cliente ao sistema, seguido da navegação pelos produtos disponíveis.

### 2. Seleção de Produtos
O cliente seleciona os produtos desejados e os adiciona ao carrinho de compras. Na sequência, o sistema verifica se o usuário deseja continuar realizando compras:
- Em caso afirmativo, o fluxo retorna à etapa de navegação e seleção de produtos.
- Caso contrário, o usuário é direcionado para a etapa de finalização da compra.

### 3. Finalização da Compra
Nesta etapa, o cliente fornece suas informações pessoais, como dados de login e endereço, além de selecionar a forma de pagamento.

### 4. Processamento do Pagamento
O sistema encaminha as informações fornecidas ao módulo responsável pelo processamento do pagamento, que realiza a validação dos dados.

### 5. Decisão do Pagamento
Após a verificação, ocorre a decisão quanto ao status do pagamento:
- Se o pagamento for aprovado:
  - O sistema exibe uma mensagem de confirmação.
  - O processo é concluído com sucesso.
- Se o pagamento for recusado:
  - O sistema apresenta uma mensagem de erro.
  - O usuário poderá realizar uma nova tentativa ou encerrar o processo.

### 6. Encerramento
O fluxo é finalizado após a confirmação do pagamento, independentemente de seu resultado.


