@echo off

rem 保存当前目录位置
set work_dir=%cd%

@cd ..
call mvn dependency:tree > %work_dir%/dependency-tree.txt