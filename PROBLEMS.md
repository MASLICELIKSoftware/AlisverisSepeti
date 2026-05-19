# FAZ 0–BAŞLANGIÇ KODUNUN ANALİZİ

Projeyi incelerken nesne oluşturma işlemlerinin doğrudan ana sınıflar içerisinde yapıldığını fark ettim.
Bu durum kodun esnekliğini azaltıyordu ve yeni özellik eklemeyi zorlaştırıyordu. Ayrıca Open/Closed Principle açısından da uygun bir yapı değildi çünkü yeni nesne türleri eklemek için mevcut kod üzerinde değişiklik yapmak gerekiyordu.
Bu problemi çözmek amacıyla Creational Design Pattern kullanarak nesne üretim sürecini daha düzenli ve genişletilebilir hale getirmeyi hedefledim.
Bu issue Creational Design Pattern uygulamaları ile çözüldü.
Closes #3
