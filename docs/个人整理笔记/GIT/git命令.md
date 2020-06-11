git commit

git branch 

git checkout

改变head指向

git checkout '提交的哈希'

git checkout  '分支名'^

git checkout  '分支名'～4

git branch -f '分支名' '提交的哈希值' （直接把某个分支强制指向某个提交）

git reset   HEAD^（撤销本地分支，直接把分支回退几个版本）

git revert HEAD^ (撤销远程分支)

git cherry-pick <多个提交号> 将一些提交复制到当前所在位置下（HEAD）

(交互式rebase) git rebase -i HEAD~4 (要调整的个数)



(提交本地分支到远程并创建一个远程分支dev) git push origin dev

git commit --amend -m "" --author ""
git push --force-with-lease origin master
[](https://blog.csdn.net/fuchaosz/article/details/52170105)