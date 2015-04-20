# Installlation steps:
1. Go to the Red Hat Customer Portal (http://access.redhat.com) and log in.
2. Select Downloads > Red Hat JBoss Middleware > Download Software.
3. From the Product dropdown menu, select BPM Suite.
4. From the Version dropdown menu, select 6.0.3 (or newer)
5. Install Red Hat JBoss BPMS:
5.1 run the jar file
	java -jar jboss-bpms-installer-6.0.3.GA-redhat-1.jar
5.2 Select a folder where no JBoss EAP installation exists and EAP 6.1.1 will be installed.
5.3 Create one user for admin role
5.4 Create one user for application role
5.5 Uncheck "Enable the Java security manager"
5.6 Type passwords for Server keystore password and Client keystore password to configure JMS SSL Package
5.7 Uncheck Enable pure IPV6 configuration.
5.8 Choose the Perform default configuration.
5.9 Configure password vault.
6. Install Drools plugins to Redhat JBDS
6.1 Install Redhat JBDS
	java -jar jbdevstudio-product-universal-7.1.1.GA-v20140314-2145-B688.jar
6.2 Down Drools plugins via https://devstudio.jboss.com/updates/7.0.0/jbdevstudio-integration-stack-updatesite-7.0.3.GA.zip
6.3 Start Red Hat JBDS
	Help->Install New software -> Add 
		Input the location of the jbdevstudio-integration-stack-updatesite-7.0.3.GA.zip
6.4 Restart Red Hat JBDS
6.5 Configure Drool Engine in Red Hat JBDS
	Window -> Preference -> Drools -> Installed Drools Runtime -> Add
		Input the localation of BPMS Engine
	Apply


Quick Starts:
1. Start BPMS Workbench:
	<BPMS_HOME>/jboss-eap-6.1/bin/standalone.sh
2. Login to BPMS Workbench(localhost:8080/business-central):
	Application User Credential
3. Create a Organization Unit
	Authoring -> Administration -> Organization Units -> Manage Organization Units -> Add -> Name(any) + Owner(any)
4. Create a Repository
	Authoring -> Administration -> Repositories -> New Repository -> Name(any) + the organization unit created just now
5. Create a Project
	Authoring -> Project Editor
		Select the repo just created 
		New Item -> Prject
			Project name
				Group ID + Artifact ID + Version ID
		New Item -> Package
			Package name
		Create a Java POJO bean
			Tools -> Data Modeler
				Identifier -> Java Class Name
				Package -> The package just created
				Create new field
					body  + String
			Save
		
		Creat a Rule
		New Item -> Guided Rule
			Rule Name
		Configure LHS
			Click the plus icon in the same row where "WHEN" is.
			Choose Message
			Variable name -> m
			Set

			Click "This is a Message with"
				Add a restriction on a field -> body
				Choose is not null
		Configure RHS
			Click the plus icon in the same row where "THNE" is.
			Choose Add free form DRL
				System.out.println("Hello"+ m.body);
				m.length=m.body.length
			OK
		Save

		Create a Test Scenario
			Resource name
			GIVEN
				Insert a new fact -> Message
				Fact name -> m
			Add
			
			Add a field
				Choose a a field to add -> body
			Click the pencil icon
				Click button "Literal value "
					Input World
			EXPECT
			Fact value "m" , Click botton "Add"
			Click the green arrow icon
				Choose length 
					Input 5
			
		Run scenario
			Check the Reporting status 
			Check the console log 


			

		



	
