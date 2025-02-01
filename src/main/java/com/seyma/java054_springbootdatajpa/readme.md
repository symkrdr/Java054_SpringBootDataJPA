1. **GET**

##    Veriyi almak için kullanılır.

   -Sadece okuma işlemi yapar (idempotenttir, yani aynı istek tekrarlandığında aynı sonucu üretir).

2. **POST**

   ## Sunucuya yeni bir veri eklemek için kullanılır.
   
   -Güvenli değildir (tarayıcı geçmişine kaydedilebilir, önbelleğe alınmaz).

   -İdempotent değildir (aynı istek tekrarlandığında farklı sonuçlar olabilir)

3. **PUT**

   ## Mevcut bir kaynağı tamamen güncellemek için kullanılır.

   İdempotent değildir (aynı istek tekrarlandığında farklı sonuçlar olabilir).

4. **PATCH**

##    Mevcut bir kaynağın belirli bir kısmını güncellemek için kullanılır.
 
   İdempotent değildir, çünkü her seferinde farklı bir değişiklik olabilir.

5. **DELETE**

## Sunucudaki bir kaynağı silmek için kullanılır.

   İdempotent olabilir, ancak her zaman kesin değildir.

6. **HEAD**

 ##  GET isteği gibi çalışır, ancak sadece başlık bilgilerini (headers) döndürür, içerik (body) göndermez.
   
   Önbellekleme veya bağlantı testleri için kullanılır.


7. **OPTIONS**
##   Bir sunucunun veya kaynağın desteklediği HTTP metodlarını öğrenmek için kullanılır.
  
   Sunucunun hangi HTTP metodlarını desteklediğini döndürür.   


## NOT!!
**İdempotent, bir işlemin birden fazla kez tekrarlandığında aynı sonucu üretmesi anlamına gelir.**
