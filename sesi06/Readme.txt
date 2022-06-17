Sesi 6
------------------------------------------------------------------------------

Sesi ini belajar mengenai Git, dan bagaimana cara melakukan push repository lokal
ke repository yang ada di github.

git config --list
git config --global --list
git status

//pindah branch
git checkout -b main
git checkout -b master

cara menggunakan git
---
git init
git remote add origin url
git add README.md
git commit -m "first commit"
git checkout -b main
git pull origin branchname --allow-unrelated-histories
git push -u origin main


pull git pertama kali jika sudah remote