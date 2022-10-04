folder('project-a') {
    views {
        listView('unstable') {
            description('All unstable jobs for project A')
            filterBuildQueue()
            filterExecutors()
            jobs {
                name('auth')
            }
            jobFilters {
                status {
                    status(Status.UNSTABLE)
                }
            }
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
            }
        }
    }
}