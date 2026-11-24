# مشروع Advanced Android UI & Navigation

**الطالب:** Mohammed Awni Salem  
**الرقم الجامعي:** 1301204452  
**اللغة:** Java  
**اسم المشروع:** AdvancedAndroidProject

## 1) فتح المشروع
1. فك ضغط الملف.
2. افتح Android Studio ثم اختر **Open** وحدد مجلد `AdvancedAndroidProject` نفسه (المجلد الذي يحتوي `settings.gradle`).
3. انتظر انتهاء Gradle Sync. استخدم JDK 17 عند الطلب.
4. شغّل التطبيق على محاكي أو هاتف Android.

## 2) تجربة التطبيق
- أدخل بريدًا إلكترونيًا صحيحًا، وكلمة مرور لا تقل عن 6 أحرف.
- زر LOGIN لا يتفعّل إلا بعد صحة الحقلين.
- اضغط LOGIN للانتقال إلى شاشة التبويبات.
- اسحب بين First وSecond وThird أو اضغط اسم التبويب.
- اضغط Set Mode واختر Light أو Night أو System.
- في Second أو Third اضغط زر الرجوع: يجب أن تعود إلى First.
- في First اضغط زر الرجوع: تعود إلى شاشة تسجيل الدخول.
- في شاشة تسجيل الدخول اضغط رجوع مرة، ثم خلال ثانيتين اضغطه ثانية للخروج.

## 3) أين توجد المتطلبات في الكود؟
| المتطلب | الملف |
|---|---|
| Email/Password وTextWatchers والتحقق | `MainActivity.java` و`activity_main.xml` |
| Snackbar والخروج بالضغط مرتين | `MainActivity.java` |
| Tabs + swipe + ViewPager2 | `ModelActivity.java` و`TabsPagerAdapter.java` |
| محتوى الصفحات | `TabFragment.java` و`fragment_tab.xml` |
| Popup Menu للوضع | `ModelActivity.java` و`mode_menu.xml` |
| Up Navigation | `ModelActivity.java` و`activity_model.xml` |

## 4) ملاحظات مهمة
- التحقق هنا محلي من تنسيق البريد وطول كلمة المرور، وليس تسجيل دخول إلى خادم أو قاعدة بيانات؛ ورقة التكليف لا تحدد خدمة مصادقة خلفية.
- البريد وكلمة المرور تجريبية ويمكن إدخال أي بريد صحيح وأي كلمة مرور من 6 أحرف فأكثر.
- إذا ظهر خطأ في Gradle، تأكد من اتصال الإنترنت لتنزيل المكتبات، ومن استخدام JDK 17.
- لا ترفع مجلد `build` إلى GitHub. ارفع مجلد المشروع وملف README.

## 5) فيديو العرض (بحد أقصى 3 دقائق)
1. اعرض شاشة Login واكتب بريدًا غير صحيح لإظهار التحقق، ثم صحح البريد وأدخل كلمة مرور قصيرة لإظهار خطأ الطول.
2. أدخل بريدًا صحيحًا وكلمة مرور من 6 أحرف على الأقل، ثم اضغط LOGIN.
3. اسحب First → Second → Third، ثم ارجع إلى First.
4. افتح Set Mode وجرّب Night ثم Light ثم System.
5. انتقل إلى Second واضغط رجوع لإظهار العودة إلى First.
6. من First اضغط رجوع للعودة إلى Login، ثم اضغط رجوع مرتين لإظهار Snackbar والخروج.
7. أعد فتح التطبيق، وسجّل الدخول، وأظهر سهم Up في أعلى الشاشة الذي يعيد إلى Login.

## 6) صيغة التسليم
- نظّف المشروع من Android Studio عبر **Build > Clean Project**.
- اضغط بزر الفأرة الأيمن على مجلد المشروع ثم Compress/Zip.
- ارفع نسخة المشروع إلى GitHub كـ Public repository.
- قدّم رابط GitHub أو Google Drive في خانة التسليم وفق تعليمات المدرّس.
- اسم ملف العرض المقترح: `MohammedAwniSalem_1301204452_Demo.mp4`
