## SAP Demo

A simple client for the SAP Purchase Order api

## To use

Build the `api` project

## Demo application

See `main` class in demo project. Make sure you provide a working API key. Sample output:
```
/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=51029:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/lib/tools.jar:/Users/utsavsethi/workspace/SAPdemo/demo/out/production/classes:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-web/1.5.10.RELEASE/8bc445f3ee81e5322e46b28cbb33bca1800b69d9/spring-boot-starter-web-1.5.10.RELEASE.jar:/Users/utsavsethi/workspace/SAPdemo/api/out/production/classes:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/1.5.10.RELEASE/d935ac98f84c1d97d7ccd702d21abdc236fa7aa0/spring-boot-starter-1.5.10.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-tomcat/1.5.10.RELEASE/11e474e265f1c68fc435dddbac42ab3574b5e4b6/spring-boot-starter-tomcat-1.5.10.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.hibernate/hibernate-validator/5.3.6.Final/4c730be8bf55a8e9a61e79a2f2c079abf48b718/hibernate-validator-5.3.6.Final.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-databind/2.8.10/f7b83cb2bc4b88d53961e749e1ad32f49ef017b7/jackson-databind-2.8.10.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/4.3.14.RELEASE/1571eab8a807005d424ca16fedd54b1f439787b2/spring-webmvc-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-web/4.3.14.RELEASE/a0c3bf3ad661db185675bd5af350f35ed11f0903/spring-web-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/1.5.10.RELEASE/be96efab0d35181f18c486b0ec8d6a41a7042fce/spring-boot-autoconfigure-1.5.10.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/1.5.10.RELEASE/594b3efa04829f62754a19f59f81ba204636167a/spring-boot-1.5.10.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/1.5.10.RELEASE/62c73688208b3173645d6701fc3eb95ca657e6c8/spring-boot-starter-logging-1.5.10.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/4.3.14.RELEASE/e50a712960926c30e537ef4a633f5d9dd5a8b155/spring-context-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/4.3.14.RELEASE/dfe55b0592aead8e3eb0e6a4e98db433b9e09bd7/spring-aop-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/4.3.14.RELEASE/7bcd17a68dd64e9447d7bff2c42ba7417678596e/spring-beans-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/4.3.14.RELEASE/58477b44debcb49b09e962e3047ee74c2c033e89/spring-expression-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/4.3.14.RELEASE/c70ddb6204457a802d1f6882d65bca3e5b3c41df/spring-core-4.3.14.RELEASE.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/1.17/7a27ea250c5130b2922b86dea63cbb1cc10a660c/snakeyaml-1.17.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-websocket/8.5.27/3cba1c5187a17b0233de5712024d6e144036ba9a/tomcat-embed-websocket-8.5.27.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-core/8.5.27/a10612f0af27c7bfcc4e8d88393adad1fc5b4ece/tomcat-embed-core-8.5.27.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-el/8.5.27/5a591bcf5c930d2b37bb40c0f95180604a3b1a57/tomcat-embed-el-8.5.27.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/javax.validation/validation-api/1.1.0.Final/8613ae82954779d518631e05daa73a6a954817d5/validation-api-1.1.0.Final.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.jboss.logging/jboss-logging/3.3.1.Final/c46217ab74b532568c0ed31dc599db3048bd1b67/jboss-logging-3.3.1.Final.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/com.fasterxml/classmate/1.3.4/3d5f48f10bbe4eb7bd862f10c0583be2e0053c6/classmate-1.3.4.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-annotations/2.8.0/45b426f7796b741035581a176744d91090e2e6fb/jackson-annotations-2.8.0.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-core/2.8.10/eb21a035c66ad307e66ec8fce37f5d50fd62d039/jackson-core-2.8.10.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.1.11/ccedfbacef4a6515d2983e3f89ed753d5d4fb665/logback-classic-1.1.11.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.slf4j/jcl-over-slf4j/1.7.25/f8c32b13ff142a513eeb5b6330b1588dcb2c0461/jcl-over-slf4j-1.7.25.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/1.7.25/af5364cd6679bfffb114f0dec8a157aaa283b76/jul-to-slf4j-1.7.25.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.slf4j/log4j-over-slf4j/1.7.25/a87bb47468f47ee7aabbd54f93e133d4215769c3/log4j-over-slf4j-1.7.25.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.apache.tomcat/tomcat-annotations-api/8.5.27/122c0a4acaba72bf4590e83c9fbcb3475c46edc5/tomcat-annotations-api-8.5.27.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.1.11/88b8df40340eed549fb07e2613879bf6b006704d/logback-core-1.1.11.jar:/Users/utsavsethi/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.25/da76ca59f6a57ee3102f8f9bd9cee742973efa8a/slf4j-api-1.7.25.jar demo.Main
objc[85727]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/bin/java (0x10d75e4c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_92.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10d7e24e0). One of the two will be used. Which one is undefined.
15:50:43.666 [main] DEBUG org.springframework.web.client.RestTemplate - Created GET request for "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder('4500000001')"
15:50:43.740 [main] DEBUG org.springframework.web.client.RestTemplate - Setting request Accept header to [application/json, application/*+json]
15:50:43.741 [main] DEBUG org.springframework.web.client.RestTemplate - Writing [parameters] using [org.springframework.http.converter.StringHttpMessageConverter@17baae6e]
15:50:45.128 [main] DEBUG org.springframework.web.client.RestTemplate - GET request for "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder('4500000001')" resulted in 200 (OK)
15:50:45.129 [main] DEBUG org.springframework.web.client.RestTemplate - Reading [class purchaseorder.entity.PurchaseOrder] as "application/json;charset=utf-8" using [org.springframework.http.converter.json.MappingJackson2HttpMessageConverter@402bba4f]
PurchaseOrder{d='d{purchaseOrder='4500000001'companyCode='1710', purchaseOrderType=NB}'}

Process finished with exit code 0
```