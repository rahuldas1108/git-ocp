package com.example.demoocp.gitocp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class OcpController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to  openshift";
	}
	
	@GetMapping("/docs")
	public String document()
	{
		return "Openshift leverages Kubernetes underneath as the primary infrastructure component.\r\n" + 
				"We learned that on Kubernetes you can deploy applications in the form of containers such as Docker\r\n" + 
				"containers. Containers are created from images of applications.\r\n" + 
				"You may configure Openshift to pull these images from a public Docker repository or registry like\r\n" + 
				"Docker Hub as we saw in the Docker basics lecture.\r\n" + 
				"In Openshift, the application code is built into Docker images and pushed to the built-in container registry.\r\n" + 
				"At the heart of Openshift lies the ETCD Key value store that stores information about various components.\r\n" + 
				"There are three ways to interact with the Openshift Cluster- web console, command line interface using the Openshift client tool, REST API.\r\n" + 
				"The Web console also lets us create and manage projects, manage builds, deployments, services and routes and configure CI/CD pipelines. Projects help us group and isolate applications.\r\n" + 
				"https://docs.okd.io/latest/getting_started/developers_console.html\r\n" + 
				"for java:- $ oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/jboss-openshift/openshift-quickstarts --context-dir=undertow-servlet\r\n" + 
				"https://docs.okd.io/latest/getting_started/developers_cli.html\r\n" + 
				"oc login\r\n" + 
				"oc logout\r\n" + 
				"REST API:-\r\n" + 
				"Curl https://localhost:8443/oapi/v1/users -H “Authorization: Bearer <Token>”\r\n" + 
				"To get this Token in oc tool :- oc whoami -t\r\n" + 
				"OpenShift _ Web Console: -\r\n" + 
				"Creating a Project\r\n" + 
				"1.	Visit the OKD (OpenShift Community Distribution) web console in your browser. Different for different environments (RND, QA, UAT, PROD).\r\n" + 
				"2.	Log in using the username and password.\r\n" + 
				"3.	To create a new project, click New Project.\r\n" + 
				"4.	Type a unique name, display name, and description for the new project.\r\n" + 
				"5.	Click Create.\r\n" + 
				"The web console’s welcome screen loads.\r\n" + 
				"Creating an Application\r\n" + 
				"This can be created from Docker image or Git Repository URL\r\n" + 
				"1.	After clicking Create.\r\n" + 
				"2.	Click Browse, then select Java from the drop-down list.\r\n" + 
				"3.	Click the OpenJDK8 builder image.\r\n" + 
				"4.	Type a name for your application, and specify the Git Repository URL.\r\n" + 
				"5.	Optionally, click Show advanced routing, build, and deployment options.\r\n" + 
				"6.	Click Create.\r\n" + 
				"7.	After creation, some of these settings can be modified from the web console by clicking Browse, Builds, select your build, then click Actions, and either Edit or Edit YAML.\r\n" + 
				"";
	}
	

}
