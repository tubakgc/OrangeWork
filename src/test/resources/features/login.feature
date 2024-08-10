Feature: Login ekranı

  @smoke
  Scenario: Başarılı Giriş
    Given Kullanıcı login sayfasına gider
    When Kullanıcı login sayfasını doğrular
    And Kullanıcı geçerli kullanıcı adını girer
    And Kullanıcı geçerli  şifre girer
    And Kullanıcı "Giriş" butonuna tıklar
    Then Kullanıcı Dashboard ekranını  görür

  @smoke1
  Scenario: Başarısız Giriş - Geçersiz Şifre
    Given Kullanıcı geçersiz şifre için login sayfasına gider
    When Kullanıcı geçerli olan kullanıcı adını girer
    And Kullanıcı geçersiz şifreyi girer
    And Kullanıcı "Giriş" butona tıklar
    Then Kullanıcı hata mesajı içeren sayfada kalır

