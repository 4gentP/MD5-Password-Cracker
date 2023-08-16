#  Password Security Simulation: Cracking Hashes and Unveiling Weaknesses

### Description:
In this project, we immerse ourselves in the world of cybersecurity, simulating an offline dictionary attack to retrieve passwords from shadow password files. The project consists of three parts, each representing distinct phases of the attack and requiring the development of Java programs.

### Part 1: Simple Password Attack
We start with a simplified shadow password file, "shadow-simple," and a list of common passwords, "common-passwords.txt." Using a dictionary attack, the Java program "SimpleCracker.java" identifies common passwords and outputs "username:password."

### Part 2: Linux-style Shadow Attack
Using the real Linux-style "shadow" file and common passwords, the Java program "Cracker.java" employs a dictionary attack to decrypt shadow-style hashes, revealing username-password pairs.

### Part 3: Uncommon Common Password
Discover an uncommon common password absent from the list by searching for common word files. Add the password to "common-passwords.txt" and modify "Cracker.java" to detect it in the shadow file.

This project offers hands-on experience in understanding password hashes, executing dictionary attacks, and assessing security vulnerabilities. It showcases ethical hacking skills and reinforces the importance of robust password management.
