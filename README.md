Pet Clinic

Pour l'installation en local des jars

mvn install:install-file -Dfile=generic-commons-tools.jar -DgroupId=net.entetrs.commons \
    -DartifactId=generic-common-tools -Dversion=1.0 -Dpackaging=jar

mvn install:install-file -Dfile=jsf-commons-tools.jar -DgroupId=net.entetrs.commons \
    -DartifactId=jsf-common-tools -Dversion=1.0 -Dpackaging=jar

mvn install:install-file -Dfile=jpa-commons-tools.jar -DgroupId=net.entetrs.commons \
    -DartifactId=jpa-common-tools -Dversion=1.0 -Dpackaging=jar

