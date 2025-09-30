# Objetivo do Projeto

Desenvolvimento de um sistema web para gerenciamento de livros em uma livraria.

# Tecnologias Utilizadas

- Spring Boot (backend)
- MySQL (banco de dados)
- JSP (interface) ou outra tecnologia
- Arquitetura MVC

# Pontos Positivos

1. **Arquitetura MVC Bem Definida**  
   - Separação clara entre modelo, controle e visualização.  
   - Facilita a manutenção e escalabilidade.

2. **Uso de Spring Data JPA**  
   - Simplifica a persistência de dados, eliminando a necessidade de SQL manual.

3. **Testes Automatizados**  
   - Uso de JUnit e Mockito para garantir que os requisitos funcionais sejam atendidos.  
   - Melhora a qualidade do código e facilita a detecção precoce de erros.

4. **Estrutura de Frontend com JSP**  
   - Uso simples e eficaz para gerenciar a interface.  
   - Boa interação com o backend para as operações CRUD.

# Pontos de Melhoria

1. **Validação de Dados**  
   - Adoção das anotações de validação do Bean Validation (JSR 303/380).  
   - Evitar dados inválidos sendo persistidos no banco.

2. **Tratamento de Exceções**  
   - Garantir que o sistema lide com exceções de forma amigável ao usuário (ex: falha de conexão, tentativa de exclusão de livro inexistente).

3. **Melhoria na Interface de Usuário (UI/UX)**  
   - Uso de frameworks CSS como Bootstrap para melhorar o design.  
   - Adicionar feedback visual para operações de sucesso e falha.

4. **Testes de Integração**  
   - Implementar testes que validem a interação entre as camadas do sistema (frontend, backend e banco de dados).

# Relevância do Projeto no Contexto do Curso

1. **Aplicação Prática dos Conceitos do Curso**  
   - MVC: Aprendizado da arquitetura que separa as responsabilidades.  
   - Spring Framework: Aplicação de conceitos de Spring Boot, Spring Data JPA e Spring MVC.  
   - Testes Automatizados: Implementação de testes com JUnit e Mockito.

2. **Integração de Frontend e Backend**  
   - Conexão prática entre a camada de visualização (JSP) e a lógica de controle (Spring MVC).

3. **Desenvolvimento de Software Sustentável**  
   - Uso de boas práticas como validação de dados, tratamento de exceções e escrita de testes automatizados.  
   - Importância de garantir a qualidade e a manutenção fácil do código.

# Conclusão

Sumário: O projeto é uma excelente oportunidade de aplicar diversos conceitos aprendidos no curso, como arquitetura MVC, persistência de dados como Spring Data JPA e a criação de testes automatizados.
