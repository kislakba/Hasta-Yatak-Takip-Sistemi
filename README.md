# Hasta-Yatak-Takip-Sistemi
 

Projemde amaç hastaların sisteme kayıtlı hastanelerden yatakları rahatlıkla rezervasyon ettirebilmesidir. Bunu hastane-hasta ilişkilendirmelerini kullanma vasıtayısıyla yapar. 

 

## -Program Nesneleri ve ilişkileri : 

Entitiy Bean yardımıyla databasede ki Patients(Hastalar) ile obje düzeyinde işlemler yapılabilmiştir. 

## -Ekranlar ve Temel Bileşenleri 

### 1-Giriş Ekranı 

Ekranda sadece ekranlar arası geçiş sağlanmaktadır. 3 ekran arası geçiş vardır bunlar Hasta giriş ekranı, Hasta kayıt ekranı , Yönetici Giriş ekranı 

### 2-Yönetici Giriş Ekranı: 

Hali hazırda belli olan yönetici id ve şifresini girererek(id=admin,pw=123123) yönetici paneline girmek için bir penceredir. 

### 3-Yönetici Paneli: 

Yönetici olarak veri tabanına Hastane oluşturup, Hastane yatak sayısını belirleyebilir, 

Ve listede gözüken oluşturduğu hastaneleri veri tabanından silebilir. 

Hastaları obje düzeyince dışarıya yazabilir(Object output stream) veya dışarıya sadece Hasta ad,soyad şeklinde txt dosyasına kayıt edebilir. 

Kaydedilen txt dosyasını dosyaları okuyabilir. 

### 4-Hasta Kayıt paneli 

Kayıt olmak isteyen hasta gerekli koşulları sağlıyor ise hasta nesnesini oluşturup bunu entity bean sayesinde veri tabanına kaydeder. 

Asla aynı T.C sahibi 2 kişi üye olamaz. 

Koşullar sağlanmıyor ise bir dialog ekranı ile hata mesajı gelir. 

### 5-Hasta Giriş paneli 

Databasedeki kayıtlı hastaların Turkiye Cumhuriyeti Kimlik Numarası ve şahsi şifresi ile giriş yapabilir. 

### 6- Hasta paneli 

Oluşturduğumuz hastanelerin yatak sayısını görebilir, 

Önceden rezervasyon yapan birinin işlemine karışamayız 

Kendi rezervasyonumuz başka hastanedeyken o hastaneyi seçmessek silemeyiz 

Çapraz İşlemler: 

Hasta oluştururken kimlik numarası kontrolü. 

Hali hazırda randevusu olan birine asla başka randevu verilmemesi. 

Başka hastanın randevusunu silememek. 

  

 

 
