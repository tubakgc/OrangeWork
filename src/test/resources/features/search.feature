Feature: Arama yapmak

  @search1
  Scenario:Recruitment sayfasında arama yapmak
    Given kullanıcı giriş yapar
    And Recruitment sayfası gider
    When Recruitment sayfasında olduğu doğrular
    And Status tablosunda " " seçeneğine tıklanır
    And search butonuna tıklanır
    And Açılan tabloda istenilen filtreleme görüntülenir


  @search2
  Scenario: Recruitment sayfasında arama yapmak
    Given Kullanıci giris yapar
    And Recruitment sayfası gider
    And Recruitment sayfasında olduğu doğrular
    And Date of Application kısmı "2024-06-02" yazar
    And search butonuna tıklanır
    And Açılan tabloda istenilen kişi görüntülenir

  @search3
  Scenario: Pım ekranında arama yapmak
    Given kullanıcı giriş yapar
    And PIM sayfasına gider
    And Pım sayfasında olduğu doğrulanır
    And Employee Id "" yazar
    And search butonuna tıklanır
    And Açılan tabloda istenilen kişi görüntülenir

  @search4
  Scenario: Pım sayfasında ikinci aramayı yapmak
    Given kullanıcı giriş yapar
    And PIM sayfasına gider
    And Pım sayfasında olduğu doğrulanır
    And Sub unit tablosunda "OrangeHRM" seçeneği tıklanır
    And search butonuna tıklanır
    And Açılan tabloda istenilen kişi görüntülenir

  @search5
  Scenario: Pım sayfasında üçüncü aramayı yapmak
    Given kullanıcı giriş yapar
    And PIM sayfasına gider
    And Pım sayfasında olduğu doğrulanır
    And Job Title tablosunda "Software Engineer" seçeneği tıklanır
    And search butonuna tıklanır
    And Açılan tabloda istenilen kişi görüntülenir

    @search6
    Scenario: Recruitment sayfasında arama yapmak
      Given Kullanıci giris yapar
      And Recruitment sayfası gider
      And Recruitment sayfasında olduğu doğrular
      And Vacancy tablosunda "Payroll Administrator" seçeneğine tıklar
      And search butonuna tıklanır
      And Açılan tabloda istenilen kişi görüntülenir

  @search7
  Scenario: Recruitment sayfasında arama yapmak
    Given Kullanıci giris yapar
    And Recruitment sayfası gider
    And Recruitment sayfasında olduğu doğrular
    And Method of Application tablosunda "Manuel" seçeneğine tıklar
    And search butonuna tıklanır
    And Açılan tabloda istenilen kişi görüntülenir

