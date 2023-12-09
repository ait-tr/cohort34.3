## Базовый порядок работы / выгрузка посредством `CLI`

1. **Подключение Git к проекту**
    - `git init`
    - создается “скрытое хранилище” - каталог `.git/` - в корне проекта
2. **Поставить файлы (изменения) на контроль / сделать снимок состояния проекта / сохранить изменения — ЛОКАЛЬНОЕ СОХРАНЕНИЕ**
    - `git add .` добавить все файлы (изменения в очередь)
    - `git commit -m 'update'` сохранение как таковое
3. **Для нового проекта создать репо на GitHub**

![Screenshot from 2023-11-06 13-03-26.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/1825a04e-6427-41ee-9298-98aa5a11c0ad/Screenshot_from_2023-11-06_13-03-26.png)

1. **Сделать привязку между локальным и дистанционным репозиториями**
    - `git remote add origin скопированная_ссылка`
2. **Выгрузить коммиты (изменения) на GitHub**
    - `git push -u origin main` ветка `main` или другая

## Выгрузка новых изменений на GitHub

1. Сделать правки в проекте
2. Сохранить и выгрузить на **GitHub**

```bash
git add .
git commit -m 'update'
git push -u origin main
```

## Работа с привязкой

### 1. Просмотр привязки

```bash
git remote -v
```

### 2. Добавить привязку

```bash
git remote add origin скопированная_ссылка
```

![Screenshot from 2023-11-06 13-08-37.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/ca2961a5-1220-4249-b76c-e65e32237b27/Screenshot_from_2023-11-06_13-08-37.png)

### 3. Удалить привязку

```bash
git remote rm origin
```

## Удалить локальный репозиторий (!)

```bash
rm -rf .git
```

## Ветки / механизм ветвления в Git

- ветка - изолированный поток разработки (еще одна версия проекта)

!https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/2839841d-e701-4102-b1b8-2d48f4d90fc6/Untitled.png

## Работа с ветками

### 1. Просмотр списка веток (версий)

```bash
git branch
```

### 2. Создать новую ветку (от текущей)

```bash
git branch новая_ветка
git branch новая_ветка main
```

### 3. Переключиться на другую ветку

```bash
git checkout название_ветки
git checkout - # переключиться на предыдущую
```

### 4. Создать ветку и переключиться (одной командой)

```bash
git checkout -b new_branch
git checkout -b new_branch main
```

### 5. Выгрузить ветку на GitHub

```bash
git push -u origin название_ветки
```

### 6. Удаление локальной ветки (!)

```bash
git branch -D название_ветки
git branch -D ветка_1 ветка_2 ветка_3 # сразу несколько
```

### 7. Удаление дистанционной ветки (!)

```bash
git push origin --delete название_ветки
git push origin --delete ветка_1 ветка_2 ветка_3 # сразу несколько
```

### 8. Переименование текущей локальной ветки

```bash
git branch -m новое_название
```

### 9. Слияние веток

- перенос (интеграция) изменений из одной ветки в другую
- перед слиянием необходимо переключиться на целевую ветку

```bash
git merge название_ветки
```

**Задача. Создать на основе ветки `main` новую ветку и сразу на нее переключиться (одной командой)**

```bash
git checkout -b NEW_BRANCH main
```

**Задача. Сделать новый функционал и интегрировать его в ветку `main`**

```bash
git checkout -b new main
# делаю новый функционал на ветке new
# сохраняю правки (add + commit)
git checkout main # переключаюсь на main
git merge new # делаю слияние (перенос правок из new в main)
git branch -D new # удалить ветку new после слиния
```

## Стратегии ветвления в Git

1. **Git Flow**
    1. `main/master/stable` - long-term (только для проверенного, оттестированного кода - “**священный грааль**”)
    2. `develop/current` - long-term (для тестирования, текущая разработка)
    3. `login/bugfix1/payments` - short-term
2. **GitHub Flow**
    1. `main/master/stable` - long-term
    2. `login/bugfix1/payments` - short-term

## Клонирование репозитория

- скачивание репо на свой компьютер

## Файл `README.md`

- использует формат Markdown
- является описанием (инструкцией) репозитория
- находится в корне проекта

```bash
## Java Repo
### мой репозиторий
```

## Ссылки

- [клонирование в IDEA](https://javarush.com/groups/posts/2818-podruzhim-git-s-intellij-idea)
- [ветвление в Git](https://git-scm.com/book/ru/v2/%D0%92%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B2-Git-%D0%9E-%D0%B2%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B8-%D0%B2-%D0%B4%D0%B2%D1%83%D1%85-%D1%81%D0%BB%D0%BE%D0%B2%D0%B0%D1%85)
- [формат Markdown](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [конспект](https://western-appeal-39b.notion.site/Linux-Git-2-Nov-6-2023-f0108b6fa64441629793b19bccc06d1d?pvs=4)