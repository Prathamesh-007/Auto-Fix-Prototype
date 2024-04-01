# Auto-Fix-Prototype

<ul>
  <li>When Checkstyle scans the file to create violations, the line numbers are given.</li>
  <li>These violations are only errors in conventions such as spacing, javadoc, indentation, etc.</li>
  <li>Here I have created a basic file handling program. By taking the line numbers from violation messages, we can edit the contents of that line.</li>
  <li>Each violation auto-fix file will have a different "newContent" value according to the violation type.</li>
  <li>Please refer to the below figures that show indentation errors and are fixed by the code.</li>
</ul>

**Java file before running the code:**

<img width="359" alt="Java File before" src="https://github.com/Prathamesh-007/Auto-Fix-Prototype/assets/77877305/bb77def7-27c3-4382-a59a-cef61a0f5f31">

As we can clearly see, line 6 has indentation problem

---



**After running the code:**

<img width="338" alt="Java file after" src="https://github.com/Prathamesh-007/Auto-Fix-Prototype/assets/77877305/9eedd300-ddaf-4ccf-9191-e3a6e5e544bf">
<br>

---

This is a basic prototype that will give an idea for how to fix the files.
