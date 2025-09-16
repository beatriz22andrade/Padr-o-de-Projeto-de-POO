# Projeto em POO com foco no Padrão de Projeto Strategy

Este repositório contém um projeto desenvolvido em **Programação Orientada a Objetos (POO)**, com ênfase na aplicação do **padrão de projeto Strategy**.

O objetivo é demonstrar como o Strategy pode ser utilizado para:

- **Eliminar condicionais complexos** no código.  
- **Facilitar a extensão** do sistema, permitindo adicionar novas estratégias sem modificar as existentes.  
- **Promover flexibilidade**, possibilitando que o cliente escolha a estratégia de execução em tempo de execução.  

---

## 📌 Estrutura do Projeto

- **Contexto**: classe que mantém uma referência para a estratégia em uso e delega a execução para ela.  
- **Strategy (interface/abstrata)**: define a operação que todas as estratégias concretas devem implementar.  
- **Concrete Strategies**: implementações específicas da interface Strategy.  
- **Cliente**: escolhe a estratégia a ser usada e interage com o contexto.  

---

## 🚀 Exemplo de Aplicação

O projeto foi modelado em torno de um **sistema de pagamento**, onde diferentes formas de pagamento (ex.: cartão, pix, boleto) podem ser trocadas dinamicamente sem alterar a lógica central do sistema.  

---

## 💻 Linguagem Utilizada
- **Java**

---

## 🎯 Objetivo Educacional

Este repositório tem caráter didático e serve como material de estudo para compreender:  

- Padrões de projeto em POO.  
- A importância da separação entre **abstração** e **implementação**.  
- Boas práticas de design de software.  
