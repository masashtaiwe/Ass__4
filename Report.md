========
السلام عليكم 
دكتور عملت الحل هون افضل وشرحت فيه بلغتي وبعتذر اني سلمت هسا بس حبيت اشتغل فيه وافهم منه كل اشي لانو شامل كل الي شرحته + الاسايمنت الثالث رفعته بس نسيت اضيفك عليه مشان تشوفه بعتذر كتير هي رابط الجيت هب ل الاسايمنت الثالث كل اشي مرفوع فيه 

https://github.com/masashtaiwe/exception-exercise.git
 



super
بتخلينا نربط بين الأب والابن
نستفيد من كود الأب وبضل اعمل عليه اضافات  في الابن بدون تكرار
ومن هون بستدعي الكونستركر الخاص في الاب وايضا بستدعي مثود ل الاب بداخل ميثود الابن 

=========================================
الجزء الرابع بدي احط هون الكود وتحته التعديل عشان يكون افضل اواوضح واسهل
class Animal {
String name;
void makeSound() {
System.out.println("Generic animal sound");
}
}

class RobotDog extends Animal {
int batteryLevel;
void makeSound(String sound) { // Overloading instead of overriding
System.out.println(sound);
}
}

الان اللي صار عنا هون هو
void makeSound()
void makeSound(String sound)
هدول بطبقو مفهوم overloading
مش overriding
وفي طبعا اختلاف بينهم هسا رح نعدل عليهم بحيث يطبقو هاد المفهوم  overriding
وطبعا لو ضلت زي ما هي makeSound(); لما تتم الطباعه رح يطبعلي الناتج
اللي بداخل الميثود تبعتها وهاد غلط لانو مش هاد المفهوم اللي بدنا اياه
====================================================================================================


الان بارت 5 هو ك التالي
RobotDog dog = new Animal();         
Animal dog2 = new RobotDog();        
Rechargeable dog3 = new RobotDog();   (if Rechargeable is an interface)
هاي الجمل المعطاه عنا ومطلوب منا 4 اسئلة اجاباتهم بتعتمد على الثلاث جمل هدول 

1_
الجملة 2 و3 بشتغلو عادي بينما الجملة الاولى لاء لانو الاب مابصير يورث اوبجيكت  من الابن بس العكس صحيح 
لانو الاب مابزبط يتحول ل ابن 


2_
dog مابتشتغل لانو كوها في الاصل غلط 
بينما dog2 بتشتغل وبتستدعي الميثود اللي موجودة ب Animal بس بزبطش يستدعي المثود الموجوده ب RobotDog(); 
الان dog3 بستخدم الميثود الموجودة ب Rechargeable  





3_
dog2.makeSound()
الجافا ب تحدد نوع الميثود اللي رح تتنفذ وقت التشغيل وطبعا بتوخذ الاحدث 
الان لو الفيريبل كان Animal 
RobotDog بتم استدعاء المثود من 

4_
Polymorphism في المختصر هو تعدد في الاشكال بحيث انو التنفيذ اللي بصير فيه بيعتمد على نوع الوبجيكت اللي موجود فيه وقت التشغيل 



======================
بارت_6
Animal a = new RobotDog("Bolt", 2, 90);
a.eat();
a.makeSound();

بناءا على هذا الكود بدنا نشرح سلوك  ـ overriding


1_eat(); 
بتتنفذ من RobotDog لانها عامله override
2_
 الجافا بتختار شو النسخه اللي حتطبعها حسب الوبجيكت الفعلي وهون هو RobotDog

3_
اذا مابقا عندي اوفر رايد ل makeSound() بستدعي نستختها تبعتAnimal  


 Reflection:
Discuss:

How does abstraction improve flexibility when adding new types of animals (e.g., Bird, Cat, RobotCat)?

What would happen if Animal were not abstract?

Why is it better to depend on abstractions (interfaces, abstract classes) rather than concrete implementations?


Abstraction:
معناها اني باخذ الفكرة العامه في هادا الكود بدون حتى ما ادخل في تفاصيله الان لما بنضيف انواع جديده الابيستراكت هون بساعدني
اني مابضطر ارجع ل الكود القديم بخلي الكلاسس الجديد يكمل بنفس الطريقه بدون ما يخرب الكود القديم فبصير البرنامج سهل ومرن 

Animal were not abstract:
لو الانيمل مش ابيستراكت وقتها بنكتب الكود بصيغة عامه زي هيك Animal a = new Animal();
بس حتى هاي مش منطقيه لانها مكتوبة بصيغة عامه ومش محددة شو نوع الانيمل 
وبنفس الوقت لو ماكان ابيستراكت مابنقدر نجبر الابناء يكتو الميثود الخاصه فيهم وبهيك بصير كودي خربشة وقايمه 
وبنصير نعيد الكلاسات من اول وجديد بدل ما يورثو 


better to depend on abstractions:

abstractions منها بكون الاساس وبعدين بخلي التفاصيل اللي لباقي الكلاساات كل اوبجيكت يحددها لوحده 








