# Базовая работа с локальным репозиторием

Здесь все на английском, потому что мне так захотелось:)
Это копия моей предыдущей домашки, где я отвечал как раз на такой же вопрос:)

## A short overview of working with Git 

### Setting up a repository
To create a repository input _git init_ into the terminal while in the repository folder (this will create a hidden _.git_ folder in the repository).

### Creating commits

#### Adding files
The _git add_ command is used to add a file or any modifications to a commit.

Example:
> git add \<file name\>

#### Viewing repository status
To check the repository's status input the _git status_ command. This will show information on any changes made to the files in the repository or any untracked files.

#### Creating a commit
To create a commit execute the _git commit_ command.

Example:
> git commit -m "\<comment for the commit\>"

* The _-m_ stands for _message_ and writing the message is __mandatory__ when making a commit.
* Additionally, all files to be commited __must__ be added beforehand. To speed up the process, you can combine adding the modifications and making commits by writing _a_ within _-m_ in the following way:
    > git commit -**a**m "\<comment for the commit\>"

### Moving between saves
To switch between commits use _git checkout_.

It is used while in the repository folder as follows:
> git checkout \<commit number\>

Do note that the commit number doesn't have to be inputted entirely, the first four characters are enough.

### Changelog
To view all modifications made in the repository execute _git log_ within the repository folder. This is also where you can find the commit numbers.

### Git branches

#### Creating a branch
To create a branch use the _git branch_ command in the repository as follows:
> git branch \<branch name\>

Also, simply inputting _git branch_ will show all available branches and highlight the branch currently in use.

To switch between branches the _git checkout_ command is used in the same manner as with swiching between commits:
> git checkout \<branch name\>

#### Merging branches
To merge a branch into the current branch input _git merge_ in the following way:
> git merge \<branch name\>

In this example the branch **\<branch name\>** will be merged **into** the **current branch**.

#### Deleting branches
To delete a branch input the following:
> git branch -d \<branch name\>