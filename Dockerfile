FROM airhacks/wildfly
MAINTAINER Adam Bien, adam-bien.com
COPY sports/target/sports.war ${DEPLOYMENT_DIR}