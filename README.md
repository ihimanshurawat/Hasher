# Hasher
A Simple, Light Weight and Easy to Use Hashing Library.
You can Easily Hash using MD5, SHA-1, SHA-256, SHA-384, or SHA-512 with ease.
! This Library is Written in Kotlin !

# How to Use
In Java
```
//Call hash() method using the object
Hasher.hash(value,HashType);
```
Example
``` 
Hasher.Companion.hash("Hello",HashType.SHA_1);

```
It will return a SHA-1 Encoded String 

In Kotlin


```
Hasher.hash(value,HashType.SHA_512)
```

# Download
At Root build.gradle
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
At the Project build.gradle
```
implementation 'com.github.1AboveAll:Hasher:1.2'
```
  
  
