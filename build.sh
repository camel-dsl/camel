#!/bin/bash
version=2015.9.1
mkdir -p target/plugins
rm target/plugins/*.jar
cp plugins/org.ow2.paasage.camel.dsl.ui_${version}.jar  target/plugins
cp plugins/org.ow2.paasage.camel_${version}.jar         target/plugins
cp plugins/org.ow2.paasage.camel.dsl_${version}.jar     target/plugins



