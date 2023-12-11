## Ссылки

- [Git: введение](https://git-scm.com/book/ru/v2/%D0%92%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%9E-%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B5-%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8F-%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D0%B9)
- [Git: зачем?](https://www.atlassian.com/ru/git/tutorials/what-is-git)

## При установке Git

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/92a4c197-7ef1-4997-a29e-ec70107034b6/Untitled.png)

# GIT (2005)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/1a780f00-9069-487f-825d-a7013b854a61/Untitled.png)

**Что это?**

- Система контроля версий
- Хранилище
- Машина времени
- Умная система
управления кодом проекта
- Содержит все файлы
проекта
- Своебразная БД, т.е.
хранит в структурированном виде
- Можно восстановить
предыдущие версии файлов
- Есть обмен версиями
между разработчиками
- Проверка целостности
(контрольные суммы, хеш-суммы – если
быть точным) – надежная система

## Этапы работы

1. **Подготовительный этап**
    - (только для Windows) установка GIT на компьютер https://git-scm.com/downloads
    - настройка Git на компьютере:
        - `git config --global -l` посмотреть текущие настройки
        - `git config --global user.name "Ivan Ivanov"` настройка имени
        - `git config --global user.email "my_email@example.org"` настройка email
    - наличие аккаунта на GitHub
    - выгрузить публичный ключ на GitHub
        - просмотр публичного ключа (если ошибка, то надо сгенерировать)
            - `cat ~/.ssh/id_ed25519.pub`
            - `cat ~/.ssh/id_rsa.pub`
        - `ssh-keygen -t ed25519 -C 'email@example.org'` сгенирировать пару ключей (ВЫПОЛНИТЬ ТОЛЬКО В НАЧАЛЕ КАРЬЕРЫ)
        - скопировать публичный ключ на GitHub
        - `ssh -T git@github.com` проверить, что ключ выгружен на GitHub

## Проверка текущей версии Git

```bash
# открыть GitBash (Windows)
git -v
```

## Базовые термины

- **проект** - каталог с файлами исходного кода (кодовая база)
- **репозиторий** - хранилище Git со всей историей разработки проекта (`.git/`)

### GIT - система контроля версий

- **Git** - вспомогательная программа (инструмент) любого разработчика
- **GitHub** - интернет-площадка (хостинг проектов)
- **GitHub Pages** - сервис GitHub (хостинг статических файлов)

## Виды программных интерфейсов

1. `GUI` (Graphical User Interface) - графический интерфейс пользователя
2. `CLI` (Command Line Interface) - интерфейс командной строки

### Основные способы авторизации в Интернет

1. По паролю
2. По публичному ключу
    - используют в профе. среде
    - позволяет выполнять авторизацию без пароля (прозрачно)
    - подразумевает наличие пары ключей
        - публичный (public) - можно делиться со всеми
        - приватный (private) - храним в секрете

## Необходимые знания для работы в команде

1. Освоить базовый порядок работы с Git/GitHub
2. Освоить механизм ветвления
3. Освоить модели совместной разработки

## Базовый (основной) порядок работы с GIT/GitHub

1. `git init` создать пустой репо (выполняется один раз, для нового проекта)
2. `**git add .**` поставить все файлы проекта на контроль
3. `**git commit -m 'описание изменений'**`  выполнить коммит (сохранение)
4. Создание нового репо на **GitHub** (один проект - один репо)
5. `git remote add origin ссылка` выполнить привязку LOCAL ↔ REMOTE (делается один раз для нового проекта)
6. **`git push -u origin main`** выгрузить на GitHub
    1. `git push` (короткий вариант для следующих коммитов)

## Просмотр текущей привязки

```bash
git remote -v
```

## Удалить текущую привязку

```bash
git remote rm origin
```