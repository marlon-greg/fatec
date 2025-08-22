# Repositório de Estudos - FATEC

> Um repositório central para todos os meus projetos, exercícios e anotações desenvolvidos durante o curso de Análise e Desenvolvimento de Sistemas na FATEC.

![GitHub last commit](https://img.shields.io/github/last-commit/marlon-greg/fatec?style=for-the-badge&logo=github&label=Último%20Commit)
![GitHub repo size](https://img.shields.io/github/repo-size/marlon-greg/fatec?style=for-the-badge&logo=github&label=Tamanho%20do%20Repositório)

## 🚀 Sobre o Repositório

Olá! Meu nome é Marlon Greg e este é o meu espaço para organizar e documentar meu progresso acadêmico. O objetivo deste repositório é centralizar todos os materiais práticos, desde pequenos exercícios até projetos maiores, de cada disciplina cursada na FATEC.

Isso não só serve como um backup seguro do meu trabalho, mas também como um portfólio dinâmico que demonstra minhas habilidades e aprendizados ao longo do curso.

## 📁 Estrutura de Pastas

O repositório está organizado em diretórios, cada um representando uma disciplina específica. A estrutura principal é a seguinte:

* **/banco_de_dados_nr**: Exercícios e projetos da disciplina de Bancos de Dados Não Relacionais (explorando tecnologias como MongoDB).
* **/programacao_mobile**: Projetos e exercícios focados no desenvolvimento de aplicações para dispositivos móveis com ReactNative
* **/programcao_orientada_objeto**: Teoria e desenvolvimento de orientação ao objeto com JAVA

Cada pasta de disciplina pode conter subpastas para aulas, trabalhos ou projetos específicos, mantendo tudo bem organizado.

## 🛠️ Tecnologias e Ferramentas

As tecnologias utilizadas neste repositório variam de acordo com a disciplina, mas as principais incluem:

* **Linguagens:** Python, JavaScript, Java, SQL, TypeScript
* **Bancos de Dados:** MongoDB, MySQL, PostgreSQL
* **Ferramentas:** Git, VS Code, Docker
* **Outros:** HTML5, CSS3

## 🗂️ Projetos e Como Executar

Cada pasta de matéria neste repositório contém projetos independentes. Abaixo estão as instruções detalhadas para configurar e executar os principais projetos de cada disciplina.

---

### 📂 `banco_de_dados_nr`

Esta disciplina foca em bancos de dados não relacionais, com projetos práticos utilizando Python.

#### 🐍 Projeto: Scripts de Manipulação com MongoDB
* **Descrição:** Conjunto de scripts em Python para conectar, inserir e consultar dados em um banco MongoDB.
* **Localização:** `/banco_de_dados_nr/exercicios_aulas/`
* **Tecnologias:** `Python`, `PyMongo`

* **Passos para Execução:**
    1.  Navegue até o diretório do projeto:
        ```bash
        cd banco_de_dados_nr/exercicios_aulas
        ```
    2.  Crie e ative um ambiente virtual:
        ```bash
        # Criar o .venv
        python -m venv .venv
        
        # Ativar no Windows
        .\.venv\Scripts\activate

        # Ativar no Linux/macOS
        source .venv/bin/activate
        ```
    3.  Instale as dependências listadas no `requirements.txt`:
        ```bash
        pip install -r requirements.txt
        ```
    4.  Execute o script desejado (ex: `conexao_mongo.py`):
        ```bash
        python conexao_mongo.py
        ```

---

### 📂 `programacao_mobile`

Projetos focados no desenvolvimento de aplicações para dispositivos móveis.

#### 📱 Projeto: App de Lista de Tarefas (Exemplo)
* **Descrição:** Um aplicativo simples para gerenciamento de tarefas, desenvolvido com React Native.
* **Localização:** `/programacao_mobile/app-lista-tarefas/`
* **Tecnologias:** `JavaScript`, `React Native`, `Node.js`

* **Passos para Execução:**
    1.  Certifique-se de ter o ambiente React Native configurado (Node.js, Watchman, Android Studio/Xcode).
    2.  Navegue até o diretório do projeto:
        ```bash
        cd programacao_mobile/app-lista-tarefas
        ```
    3.  Instale todas as dependências do projeto:
        ```bash
        npm install
        ```
    4.  Inicie o aplicativo em um emulador ou dispositivo físico:
        ```bash
        # Para Android
        npm run android

        # Para iOS
        npm run ios
        ```
---

> **Dica de Organização:** Para projetos mais complexos, é uma ótima prática criar um `README.md` específico **dentro da pasta de cada projeto**, detalhando ainda mais suas funcionalidades e configurações.

## 👨‍💻 Autor

Feito com ❤️ por Marlon Greg.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/SEU-LINK-DO-LINKEDIN/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/marlon-greg)

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---
_Este README foi atualizado em: 21 de agosto de 2025._

````
