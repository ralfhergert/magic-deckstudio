Magic Deckstudio is a Java application for testing Magic the Gathering decks against each other.

## How to build?
Magic Deckstudio uses [gradle] for building. To compile and assemble the executable jar file execute:
```sh
cd magic-deckstudio
gradle clean jar
```
the executable jar file can be found is placed in:
```sh
magic-deckstudio/build/libs/
```

## How to set up a development environment?
Depending on whether you use IntelliJ IDEA or Eclipse, [gradle] can create the project files for you:
* for IntelliJ IDEA
```sh
cd magic-deckstudio
gradle idea
```

* for Eclipse
```sh
cd magic-deckstudio
gradle eclipse
```

---
[gradle]:http://www.gradle.org - An open source building tool, much like maven, but quite more flexible.