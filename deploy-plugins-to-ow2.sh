#!/bin/bash

cd plugins
function deploy_file()
{
$DRY mvn deploy:deploy-file -DcreateChecksum=true \
     -DgroupId=$groupId \
     -DartifactId=$artifactId \
     -Dversion=$version \
     -Durl=http://repository.ow2.org/nexus/content/repositories/snapshots \
     -DrepositoryId=deployment \
     -Dfile=$file_name
}

groupId=org.ow2.paasage.camel
version=2015.9.1-SNAPSHOT
artifactId=dsl
file_name=org.ow2.paasage.camel.dsl_2015.9.1.jar
deploy_file
groupId=org.ow2.paasage.camel
version=2015.9.1-SNAPSHOT
artifactId=ui
file_name=org.ow2.paasage.camel.dsl.ui_2015.9.1.jar
deploy_file
