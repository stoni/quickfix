echo off
if "%1" == "" goto usage
if "%2" == "" goto usage

if "%1" == "debug" goto debug:
if "%1" == "release" goto release:
goto usage

:debug
set EX=_debug
goto start
:release
set EX=
goto start

:start
echo [DEFAULT] > cfg\at.cfg
echo ConnectionType=acceptor >> cfg\at.cfg
echo SocketAcceptPort=%2 >> cfg\at.cfg
echo SocketReuseAddress=Y >> cfg\at.cfg
echo StartTime=00:00:00 >> cfg\at.cfg
echo EndTime=00:00:00 >> cfg\at.cfg
echo SenderCompID=ISLD >> cfg\at.cfg
echo TargetCompID=TW >> cfg\at.cfg
echo ResetOnDisconnect=Y >> cfg\at.cfg
echo [SESSION] >> cfg\at.cfg
echo BeginString=FIX.4.0 >> cfg\at.cfg
echo DataDictionary=../spec/FIX40.xml >> cfg\at.cfg
echo [SESSION] >> cfg\at.cfg
echo BeginString=FIX.4.1 >> cfg\at.cfg
echo DataDictionary=../spec/FIX41.xml >> cfg\at.cfg
echo [SESSION] >> cfg\at.cfg
echo BeginString=FIX.4.2 >> cfg\at.cfg
echo DataDictionary=../spec/FIX42.xml >> cfg\at.cfg
echo [SESSION] >> cfg\at.cfg
echo BeginString=FIX.4.3 >> cfg\at.cfg
echo DataDictionary=../spec/FIX43.xml >> cfg\at.cfg

atrun -t run -s "..\bin\at%EX%.exe -f cfg\at.cfg" -d . -c "ruby Runner.rb 127.0.0.1 %2 definitions\server\fix40\*.def definitions\server\fix41\*.def definitions\server\fix42\*.def definitions\server\fix43\*.def" -i .\

goto quit

:usage
echo "Usage: runat [release | debug] [port]"

:quit