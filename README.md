# ТЗ

Необходимо разработать приложение, реализующие АРМ менеджера по оформлению кредита с использованием следующего стека технологий: Spring MVC, Hibernate (не использовать Spring Data), PostgreSQL.
 
Общий процесс выглядит следующим образом:
1) оформление заявки на кредит
2) принятие решения по кредиту
3) подписание кредитного договора

 
1. Пользователь создает заявку на кредит, содержащую следующую информацию о клиенте:
∙             Фамилия, имя, отчество
∙             Паспортные данные
∙             Семейное положение
∙             Адрес прописки
∙             Контактный телефон
∙             Сведения о занятости(период работы, должность, название организации)
∙             Сумма желаемого кредита.
 
2. После оформления заявки на кредит система случайным образом принимает решение о кредите. Решение состоит из статуса(одобрен/не одобрен), предлагаемого срока в днях(1-12 месяцев), одобренная сумма кредита.
 
3. После одобрения кредита, система должна позволить подписать кредитный договор. Кредитный договор должен содержать информацию из заявки, дату подписания, а также статус подписи(подписан/не подписан). 
 
Система должна предоставлять следующий дополнительный функционал:
1) Вывод списка всех клиентов
2) Поиск клиента по телефону, ФИО и паспортным данным
3) Выводить список заявок со статусом одобрения
4) Выводить список всех подписанных кредитных договоров со статусом подписания
 
Основное требование к интерфейсу приложения – выполнение описанных функций, красивое оформление, стили можно не делать.



![main_page](https://drive.google.com/uc?export=view&id=1r8CMOU_jwTYdNI_3fl9tP0bL8KHAcesE)

![app1](https://drive.google.com/uc?export=view&id=14DBht5bJsv5TL8Mdqve2Q8WUiL6eagp4)

![app2](https://drive.google.com/uc?export=view&id=1YQHB9Vqq0jJOFfjh1G2pDxdFa6Ubl28u)

![approve1](https://drive.google.com/uc?export=view&id=17sel7xCwEE3HvfIjq5sMgn04wcSRjpQl)

![approve2](https://drive.google.com/uc?export=view&id=1WgF_0on9bXOxGt3QoKdA4WKIosennTcX)

![disapprove](https://drive.google.com/uc?export=view&id=1G2jokvg4E0-7r_U7xMd7KD4LTsNZKG73)

![list_customers](https://drive.google.com/uc?export=view&id=1-dBSVk6Wdxv1DDwnKPqpwFcuAPqaHwvn)

![list_app](https://drive.google.com/uc?export=view&id=11pwS5x4y999Tutd4N9rt1iAYOgBA_8_K) 

![list_agrmt](https://drive.google.com/uc?export=view&id=1OaqaQ_AIPjBwRh9S4_sw2U6PZKWcKSqy) 
