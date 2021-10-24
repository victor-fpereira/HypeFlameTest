Feature: Verifica se os endpoints batem com os nomes do submenu do blog

  Scenario Outline: Acessa um submenu do item Blog
    Given um usuário que clique no submenu "<submenu>"
    Then cada url deverá conter o "<submenu>"

    Examples:
      | submenu     |
      | AGILIDADE   |
#      | ARQUITETURA |
#      | BACKEND     |
#      | FRONTEND    |
#      | SEGURANÇA   |