@echo off

rem ���浱ǰĿ¼λ��
set work_dir=%cd%

@cd ..
call mvn dependency:tree > %work_dir%/dependency-tree.txt