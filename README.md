# 🛒 Simulação de Lojinha Online (Arquitetura Monolítica)

## 📌 Introdução e Contexto do Trabalho

Este projeto foi desenvolvido como uma atividade prática com o objetivo de evoluir a modelagem de um sistema de e-commerce (Lojinha Online) a partir de um Diagrama de Contexto (N0) inicial. 

O foco do trabalho abrange desde a modelagem conceitual e lógica do sistema até a sua implementação funcional simulada. Para isso, o projeto foi dividido na entrega de quatro artefatos principais:
1. **Diagrama de Atividades (UML):** Representando o fluxo principal de navegação e compra.
2. **Diagrama Entidade-Relacionamento (DER):** Modelando a estrutura de dados persistente.
3. **Simulação em Java:** Uma API simulando o backend do sistema.
4. **Aplicação de Padrões de Projeto:** Uso obrigatório do padrão *Singleton* para o gateway de pagamento.

---

## 📖 Conceitos Fundamentais

### O que é uma Lojinha Online?
No contexto deste sistema, uma "lojinha online" é uma plataforma de comércio eletrônico (e-commerce) simplificada que permite a um cliente realizar todo o fluxo de compra de maneira digital. O sistema é responsável por gerenciar a identificação do cliente, exibir o catálogo de produtos disponíveis, registrar o pedido, calcular os valores e coordenar a comunicação com um sistema externo para o processamento e validação do pagamento.

### O que é uma Arquitetura Cliente-Servidor Monolítica?
A arquitetura base escolhida para este projeto é a **Cliente-Servidor Monolítica**. Ela se define por duas características principais:

* **Cliente-Servidor:** Existe uma separação clara entre quem consome o serviço (o Cliente, que pode ser um navegador ou aplicativo) e quem processa as regras de negócio e acessa o banco de dados (o Servidor).
* **Monolítica:** Refere-se à forma como o backend (servidor) é construído. Em um monólito, **todas as responsabilidades e módulos do sistema estão agrupados em uma única base de código e executados como um único processo**. Ou seja, as funções de listagem de produtos, gerenciamento de carrinho, criação de pedidos e a integração com o pagamento compartilham a mesma memória e o mesmo espaço de aplicação. É uma arquitetura excelente para sistemas iniciais por ser mais simples de desenvolver, testar e fazer o *deploy* (implantação).

---

## 📁 Estrutura do Projeto

Neste repositório, você encontrará a seguinte estrutura de arquivos:

* `docs/`: Contém as imagens do Diagrama de Atividades (UML) e do Diagrama Entidade-Relacionamento (DER).
* `src/`: Contém o código-fonte da simulação desenvolvida em Java.
* `README.md`: Documentação principal do projeto.

---

## 🏗️ Principais Decisões Arquiteturais e Padrões de Projeto

* Inserir aqui a justificativa do uso do padrão Singleton no sistema de pagamento, conforme definido na divisão do trabalho).*
