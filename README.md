# Installlation steps:
- Go to the Download page (https://access.redhat.com/jbossnetwork/restricted/listSoftware.html?product=brms&downloadType=distributions) and log in.
- Download Red Hat JBoss BRMS 6.2.0 Deployable for EAP 6
- Download Red Hat JBoss BRMS 6.2.0 Core Engine
- Download Red Hat JBoss BRMS 6.2.0 Supplementary Tools
- Download Red Hat JBoss EAP 4 (https://access.redhat.com/jbossnetwork/restricted/listSoftware.html?downloadType=distributions&product=appplatform&version=6.4)
- Install Drools plugins to Redhat JBDS
    - Install Redhat JBDS
    > java -jar jbdevstudio-product-universal-7.1.1.GA-v20140314-2145-B688.jar
    - Down Drools plugins via https://devstudio.jboss.com/updates/7.0.0/jbdevstudio-integration-stack-updatesite-7.0.3.GA.zip
    - Start Red Hat JBDS
    - Help->Install New software -> Add 
        - Input the location of the jbdevstudio-integration-stack-updatesite-7.0.3.GA.zip
    - Restart Red Hat JBDS
    - Configure Drool Engine in Red Hat JBDS
        - Window -> Preference -> Drools -> Installed Drools Runtime -> Add
        - Input the localation of BPMS Engine
    - Apply
- Install BRMS
    - put the jboss-eap-6.4.0.zip and jboss-brms-6.2.0.GA-deployable-eap6.x.zip in the same directory.
    - unzip jboss-eap-6.4.0.zip
    - unzip jboss-brms-6.2.0.GA-deployable-eap6.x.zip 
       


# Quick Starts:
- Start BPMS Workbench:
    - \<BPMS_HOME\>/jboss-eap-6.4/bin/standalone.sh
- Login to BPMS Workbench(localhost:8080/business-central):
    - Application User Credential
- Create a Organization Unit
    - Authoring -> Administration -> Organization Units -> Manage Organization Units -> Add -> Name(any) + Owner(any)
- Create a Repository
    - Authoring -> Administration -> Repositories -> New Repository -> Name(any) + the organization unit created just now
- Create a Project
    - Authoring -> Project Editor
        - Select the repo just created 
	- New Item -> Prject
	    - Project name
	    - Group ID + Artifact ID + Version ID
	- New Item -> Package
	    - Package name
	    - Create a Java POJO bean
	- Tools -> Data Modeler
	    - Identifier -> Java Class Name
	    - Package -> The package just created
	    - Create new field
	        - body  + String
	    - Save
    - Creat a Rule
        - New Item -> Guided Rule
	- Rule Name
	- Configure LHS
	    - Click the plus icon in the same row where "WHEN" is.
	    - Choose Message
	        - Variable name -> m
	        - Set
	    - Click "This is a Message with"
	        - Add a restriction on a field -> body
                - Choose is not null
	- Configure RHS
	    - Click the plus icon in the same row where "THNE" is.
	        - Choose Add free form DRL
		- System.out.println("Hello"+ m.body);
		- m.length=m.body.length
		- OK
    - Save
    - Create a Test Scenario
        - Resource name
	    - GIVEN
	        - Insert a new fact -> Message
	        - Fact name -> m
	        - Add
	        - Add a field
	        - Choose a a field to add -> body
	        - Click the pencil icon
	        - Click button "Literal value "
	        - Input World
	    - EXPECT
	        - Fact value "m" , Click botton "Add"
	        - Click the green arrow icon
	        - Choose length 
	        - Input 5
	    - Run scenario
	        - Check the Reporting status 
	        - Check the console log 
