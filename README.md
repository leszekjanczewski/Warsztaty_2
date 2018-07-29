# Warsztaty 2 - Zadania
Celem warsztatów jest napisanie obiektowej, bazodanowej warstwy aplikacji dla szkoły programowania. 
Aplikacja będzie zawierać część potencjalnych funkcjonalności – przechowywanie rozwiązań do zadań, wykonywanych przez kursantów.
Podczas kolejnych warsztatów zajmiemy się oprogramowaniem interfejsu użytkownika dla naszej
aplikacji.
**Weryfikacja działania** powinna nastąpić poprzez wywołanie metod w programach opisanych w dalszej części.
![schemat] (Screenshot%20from%202018-07-29%2015-39-14.png)
## Zadanie 1
- [x] Przygotuj folder pod aplikację
- [x] Załóż nowe repozytorium git na GitHubie i nową bazę danych
- [ ] **Pamiętaj o robieniu backupów bazy danych (najlepiej co każde ćwiczenie) i tworzeniu commitów (również co każde ćwiczenie)**
- [x] Stwórz plik .gitignore i dodaj do niego wszystkie podstawowe dane: (pliki *.*~, katalog z danymi twojego IDE, jeżeli istnieje itp.)
- [ ] Stwórz plik, który będzie służył do łączenia się z bazą danych

## Zadanie 2 - *z wykładowcą*
- [ ] Podczas ćwiczeń z wykładowcą, stwórz szkielet aplikacji i klasę User (na podstawie schematu z prezentacji)

## Zadanie 3
- [ ] Stwórz wszystkie tabele w bazie danych potrzebne do działania programu
- [ ] Pamiętaj o dodaniu kluczy głównych oraz powiązań między tabelami

## Zadanie 4
- Pozostałe klasy - Utwórz implementację pozostałych klas:
  - [ ] Group
  - [ ] Exercise
  - [ ] Solution
- Metody - Dla każdej klasy utwórz odpowiednie metody:
  - [ ] loadAll
  - [ ] loadById
  - [ ] delete
  - [ ] saveToDB
 
 ## Zadanie 5
 Dodatkowe metody:
 - Utwórz implementację dodatkowych metod realizujących zadania:
   - [ ] pobranie wszystkich rozwiązań danego użytkownika (dopisz metodę `loadAllByUserId` do klasy `Solution`),
   - [ ] pobranie wszystkich rozwiązań danego zadania, posortowanych od najnowszego do najstarszego (dopisz metodę `loadAllByExerciseId` do klasy `Solution`),
   - [ ] pobranie wszystkich członków danej grupy (dopisz metodę `loadAllByGroupId` do klasy `User`).
