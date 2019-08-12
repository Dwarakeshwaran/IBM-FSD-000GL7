const users = require('./data/users').users;
const projects = require('./data/projects').projects;
class UserFetch{
    constructor(){
        this.users = users;
    }

    fetchfdata(){
        return this.users;
    }
}

class ProjectFetch{
    constructor(){
        this.projects = projects;
    }

    fetchdata(){
        return this.projects;
    }
}
//const obj = new UserFetch();

module.exports.UserFetch = UserFetch;
module.exports.ProjectFetch = ProjectFetch;