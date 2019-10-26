package ru.java.courses;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x) {
        return (int) Math.sqrt(13 * x + 13 / x);
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {
        //работаю с чарами,чтобы на каждой
        //итерации не создавать новые строки и
        //не расходовать больше памяти,тк строки
        //immutable.
        String[] arr = fullName.split(" ");
        char[] temp = new char[arr.length * 2];
        for (int i = 0, j = 0; i<temp.length; i++,j++) {
            temp[i]=arr[j].charAt(0);
            temp[++i]='.';
        }
        return String.copyValueOf(temp).toUpperCase();
    }

}
