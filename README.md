# 4 modul Exam
## 2-variant 

   1. log chiqaring, fine log, filega yozin
   2. Deadlock nima, uni qanday bartaraf etish mumkin?
   3. Faylga yozilgan 2 ta son yig'indisini boshqa faylga yozing
   4. Fayldan nusxa yarating
   5. Sana uchun regex yozing

### Nazariy javoblar:

  2. Deadlock threadlar da ketma ket ishlayotganda bir birini kutib 
    qolishida sodir boladi, yani threadda bajarilayotgan resursga bloklanadi.
    Deadlocklarni oldini olish uchun resurslarni 
    ketma-ket olish algoritmini yozish kerak. Bloklangan joylarni 
    kamaytirib, timeoutlarni qoshish kerak. 

**INFO:** _Mavzu tushuntirganizda nazariyasini tushunganman. Amalda tushunib 
ishlata olmaganman_

  5. **regex:**

    ([1-9]\d{3})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|30)

  ([1-9]\d{3}): yil -> 1000 dan 9999 gacha bolgan sonlar. <br>
  (0[1-9]|1[0-2]): oy -> 01 dan 12 gacha bolgan sonlar. <br>
  (0[1-9]|1[0-9]|2[0-9]|30): kun -> 01 dan 30 gacha bo'lgan sonlar.


