@echo off
set "ROOT=java-learning-bucket"

REM 创建根目录
mkdir %ROOT%
cd %ROOT%

REM 顶层文件
echo.>README.md
echo.>.gitignore

REM 文档目录
mkdir docs

REM Java 学习模块
mkdir language-basics
mkdir language-basics\variables
mkdir language-basics\control-flow
mkdir language-basics\operators

mkdir oop
mkdir oop\encapsulation
mkdir oop\inheritance
mkdir oop\polymorphism

mkdir type-system
mkdir type-system\wrapper-types
mkdir type-system\generics
mkdir type-system\enums
mkdir type-system\annotations

mkdir exception-handling
mkdir exception-handling\try-catch
mkdir exception-handling\custom-exceptions

mkdir standard-library
mkdir standard-library\collections
mkdir standard-library\collections\list
mkdir standard-library\collections\map
mkdir standard-library\collections\set
mkdir standard-library\string
mkdir standard-library\math
mkdir standard-library\io
mkdir standard-library\nio

mkdir date-time
mkdir date-time\localdate
mkdir date-time\datetime-formatting

mkdir concurrency
mkdir concurrency\thread
mkdir concurrency\synchronized
mkdir concurrency\executor
mkdir concurrency\atomic

mkdir functional
mkdir functional\lambda
mkdir functional\stream
mkdir functional\optional

mkdir jvm-internals
mkdir jvm-internals\classloader
mkdir jvm-internals\jmm
mkdir jvm-internals\bytecode
mkdir jvm-internals\gc

mkdir tools-and-build
mkdir tools-and-build\maven
mkdir tools-and-build\gradle
mkdir tools-and-build\javadoc
mkdir tools-and-build\jar

mkdir testing
mkdir testing\junit
mkdir testing\mockito

mkdir design-patterns
mkdir design-patterns\singleton
mkdir design-patterns\observer
mkdir design-patterns\strategy

mkdir network
mkdir network\socket
mkdir network\http
mkdir network\url

echo 项目目录结构已创建完成！
pause
