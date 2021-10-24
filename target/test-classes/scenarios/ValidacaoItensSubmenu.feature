Feature: Verifica se os itens mostrados na página contém a tag agilidade

  Scenario Outline: Acessa um submenu do item Blog
    Given um usuário que clique no submenu "<submenu>"
    Then cada item deverá ter a tag "<submenu>" mostrado no card

    Examples:
      | submenu     |
      | AGILIDADE   |
#      | ARQUITETURA |
#      | BACKEND     |
#      | FRONTEND    |
#      | SEGURANÇA   |