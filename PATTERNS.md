Phase 2 - Structural Patterns

Decorator Pattern
Bu örüntüyü alışveriş sepetine mevcut yapıyı bozmadan yeni özellikler eklemek için kullandım. KuponDecorator ve KargoDecorator sınıfları sayesinde indirim ve kargo özelliklerini dinamik şekilde ekleyebildim. Bu yaklaşım ile Open/Closed Principle’e uygun hale geldi.

Facade Pattern
Bu örüntüyü sepet, indirim, kargo ve ödeme gibi alt sistemleri tek bir noktadan yönetmek için kullandım. OdemeSistemi sınıfı kullanıcı açısından daha sade ve anlaşılır bir ödeme süreci sağladı. Bu sayede sistem karmaşıklığı azaltılmış oldu.