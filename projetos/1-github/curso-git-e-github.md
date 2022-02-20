# Anotações - Curso Git e GitHub

## Introdução
**Instrutor:** [https://github.com/Perkles?tab=repositories](https://github.com/Perkles?tab=repositories)
* O Git foi criado em 2005, pelo Linus Torvalds;
* É um sistema de versionamento de código distribuído e seguro → versões confiáveis pela estrutura do git, possui múltiplas cópias ded si mesmo em diferentes lugares;

**Para que GitHub vai ser usado:**
1. Controle de Versão
2. Armazenamento em nuvem
3. Trabalho em equipe
4. Melhorar seu código
5. Reconhecimento

Git Bash - CLI (command line interface) - terminal
Git GUI - GUI (graphical user interface)

## Comandos úteis para utilizar no terminal
Tais comandos são válidos no sistema operacional _Windows_
`cd` - _change directory_ navegar para um diretório
`dir` - listar diretório atual
`mkdir`- _make directory_ criar uma pasta
`del` - deletar arquivvos
`rmdir` - _remove directory_ remover uma pasta
`cls` - _clear screen_ limpar terminal
`tab` - autocompletar
`echo` - printar uma frase
`>` - redirecionador de fluxo

## Princípios básicos do GIT
**SHA1 (Secure Hash Algorith):** Algoritmo de incriptação projetado pela NSA. A saída dos dados criptografados gera um hash identificador de 40 dígitos. → Git faz uso desse algoritmo para identificar os arquivos/e objetos internos de uma forma rápida e segura; → identificar as modificações que um dado arquivo teve;

### Objetos internos
**BLOB (bolha):** Objeto que guarda os arquivos. Esse objeto contém metadados dentro dele. 

**TREE (árvores):** armazena e aponta para objetos Blob e commits ou outras árvores. Também guarda o nome do arquivo. Responsável por montar a estrutura dos arquivos. Possuem um sha1 desse metadado. Encapsula comportamentos de diretórios.

**COMMIT:** Objeto que dá sentido a uma determinada alteração feita. O commit aponta para uma árvore, para um parente (commit anterior), para um autor, uma mensagem e um timestamp (data/horário da criação). O SHA1 desse commit é o hash de toda essa informação.

_Observe que ao alterar uma singela vírgula em um arquivo, alteramos por sua vez o BLOB, a TREE e por fim o COMMIT associado._

### Estados dos arquivos
**Tracked** - arquivos rastreados pelo Git

**unmodifed -** arquivo que ainda não foi modificado
**modified -** arquivo que já foi modificado
**staged -** arquivo que “ainda não entrou em cena”, que estão se preparando para fazer parte de um outro grupo

**Untracked** - arquivos não rastreados pelo Git

## Comandos no Git
`git init` - iniciar o Repositório Git em uma pasta;
`git add *` - adicionar arquivos
`git commit -m 'mensagem'` - criar commit
`git status` - obter status dods arquivos

A pasta **.git** é uma pasta oculta é responsável gerenciar os códigos e objetos internos do git.

## Do Git para o GitHub
`git remote add origin linkrepositoriogithub` - adicionar origin
`git push origin main` - empurrar versão do repositório local para origem remota (origin)
`git clone linkdorepositorio` - baixar repositório do GitHub para a máquina
`git pull origin main` - obter versão mais recente do repositório GitHub

## Conflitos
Conflito de merge, existe 2 alterações na mesma linha; → Resolução manual, o usuárioo deve especificar qual é a versão correta.

