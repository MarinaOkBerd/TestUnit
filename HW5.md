1. Для тестирования приложения для записной книжки можно использовать:
* Unit-тесты:
```
- проверка правильной записи нового контакта в записную книжку;
- проверка редактирования существующего контакта;
- проверка удаления существующего контакта;
- проверка блокировки существующего контакта.
- проверка вывода всех существующих контактов;
- проверка правильной сортировки всех существующих контактов, например, по имени.
```
* Интеграционные тесты:
```
- проверка поиска контакта, например, по имени или фамилии;
- проверка записи контакта в базу данных;
- проверка удаления существующего контакта из базы данных;
- проверка получения нужного контакта по ID из базы данных;
- проверка сохранности контактов в базе данных между сеансами связи.
```
* Сквозные тесты:
```
- проверка правильного выведения контактов в пользовательском интерфейсе;
- проверка правильных записей и удаления контактов через пользовательский интерфейс;
- поверка корректной передачей данных между базой и записной книжкой, например, запись контакта;
```
2. Определить тип теста.
* Функция addContact корректно добавляет новый контакт в список контактов - юнит-тест, так как проверяет один метод, не затрагивая другие компоненты.
* При добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов - интеграционный тест, так как проверяет взаимодействие пользовательского интерфейса с другими компонентами.
* Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление - сквозной тест, так как проверяется весь путь взаимодействия нескольких компонент.
