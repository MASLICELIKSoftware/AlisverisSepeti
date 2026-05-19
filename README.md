### ALIŞVERİŞ SEPETİ PROJESİ

### PROJENİN AMACI:
Bu proje Java programlama dili kullanılarak geliştirilen örnek bir alışveriş sepeti sistemidir. Projenin temel amacı, yazılım geliştirme sürecinde kullanılan Design Pattern (Tasarım Örüntüleri) yapılarını gerçek bir senaryo üzerinde uygulamalı olarak göstermektir.

Proje boyunca Creational, Structural ve Behavioral kategorilerinden farklı tasarım örüntüleri kullanılarak sistemin daha modüler, okunabilir, sürdürülebilir ve genişletilebilir olması hedeflenmiştir. Özellikle Open/Closed Principle (Açık/Kapalı Prensibi) dikkate alınarak mevcut kod yapısını değiştirmeden sisteme yeni davranışlar eklenebilmesi sağlanmıştır.

Alışveriş sepetine ürün ekleme, indirim stratejileri uygulama, ödeme işlemlerini yönetme ve sepet değişikliklerini takip etme gibi işlemler farklı design pattern yapılarıyla geliştirilmiştir. Böylece proje, nesne yönelimli programlama prensiplerinin ve yazılım mimarisi yaklaşımlarının pratik kullanımını göstermektedir.


### KULLANILLAN TASARIM ÖRÜNTÜLERİ:

## CREATİONAL PATTERNS

# Singleton Pattern
Sistemde belirli bir sınıftan yalnızca tek bir nesne oluşturulmasını sağlamak amacıyla kullanılmıştır. Böylece gereksiz nesne üretimi engellenmiş ve merkezi bir kontrol yapısı oluşturulmuştur.

# Factory Pattern
Nesne oluşturma işlemlerini merkezi hale getirmek için kullanılmıştır. Kullanıcıya doğrudan nesne oluşturmak yerine uygun nesne tipi factory sınıfı üzerinden verilmiştir.


## STRUCTURAL PATTERNS

# Decorator Pattern
Sepet yapısına mevcut kodu değiştirmeden yeni özellikler eklemek amacıyla kullanılmıştır. Kupon ve kargo gibi ek işlemler dinamik şekilde sepete dahil edilmiştir.

# Facade Pattern
Ödeme sistemi gibi karmaşık işlemleri tek bir arayüz üzerinden yönetmek amacıyla kullanılmıştır. Böylece alt sistemlerin kullanımı sadeleştirilmiştir.


## BEHAVİORAL PATTERNS

# Observer Pattern
Sepette gerçekleşen değişikliklerin gözlemlenmesi için kullanılmıştır. Ürün eklendiğinde observer nesnelerine otomatik bildirim gönderilmektedir.

# Strategy Pattern
İndirim algoritmalarının çalışma anında değiştirilebilmesini sağlamak amacıyla kullanılmıştır. Öğrenci indirimi gibi farklı indirim stratejileri sisteme kolayca eklenebilmektedir.


### MİMARİ DİYAGRAM:
![Mimari Diyagram](docs/diagrams/phase2-diagram.png)

### NASIL ÇALIŞTIRILIR?
1) Proje Eclipse içerisine aktarılır.
2) `Main.java` dosyası çalıştırılır.
3) Konsol çıktıları gözlemlenir.
