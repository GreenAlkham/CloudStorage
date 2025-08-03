# Дипломная работа "Облачное хранилище"

## Описание проекта
Сервис предоставляет REST-интерфейс для загрузки файлов и вывода списка уже загруженных файлов пользователя.

Описание задания расположено [здесь](https://github.com/netology-code/jd-homeworks/blob/master/diploma/cloudservice.md).

## Тестовые данные

### Тестовые пользователи:
1. Администратор:\
   Логин: admin@test.ru\
   Пароль: password1

2. Пользователь:\
   Логин: user@test.ru\
   Пароль: password2

### Тестовый файл
Тестовый файл уже размещён в текущем проекте - [здесь](src/test/resources/test_file.txt).

## Запуск приложения

### Запуск FRONT:
1. Установите [nodejs](https://nodejs.org/ru/download/current/) (версия не ниже 19.7.0).
2. Скачайте [FRONT](https://github.com/netology-code/jd-homeworks/blob/master/diploma/netology-diplom-frontend).
3. Перейдите в папку FRONT приложения и все команды для запуска выполняйте из неё.
4. Следуя описанию README.md FRONT проекта, запустите nodejs-приложение (`npm install`, `npm run serve`).
5. Далее нужно задать url для вызова своего backend-сервиса.
   1. В файле `.env` FRONT (находится в корне проекта) приложения нужно изменить url до backend.
   2. Запустите FRONT снова: `npm run serve`.

### Запуск BACKEND:
1. Скачать данный [проект](https://github.com/GreenAlkham/CloudStorage)
2. Выполнить `mvn clean package`,
3. Запустить `docker-compose.yml` (`docker-compose up`).