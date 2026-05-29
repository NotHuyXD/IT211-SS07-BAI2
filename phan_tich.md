# PHÂN TÍCH BÀI 2 - CHẶN HÀNH ĐỘNG BẰNG NGOẠI LỆ

## 1. Vấn đề hiện tại

Trong hệ thống E-commerce, chỉ người dùng có vai trò ADMIN mới được phép gọi các hàm thêm dữ liệu, tức là các hàm bắt đầu bằng `add*`.

Tuy nhiên, Aspect hiện tại chỉ kiểm tra quyền rồi in ra màn hình:

```java
System.out.println("!! TRUY CẬP BỊ TỪ CHỐI !! User không có quyền.");