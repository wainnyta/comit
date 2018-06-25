## Online Java Editor
https://www.tutorialspoint.com/compile_java_online.php

## IntelliJ - download click below
https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC


## How to install JAVA on Windows

**Watch video:**

https://www.youtube.com/watch?v=Wp6uS7CmivE


**1. Download Java JDK here (version 8.0 or higher)** 

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

**2. Add JAVA_HOME**

Search for "Edit Environment Variable". Click on the result link, Click "Environment Variables..." 

Under "User Variables for Programming Knowledge"

If you don't have JAVA_HOME set yet: 

Click Add:

Variable name: JAVA_HOME

Variable value: Your link to installed jdk (EX: `C:\Program Files\Java\jdk1.8.0` (NOTE: DO NOT COPY THIS)

**3. Add to Path variable**

Under System Variables:
Find "Path"; double click on the value; and add the `jdk\bin` folder and `jre\bin` folder to Path; seperated by ;
EX: `;C:\Program Files\Java\jdk\bin;C:\Program Files\Java\jre\bin`

**4. Verify you have JAVA installed properly**

Open up Command Prompt, and type:
```java
java -version
```
You should see some information coming up

Then type this to verify javac (JAVA Compiler) has been installed properly:
```java
javac -version
```

## How to install JAVA on MacOS
1. Install homebrew https://brew.sh/
- Open up Terminal
- Copy and Paste and Enter:
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

2. After that, install java by typing into terminal:
```
brew install java
```
