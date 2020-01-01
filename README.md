# Lesson-07

Створити класи Су-27, Керування Літаком. В класі Керування літаком створити методи:

o РухВверх

o РухВниз

o РухВліво

o РухВправо

При виклику даних методів необхідно реалізувати випадкову генерацію числа , яке представлятиме

відстань на яку буде переміщуватись даний корабель.

Створити абстрактний клас Літак який матиме методи:

o ЗапускДвигунів , який буде виводити на екран скільки часу залишилось до готовності влетіти, де

час генерується випадково в межах від [20,88].

o ВзлітЛітака, який виводитиме скільки проїде літак кілометрів на повному баку палива. Генеруємо

випадкове дробове число від нуля до 1000

o ПосадкаЛітака, який виводитиме на екран що літак іде на посадку.

Описати габарити літака в полях даного класу. (Довжина, ширина, вага,). Створити конструктор даного

класу , куди передати дані поля.

Створити Інтерфейс в якому описати спеціальні можливості літака :

o ТурбоПрискорення

o ТехнологіяСтелс

o ЯдернийУдар

Переходимо до класу Су-27. Необхідно реалізувати звязок між даними класами таким чином, щоб Су-27

мав можливість працювати з полями і методами інших класів. Тобто наслідуваня, композиція,

делегування.

o Необхідно перевизначити методи інтерфейсу в класі Су-27 , щоб

o ТурбоПрискорення виводив на екран швидкіть яка буде випадково генеруватись і повинна бути більшою за максимальну

швидкість літака Су-27. Метод

o ТехнологіяСтелс виводив на екран , що літака не видно протягом випадково згенерованого числа.

o ЯдернийУдар виводив на екран випадкову кількість ядерних боєголовок яку буде скинуто, але не

більше 10.

o Описати поля: максимальна швидкість, колір, які передати в конструктор з параметрами.

Створити клас Мейн, де створити мейн метод, створити в ньому обєкт Су-27. І тепер імітуємо політ літака.

А) Запускаємо двигуни літака

Б) Проводимо взліт літака

В) Рухаємось вверх ,вліво, вниз, вправо

Г) Включаємо технологію стелс

Д) Проводимо ядерний удар

Е) Включаємо турбоприскорення і тікаємо

Є) Проводимо посадку літака
