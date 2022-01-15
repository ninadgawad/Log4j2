# Apache Log4j Security Vulnerabilities

### Date: December, 10th 2021 
## Issue: [CVE-2021-44228](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-44228)

Log4j2 Vulnerability “Log4Shell” this critical vulnerability, subsequently tracked as CVE-2021-44228 (aka “Log4Shell”), impacts all versions of Log4j2 from 2.0-beta9 to **2.17.0**
Non sanitized text passwed to logging layer like $(jndi:ldap://[host]:[port]/[path]) potentially allows an attacker to provide a string that is interpreted as a variable that, 
when expanded, results in the loading and invocation of a remote Java class file. Whether a particular service is exploitable depends on its specific usage of Log4j2.


## Mitigation 
### Log4j 1.x mitigation
Log4j 1.x is not impacted by this vulnerability.


### Log4j 2.x mitigation
- In releases >=2.10, this behavior can be mitigated by setting either the system property log4j2.formatMsgNoLookups or the environment variable LOG4J_FORMAT_MSG_NO_LOOKUPS to true
- For releases >=2.7 and <=2.14.1, all PatternLayout patterns can be modified to specify the message converter as %m{nolookups} instead of just %m
- For releases >=2.0-beta9 and <=2.10.0, the mitigation is to remove the JndiLookup class from the classpath: zip -q -d log4j-core-*.jar org/apache/logging/log4j/core/lookup/JndiLookup.class
- Upgrade to **2.17.1** or greater 


### Issue: Log4j2 JNDI attack



## Links
https://logging.apache.org/log4j/2.x/security.html



### Last Updated: December, 31st 2021
