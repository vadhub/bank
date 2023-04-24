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

# Перед началом

Для запуска используется сервер [Apache Tomcat 9.0.74](https://tomcat.apache.org/download-90.cgi)

Создание базы данных с таблицами
```SQL

create database bank;

create table work (
	id_work BIGSERIAL NOT NULL PRIMARY KEY,
	name_org VARCHAR(150) NOT NULL,
	period_from DATE NOT NULL,
	period_to DATE NOT NULL,
	position_job VARCHAR(150) NOT NULL
);

create table customer (
	id_customer BIGSERIAL NOT NULL PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	patronymic VARCHAR(255) NOT NULL,
	address VARCHAR(255) NOT NULL,
	seria INT NOT NULL,
	number INT NOT NULL,
	family_status VARCHAR(50) NOT NULL,
	phone_number VARCHAR(255) NOT NULL,
	id_work INT NOT NULL,
	CONSTRAINT fk_work
		FOREIGN KEY(id_work)
		REFERENCES work(id_work) 
);

create table credit_app (
	id_credit BIGSERIAL NOT NULL PRIMARY KEY,
	sum_ INT NOT NULL,
	period INT NOT NULL,
	approve INT NOT NULL,
	id_customer INT NOT NULL,
	CONSTRAINT fk_customer
		FOREIGN KEY(id_customer)
		REFERENCES customer(id_customer) 
);

create table credit_agmt (
	id_credit_agmt BIGSERIAL NOT NULL PRIMARY KEY,
	id_credit INT NOT NULL,
	date_sign DATE, 
	sign INT NOT NULL,
	CONSTRAINT fk_credit
		FOREIGN KEY(id_credit)
		REFERENCES credit_app(id_credit) 
);
`````
# Скриншоты

Главная страница
![main_page_](https://drive.google.com/uc?export=view&id=1r8CMOU_jwTYdNI_3fl9tP0bL8KHAcesE)

Создание заявки
![app1](https://drive.google.com/uc?export=view&id=14DBht5bJsv5TL8Mdqve2Q8WUiL6eagp4)

![app2](https://drive.google.com/uc?export=view&id=1YQHB9Vqq0jJOFfjh1G2pDxdFa6Ubl28u)

После одобрения кредита система предлагает подписать
![approve1](https://drive.google.com/uc?export=view&id=17sel7xCwEE3HvfIjq5sMgn04wcSRjpQl)

После подписания
![approve2](https://drive.google.com/uc?export=view&id=1WgF_0on9bXOxGt3QoKdA4WKIosennTcX)

В случае отклонения заявки
![disapprove](https://drive.google.com/uc?export=view&id=1G2jokvg4E0-7r_U7xMd7KD4LTsNZKG73)

Список клиентов
![list_customers](https://drive.google.com/uc?export=view&id=1-dBSVk6Wdxv1DDwnKPqpwFcuAPqaHwvn)

Поиск клиента по ФИО
![find_customer](https://drive.google.com/uc?export=view&id=1EAOr5H1A_T9wPaaYc4uHzXYs_HClzi2m)

Список заявок
![list_app](https://drive.google.com/uc?export=view&id=11pwS5x4y999Tutd4N9rt1iAYOgBA_8_K) 

Список подписанных договоров
![list_agrmt](https://drive.google.com/uc?export=view&id=1OaqaQ_AIPjBwRh9S4_sw2U6PZKWcKSqy) 
