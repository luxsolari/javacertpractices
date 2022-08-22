
Notes for Packages and imports:
* Single-type imports take precedence over on-demand type imports.
* Single-type imports will prevent creating a class with the same name as the imported type, in the file.
* To use classes with the same name but from different packages, use FQCN (fully qualified name).
* Not using import statements makes the class belong to the "unnamed" package (default package).
* Only one package name can be defined in a file.
* Package statement must be the first line of code excluding comments and whitespace.
* Import statements must come after package statements and must precede any other code, excluding comments.
* A class file does NOT have to reside in a directory structure that represents its package structure.
* Import statements are not necessary for anything inside java.lang package.
