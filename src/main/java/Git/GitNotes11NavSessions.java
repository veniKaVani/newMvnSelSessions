package Git;

public class GitNotes11NavSessions {
	
	/*
	 * GIT: used for code management purpose, to show case the work, to share the code
	 *      with somebody else--not possible to send the zip file all the time, send
	 *      screen shots etc..
	 *      to share the entire frame work to some one-can just share the url and that's it
	 *      
	 *      it is an acquired tool by Microsoft
	 *      
	 *  how to do this??
	 *  create an acct on GitHub by signing up
	 *  Once acct setup-login and start using it
	 *  U will see the Dashboard page -- where u can see all ur repositories
	 *  can create ur own profile as well
	 *  ----in the profile
	 *  can see ur repositories, ur contributions-in which month what u had done etc...
	 *  your achievement, ur followers,
	 *  
	 *  to chk if git is really available on ur system---on git bash write
	 *  git --version
	 *  chk 3 components:1.source code-written on work-space/ide/working directory,
	 *  2.remote repo/GitHub repo/--where in the code will be pushed into from local=>PUSHING,
	 *  
	 *  taking the code from remote-local=>reverse is PULLING
	 *  when pushing--there are 2 major things: part1-staging/indexing area
	 *  A snapshot of code is taken and given to the staging area
	 *                                          part2-local repository area
	 *  in the LOCAL--multiple branches are available=>master branch, feature branch
	 *  
	 *  Once the code is available in the local--then we have to push the code onto github
	 *  /remote--where a repo or master/main branch is available
	 *  
	 *  at the local site -- how many components do you see?? THREE
	 *  1.work-space
	 *  2.staging/indexing
	 *  3.local repo
	 *  
	 *  at the remote site--only one component=>repository with the branches
	 *  
	 *  steps to do TO MOVE THE CODE ON TO GITHUB
	 *  1.u need to initialize the project with Git-how the prj will know u have to use Git?
	 *  ------------
	 *  install git
	 *  git init                ======>project is registered with git=>noticed by git
	 *                                 and a .git which is a hidden file gets created
	 *                                 (main) on cmd => a branch already created on local
	 *  git remote add origin <remote URL> ====>there might be 10 repos on remote side to know
     *                            the particular repo where the code needs to be moved into
	 *   making the connection from local to remote repo-so they talk and communicate
	 *   one time activity
	 *   
	 *  git add ./name of the file with path    ===>code is available on index/stage area
	 *  git commit -m "reason for the commit"   ===>code is available on the local site repo
	 *  
	 * _______________then push code to remote/git hub site
	 * git push origin master
	 * 
	 * origin ==> remote repo where there is the master branch
	 * 
	 * REVERSE: GETTING CODE FROM REMOTE TO LOCAL SITE--PULL
	 * 
	 * SRC: code is pointing by default to the master branch on local site
	 * now has to make connection to the remote url
	 * git remote add origin <Url>
	 * 
	 * BUT under the prj-there are so many unnecessary things like allure report,logs, reports
	 * screenshot folder and so many other things not needed to be shared with any one-hence
	 * pushing these files onto git hub is unnecessary and wastage of memory on github--so to
	 * avoid adding these things on to the remote--add gitignore file which stops these un-
	 * necessary things being added to remote
	 * so right click on prj and create a file-and create a .gitignore file and add the
	 * template(given by Nav)
	 * this .gitignore file is hidden and hence not seen on the project tree file system
	 * to view it-ctrl+shift+R and then search for .gitignore on the window popup
	 * 
	 * now add 
	 * git add .    ==> add the entire prj to the staging part
	 * git status   
	 * 
	 * even for deleted files on ws--u have to git add .
	 * then git commit -m "reason"
	 * then git push origin master
	 * 
	 * 
	 * 
	 */

}
