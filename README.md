Este projeto foi desenvolvido para aplicar e aprimorar conhecimentos em:

- **Refatoração de Código**: Melhorar a estrutura do código para torná-lo mais limpo, legível e fácil de manter.
- **Implementação de Parcelable**: Uso da interface `Parcelable` para serializar objetos de maneira mais eficiente no Android, facilitando a passagem de dados entre `Activities` e `Fragments`.
- **Transferência de Dados entre Destinos**: Prática de passar dados entre destinos, como `Activities` e `Fragments`, para garantir uma navegação fluida e interação entre as telas.

## Funcionalidades

1. **Refatoração**: 
   - Aplicação de boas práticas de programação para organizar o código, reduzir duplicações e melhorar a eficiência.

2. **Gerador de Implementação de Parcelable**:
   - Implementação automática de `Parcelable` para objetos complexos, permitindo a transferência de dados de forma rápida e segura entre componentes Android.

3. **Passagem de Dados entre Destinos**:
   - Utilização de `Parcelable` para enviar dados entre `Activities` e `Fragments` no Android.
   - Experiência de navegação aprimorada, com dados trafegando entre destinos sem perda de performance.

## Estrutura do Projeto

- **src/main/java**: Contém o código-fonte principal, incluindo as classes e métodos para implementar `Parcelable` e a lógica de transferência de dados.
- **src/main/res**: Contém os recursos do projeto (layouts, strings, cores, etc.).
  
## Tecnologias e Bibliotecas Utilizadas

- **Kotlin**: Linguagem de programação principal do projeto.
- **Android Jetpack**: Utilizado para facilitar a navegação entre destinos e a manipulação de dados.

## Melhorias Futuras

- Otimizar a passagem de dados para suportar tipos de dados mais complexos.
- Adicionar testes unitários para validação de dados entre destinos.
