pipelineJob('gcloud') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('git@github.com:dutn158/configuration-as-code-jenkins-k8s-pipeline.git')
              credentials('jenkins-github-ssh')
            }
          }
        }
        scriptPath("gcloud/Jenkinsfile")
    }
  }
}
