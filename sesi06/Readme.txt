===================================================
                    Sesi 01
===================================================


Sesi ini belajar mengenai Git, dan bagaimana cara melakukan push repository lokal
ke repository yang ada di github.

- config awal 
git config --list
git config --global --list
git status

- pindah branch
git checkout -b main
git checkout -b master

- cara menggunakan git (push)

git init
git remote add origin url
git add README.md
git commit -m "judul commit"
git checkout -b main
git pull origin branchname
git push -u origin main