#!/bin/bash

runuser -l vagrant -c 'yay --noconfirm --answeredit none -S jdk8 --noconfirm'

archlinux-java set java-8-jdk

cd /opt
wget http://ftp.man.poznan.pl/apache/flink/flink-1.6.1/flink-1.6.1-bin-scala_2.11.tgz
tar xzvf ./flink-1.6.1-bin-scala_2.11.tgz
ln -s /opt/flink-1.6.1-bin-scala_2.11 /opt/apache-flink
echo 'alias start-cluster="/opt/apache-flink/bin/start-cluster"' > /etc/profile.d/flink.sh
echo 'alias flink="/opt/apache-flink/bin/flink"' >> /etc/profile.d/flink.sh


