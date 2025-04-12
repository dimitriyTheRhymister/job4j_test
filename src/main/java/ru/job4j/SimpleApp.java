package ru.job4j;

import io.javalin.Javalin;
import org.apache.log4j.Logger;

public class SimpleApp {
    private static final Logger LOGGER = Logger.getLogger(SimpleApp.class);

    public static void main(String[] args) {
        // Запуск сервера на порту 7000
        Javalin app = Javalin.create().start(7000);
        LOGGER.info("Сервер запущен на порту 7000");

        // Определение маршрутов
        app.get("/", ctx -> ctx.result("Welcome to the Simple App!"));

        app.get("/test", ctx -> {
            LOGGER.info("Запрос получен на /test");
            ctx.result("Test endpoint is working");
        });

        app.get("/jobs", ctx -> {
            LOGGER.info("Запрос получен на /jobs");
            ctx.result("Jobs endpoint is working");
        });
    }
}
