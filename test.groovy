job('job2') {
  
       		 
    scm {
     
        git {
            remote {
                url "https://github.com/bbharat3/jenkins-kube.git"
                branch "master"
                credentials "866ee459-649e-49d0-b5eb-2a3f3b419d94"
            }
        	
        }
    }
    triggers {
        scm '* * * * *'
    }
    steps {     
    shell('''
        echo "welcome jenkins"
        ''')   
  } 
  
}
