# Java Console Calculator

## Description (English)

This is a console-based calculator application written in Java. It allows users to perform basic arithmetic operations, square a number, and view a persistent in-memory history of operations.

### Features
- Addition, subtraction, multiplication, division
- Square function
- Operation history (stored in memory)
- Input validation and clear prompts
- Console-based menu navigation

### Technologies Used
- Java Core: Scanner, Arrays, try-with-resources, exception handling
- Data Structures:
  - ArrayList<ArrayList<String>> for storing history
  - StringBuilder for efficient string formatting
- Varargs (int... numbers)
- Java Stream API
- Modular structure:
  - `Main.java` handles UI and input
  - `MathOperations.java` performs calculations
  - `History.java` manages operation history

---

## Açıklama (Türkçe)

Bu proje, Java ile yazılmış bir konsol tabanlı hesap makinesidir. Kullanıcının temel matematik işlemlerini yapmasına, sayıların karesini almasına ve bellekte işlem geçmişini görüntülemesine olanak tanır.

### Özellikler
- Toplama, çıkarma, çarpma, bölme
- Kare alma işlemi
- Bellekte tutulan işlem geçmişi
- Giriş kontrolü ve yönlendirici mesajlar
- Konsol tabanlı menü arayüzü

### Kullanılan Teknolojiler
- Java Temelleri: Scanner, Arrays, try-with-resources, hata yönetimi
- Veri Yapıları:
  - ArrayList<ArrayList<String>> ile geçmiş kaydı
  - StringBuilder ile çıktı oluşturma
- Varargs (int... numbers)
- Java Stream API
- Modüler yapı:
  - `Main.java` kullanıcı arayüzünü yönetir
  - `MathOperations.java` hesaplamaları yapar
  - `History.java` geçmiş verilerini yönetir
