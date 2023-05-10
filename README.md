Итак, представляю вашему вниманию мое решение. 

Я его не захостил, поэтому, к сожалению, вам придется его запустить вручную.

Фронт не будет работать без запущенного сервера. 

Важные допущения: я понимаю, что скорее всего 3 типа задач должны отличаться под собой координальным образом, 
но т.к. их нам реализовывать не нужно, что я упростил их до одной схемы данных с разным полем "type". 
В реальном подходе это были бы 3 разные таблицы.

Важное замечание: фронт имеет один баг - он не обновляется автоматически, для его обновления смените пользователя или обновите страничку.
Я заготовил 3 пользователей для демонстрации работы скорборда. 

Важные особенности:
я использую внутреннюю H2 базу данных и заполняю его заготовленными данными. 

Также приношу свои извинения за отсутствие комментариев в коде (если его, конешно, кто-то посмотрит)

В контроллерах есть методы для admin. 

Я не успел соеденить фронт и бек, поэтому прошу запустить его отдельно.

# Инструкция
Итак, прошу следовать следующему плану:
- Запустить данный проект на http://localhost:8080
- Запустить фронт https://github.com/D1scoDancer/vk-frontend на http://localhost:3000
- Покликать кнопочки, поменять юзеров, пообновлять страницу
