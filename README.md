# Songify: Aplikacja do Zarządzania Albumami, Artystami i Piosenkami

**Songify** to aplikacja webowa, która umożliwia zarządzanie albumami, artystami oraz piosenkami. Aplikacja oferuje rozbudowane funkcje administracyjne, takie jak dodawanie artystów, albumów oraz piosenek, a także przeglądanie zawartości przez niezalogowanych użytkowników.

## Technologie

W projekcie **Songify** wykorzystałem następujące technologie i narzędzia:

- **Język programowania**: Java 17
- **Framework**: Spring Boot (moduły: Spring Web, Spring Data, Spring Security)
- **Baza danych**: PostgreSQL
- **Narzędzia do zarządzania bazą danych**: pgAdmin
- **Konteneryzacja**: Docker & Docker Desktop
- **ORM**: Hibernate
- **Migracje bazy danych**: Flyway
- **Testowanie**:
  - JUnit 5
  - AssertJ
  - Spring Boot Test
  - TestContainers
  - MockMvc
- **Bezpieczeństwo**:
  - JSON Web Token (JWT)
  - OAuth 2.0 (w tym "Sign in with Google")
  - CSRF (Cross-Site Request Forgery)
  - HTTPS (z własnym certyfikatem SSL generowanym przez OpenSSL)
- **Inne narzędzia i biblioteki**:
  - Maven (zarządzanie zależnościami)
  - Log4j2 (logowanie)
  - Lombok (redukcja kodu)
  - JSON (obsługa danych w formacie JSON)
  - Swagger (dokumentacja API)
- **IDE**: IntelliJ IDEA Ultimate
- **Kontrola wersji**: Git & GitHub

## Funkcjonalności

### Zarządzanie Muzyką:
1. **Dodawanie artysty** – Możliwość dodania nowego artysty (nazwa artysty).
2. **Dodawanie gatunku muzycznego** – Możliwość dodania nowego gatunku muzycznego (nazwa gatunku).
3. **Dodawanie albumu** – Dodanie albumu (tytuł, data wydania) z wymogiem posiadania przynajmniej jednej piosenki.
4. **Dodawanie piosenki** – Dodanie piosenki (tytuł, czas trwania, data wydania, język piosenki).
5. **Dodanie artysty z albumem i piosenką** – Możliwość dodania artysty razem z albumem oraz piosenką z domyślnymi wartościami.
6. **Usuwanie artysty** – Usunięcie artysty oraz jego piosenek i albumów. Jeśli w albumie znajduje się więcej niż jeden artysta, usuwany jest tylko konkretny artysta.
7. **Usuwanie piosenki** – Możliwość usunięcia piosenki bez usuwania albumu ani artysty, nawet gdy w albumie była tylko jedna piosenka.
8. **Edytowanie nazwy artysty** – Możliwość zmiany nazwy artysty.
9. **Przypisywanie artystów do albumów** – Artysta może być przypisany do kilku albumów, a album może mieć kilku artystów.
10. **Wyświetlanie wszystkich piosenek** – Możliwość przeglądania listy wszystkich piosenek.
11. **Wyświetlanie wszystkich artystów** – Możliwość przeglądania listy wszystkich artystów.
12. **Wyświetlanie albumów z artystami i piosenkami** – Możliwość przeglądania konkretnych albumów wraz z przypisanymi artystami i piosenkami.

### Zabezpieczenia:
13. **Przeglądanie publiczne** – Niezalogowani użytkownicy mogą przeglądać listę piosenek, albumów oraz artystów.
14. **Role użytkowników** – Aplikacja posiada dwie role: `ROLE_USER` i `ROLE_ADMIN`.
15. **Uwierzytelnianie i autoryzacja** – Aplikacja korzysta z tokena JWT, który użytkownicy otrzymują po zalogowaniu się.
16. **Logowanie przez Google (OAuth2)** – Użytkownicy mogą logować się za pomocą Google lub poprzez tradycyjne logowanie (login/hasło).
17. **Rejestracja użytkowników** – Nowi użytkownicy mogą rejestrować się w aplikacji, co zapisuje ich dane w bazie danych. Administrator jest tworzony automatycznie przy migracji bazy danych (Flyway).
18. **Uprawnienia użytkowników** – Zarejestrowani użytkownicy mogą przeglądać piosenki, ale tylko administratorzy mogą zarządzać treściami (dodawać, edytować, usuwać piosenki, albumy itp.).
19. **Szyfrowanie HTTPS** – Aplikacja obsługuje szyfrowane połączenia HTTPS z certyfikatem wygenerowanym przy pomocy OpenSSL.
20. **Obsługa CORS** – Obsługa zapytań CORS z domeny frontendowej.
21. **Zabezpieczenie CSRF** – Zabezpieczenie przed atakami Cross-Site Request Forgery (CSRF).

## Instalacja

### Wymagania:
- Java 17
- Maven
- Baza danych (PostgreSQL)
- OpenSSL (do generowania certyfikatu HTTPS)

### Krok po kroku:
1. Sklonuj repozytorium:
   ```bash
   git clone https://github.com/dskotniczny99/songify.git
2. Przejdź do katalogu projektu:
   ```
   cd songify
3. Skonfiguruj plik application.properties z ustawieniami bazy danych, uwierzytelniania Google OAuth2 oraz HTTPS.

4. Zainstaluj zależności i uruchom aplikację:
   ```
   mvn clean install
   mvn spring-boot:run
Aplikacja powinna być dostępna na https://localhost:8443.

# Użycie
## Konto administratora:
Domyślny administrator jest tworzony przy migracji bazy danych (Flyway).
Zaloguj się jako administrator, aby zarządzać piosenkami, albumami i artystami.
## Konto użytkownika:
Zarejestruj się lub zaloguj za pomocą konta Google, aby przeglądać piosenki i albumy.


# Testowanie
Aby uruchomić testy jednostkowe, użyj poniższego polecenia:
```
mvn test
```
# Licencja

Ten projekt jest objęty licencją MIT. Zobacz plik [LICENSE](./LICENSE) po więcej szczegółów.

# Contributing
Zapraszam do współpracy! Jeśli znalazłeś błąd lub masz pomysł na nową funkcjonalność stwórz pull request.
