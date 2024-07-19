package Git;

public class GitNotes12NavSessions {
	/*
	 * BRANCHING: If every one starts pushing the code direct to the master without any 
	 * check/validation -then
	 * 
	 * the code might become buggy so there should be a branches available where the team
	 * members can push their code into and then raise a PR(pull request) to other team members
	 * to check/review the code before pushing it into the remote master
	 * the PR should be accepted and not rejected so as to get this code merged into master
	 * 
	 * the PR should get the approval so as to get the code merged from feature branch into 
	 * the master
	 * 
	 * the team members need to take the latest pull to review the code
	 * the team members should be focussing on the local feature branch-when writing the code
	 * this code when pushed-goes into the remote feature branch and 
	 * then the PR is raised so 
	 * 
	 * CLONE: First time when someone takes the code from remote master is called cloning
	 * PULL: After first time every time u take the code from master-is called taking the pull
	 * 
	 * Best practices to be followed: the team members
	 * 1. need to take the latest pull every day so they get all the merged code into remote
	 * master by the team members
	 * 2. each team member then has to merge his/her local master to the latest pull taken that
	 * day which implies local master
	 * 
	 * git branch    ----creates a branch
	 * git checkout branch  -----gets focus onto branch so can write the code
	 * git checkout master -----gets focus onto local branch --do not write the code now
	 *  * name ==> work space pointing to name
	 *  we never work int the master branch on the local
	 *  we need to cut the branch and bring the focus onto the branch name and then start working
	 *  ==> git checkout branchname
	 *  NOW WRITE THE CODE
	 */

}
