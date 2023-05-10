package com.example.vk;

import com.example.vk.task.Task;
import com.example.vk.task.TaskRepository;
import com.example.vk.user.User;
import com.example.vk.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class VkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(VkApplication.class, args);

        UserRepository userRepository =
                configurableApplicationContext.getBean(UserRepository.class);

        User user1 = new User("Aleksey", "Shulikov");
        User user2 = new User("Gleb", "Karpov");
        User user3 = new User("Vitaliy", "Buterin");

        userRepository.saveAll(List.of(user1, user2, user3));

        TaskRepository taskRepository =
                configurableApplicationContext.getBean(TaskRepository.class);

        Task task1 = new Task("CTF", "Шифрование", "Разгадайте зашифрованные сообщения");
        Task task2 = new Task("CTF", "Сетевая безопасность", "Проникните в защищенную сеть");
        Task task3 = new Task("CTF", "Web-уязвимости", "Найдите и эксплуатируйте уязвимость веб-приложения");
        Task task4 = new Task("CTF", "Криптография", "Решайте криптографические задачи");
        Task task5 = new Task("CTF", "Стеганография", "Найдите скрытые сообщения в изображении или звуковом файлег");

        Task task6 = new Task("Тест", "Кибератаки", "Тестирование знаний по распространенным видам кибератак");
        Task task7 = new Task("Тест", "Шифрование", "Тестирование знаний по основам криптографии и методам шифрования");
        Task task8 = new Task("Тест", "Уязвимости", "Тестирование знаний по методам обнаружения и анализа уязвимостей");
        Task task9 = new Task("Тест", "Безопасность веб-приложений", "Тестирование знаний по методам обеспечения безопасности веб-приложений");
        Task task10 = new Task("Тест", "Сетевая безопасность", "Тестирование знаний по методам обеспечения безопасности сетей");
        Task task11 = new Task("Тест", "Аутентификация и авторизация", "Тестирование знаний по методам аутентификации и авторизации пользователей");
        Task task12 = new Task("Тест", "Мобильная безопасность", "Тестирование знаний по методам обеспечения безопасности мобильных устройств");
        Task task13 = new Task("Тест", "Законодательство о кибербезопасности", "Тестирование знаний по действующему законодательству в области кибербезопасности");
        Task task14 = new Task("Тест", "Социальная инженерия", "Тестирование знаний по принципам социальной инженерии и методам ее предотвращения");
        Task task15 = new Task("Тест", "Программное обеспечение безопасности", "Тестирование знаний по программным средствам для обеспечения безопасности");

        Task task16 = new Task("Чтение", "Основы кибербезопасности", "Введение в концепции кибербезопасности");
        Task task17 = new Task("Чтение", "Криптография", "Ознакомление с основами криптографии");
        Task task18 = new Task("Чтение", "Методы защиты информации", "Изучение различных методов защиты информации");
        Task task19 = new Task("Чтение", "Социальная инженерия", "Понимание принципов социальной инженерии и как ей противостоять");
        Task task20 = new Task("Чтение", "Хакерские атаки", "Изучение распространенных видов хакерских атак");
        Task task21 = new Task("Чтение", "Законодательство о кибербезопасности", "Ознакомление с действующим законодательством в области кибербезопасности");
        Task task22 = new Task("Чтение", "Анализ уязвимостей", "Получение навыков анализа уязвимостей в компьютерных системах");
        Task task23 = new Task("Чтение", "Методы аутентификации", "Изучение различных методов аутентификации пользователей");
        Task task24 = new Task("Чтение", "Программное обеспечение безопасности", "Ознакомление с программными средствами для обеспечения безопасности");
        Task task25 = new Task("Чтение", "Киберугрозы", "Изучение распространенных типов киберугроз");
        Task task26 = new Task("Чтение", "Безопасность в облачных вычислениях", "Ознакомление с принципами обеспечения безопасности в облачных вычислениях");
        Task task27 = new Task("Чтение", "Безопасность мобильных устройств", "Изучение методов защиты мобильных устройств");
        Task task28 = new Task("Чтение", "Информационная безопасность предприятия", "Понимание важности информационной безопасности для предприятия");
        Task task29 = new Task("Чтение", "Правила безопасного поведения в Интернете", "Изучение правил безопасного поведения в Интернете");
        Task task30 = new Task("Чтение", "Защита персональных данных", "Понимание важности и методов защиты персональных данных");

        List<Task> tasks = List.of(
                task1, task2, task3, task4, task5,
                task6, task7, task8, task9, task10,
                task11, task12, task13, task14, task15,
                task16, task17, task18, task19, task20,
                task21, task22, task23, task24, task25,
                task26, task27, task28, task29, task30
        );

        taskRepository.saveAll(tasks);
    }
}
