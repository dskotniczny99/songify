SONGIFY: APLIKACJA DO ZARZĄDZANIA ALBUMAMI, ARTYSTAMI I PIOSENKAMI

~~1. można dodać artystę (nazwa artysty)~~
~~2. można dodać gatunek muzyczny (nazwa gatunku)~~
~~3. można dodać album (tytuł, data wydania, ale musi być w nim przynajmniej jedna piosenka)~~
~~4. można dodać piosenkę (tytuł, czas trwania, data wydania, jezyk piosenki)~~
~~5. mozna dodać artyste od razu z albumem i z piosenką (domyslne wartosci)~~
~~6. można usunąć artystę (usuwamy wtedy jego piosenki oraz albumy, ale jesli było więcej niż jeden artysta w albumie, to usuwamy tylko artystę z albumu i samego artystę)~~
~~7. można usunąć piosenkę, ale nie usuwamy albumu i artystów gdy była tylko 1 piosenka w albumie~~
~~8. można edytować nazwę artysty~~
~~9. można przypisać artystów do albumów (album może mieć więcej artystów, artysta może mieć kilka albumów)~~
~~10. można wyświetlać wszystkie piosenki~~
~~11 można wyświetlać wszystkich artystów~~
~~12. można wyświetlać konkrete albumy z artystami oraz piosenkami w albumie~~
**. SECURITY:**
~~13. Kazdy bez uwierzytelnienia (authentication) moze przegladac piosenki, albumy itp (gosc niezalogowany)~~~~
~~14. Są 2 role: ROLE_USER i ROLE_ADMIN~~
~~15. Uzywanie bezstanowego tokena JWT (uzyskuje go po zalogowaniu) - wlasna implementacja authorization~~
** Oauth2 google logowanie i token jwt
~~16. zeby zostac uzytkownikiem trzeba sie zarejestrowac login/haslo - wlasna implementacja i GOOGLE~~
~~17. zapisujemy uzytkownika i admina do bazy danych (w przypadku wlasnej implementacji) - admin tworzony w migracji flyway~~
~~18. uzytkownik moze wyswietlac piosenki, ale nie moze nimi zarzadzac~~
~~19. tylko admin moze zmieniac stan aplikacji (usuwac, dodawac, edytowac piosenki/albumy itp)~~
~~20. chcemy miec szyfrowanie HTTPS, certyfikat wygenerowany recznie openssl~~
~~21. chcemy miec obsługe CORS - zapytania z domeny frontendowej~~
~~22. chcemy zabezpiecznie CSRF~~ 


