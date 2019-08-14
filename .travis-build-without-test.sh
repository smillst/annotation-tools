#!/bin/bash

echo Entering `pwd`/.travis-build-without-test.sh

# Fail the whole script if any command fails
set -e

export SHELLOPTS

export JAVA_HOME=${JAVA_HOME:-$(dirname $(dirname $(dirname $(readlink -f $(/usr/bin/which java)))))}

export AFU=`readlink -f ${AFU:-../annotation-tools/annotation-file-utilities}`
export CHECKERFRAMEWORK=`readlink -f ${CHECKERFRAMEWORK:-../checker-framework}`

export PATH=$AFU/scripts:$JAVA_HOME/bin:$PATH

git -C /tmp/plume-scripts pull > /dev/null 2>&1 \
    || git -C /tmp clone --depth 1 -q https://github.com/plume-lib/plume-scripts.git
eval `/tmp/plume-scripts/ci-info eisop`

# jsr308-langtools
if [ -d ../jsr308-langtools ] ; then
    (cd ../jsr308-langtools && hg pull && hg update)
else
    CI_ORGANIZATION=eisop
    echo "Running:  (cd .. && hg clone https://bitbucket.org/${CI_ORGANIZATION}/jsr308-langtools)"
    (cd .. && (hg clone https://bitbucket.org/${CI_ORGANIZATION}/jsr308-langtools || hg clone https://bitbucket.org/${CI_ORGANIZATION}/jsr308-langtools))
    echo "... done: (cd .. && hg clone https://bitbucket.org/${CI_ORGANIZATION}/jsr308-langtools)"
fi
(cd ../jsr308-langtools/ && ./.travis-build-without-test.sh)


## Compile
cd ${AFU}; ./gradlew assemble
echo Exiting `pwd`/.travis-build-without-test.sh
