# This Repository contains all the java-selenium practicals
## This repository has two main folders
<hr>
<p> This repository has two main folders <b>SeleniumOne</b> and <b>SeleniumTest_firefox</b> </p>
<hr>
<p> <b>SeleniumOne</b> folder contains all the selenium practicals using google chrome </p>
<p> <b>SeleniumTest_firefox</b> folder contains all the selenium practicals using firefox Browser </p>
<hr>

<br>

## Steps to execute the <u> SeleniumTest_firefox</u> code
<ol>
  <li>Download the selenium drivers zip file for JAVA from <a href="https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.24.0/selenium-java-4.24.0.zip">here</a> and extract the contenet of the zip file and save it somewhere where you remeber the locaion of it</li>
  <li>Download the FireFox Driver from internet. This link will route you to a page that contiains <code>geckodriver-v0.35.0-win64.zip</code> file which is official for Firefox 64 bit, and this file is not available on the official github page of gecko driver Click the link and download from the website <a href="https://sourceforge.net/projects/geckodriver.mirror/files/v0.35.0/geckodriver-v0.35.0-win64.zip/download">link</a></li>
  <li>Once the download is completed extract it and save the driver somewhere where you remeber the locaion of it</li>
  <li>Create a Java Project in Exclipse, the Eclipse used here is "Eclipse IDE for Java Developers Version: 2022-09 (4.25.0)"./ Or else you can use the project itself from this github repo and ignore the next steps</li>
  <li>Right-click on your project in the Package Explorer and select Build Path > Configure Build Path.</li>
  <li>Click on the Libraries tab. And Inside the libraries click on the "Classpath", then shify your focus on right hand side</li>
  <li>Click Add External JARs and navigate to the folder where you extracted the Selenium files and select all the files. Once done Click on "Apply and Close". <b>NOTE:</b> Ensure that the JAR files are added under the <b>Classpath section</b>, not the Modulepath</li>
  <li>If there is <b>module.java</b> file delete it immediately</li>
  <li>Right Click on the src and create a package name 'seleniumtest_firefox;' once done right click and create class as per your choice and write the seleniun java code</li>
</ol>