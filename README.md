# resolveJbossValid
resolve jboss's valid and spingboot's valid conflict problem 


copy below text to your maven build:
	<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<configuration>
					<webResources>
						<resource>
							<directory>${project.basedir}/src/main/resources</directory>
							<targetPath>META-INF</targetPath> <!-- introduced in plugin v 2.1 -->
							<includes>
								<include>jboss-deployment-structure.xml</include>
							</includes>
						</resource>
					</webResources>
				</configuration>
			</plugin>
      
