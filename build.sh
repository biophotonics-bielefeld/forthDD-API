javac com/forthdd/commlib/*/*.java
jar -cvf forthDD-API-$(git rev-parse HEAD | head -c 10).jar com/forthdd/commlib/*/*.class
