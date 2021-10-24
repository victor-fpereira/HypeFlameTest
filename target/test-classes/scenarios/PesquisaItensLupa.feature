Feature: Pesquisa itens pela lupa de pesquisa e valida se são itens corretos

  @search

  Scenario Outline: Pesquisa de um item usando a lupa de pesquisa
    Given um usuário que pesquise um item "<item>" usando a busca
    Then a página deverá mostrar itens que tenham o termo de pesquisa "<item>"

    Examples:
      | item        |
      | AGILIDADE   |