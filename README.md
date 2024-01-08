# https://start.spring.io/#

https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.1.5&packaging=jar&jvmVersion=21&groupId=fr.efrei&artifactId=server&name=server&description=Demo%20project%20for%20Spring%20Boot&packageName=fr.efrei.server&dependencies=web,devtools,data-jpa,h2



#1 https://spring.io/guides/gs/spring-boot/
#2 https://www.baeldung.com/spring-boot-h2-database

./gradlew bootRun

h2 url: jdbc:h2:file:./build/h2db/data/demo


#K8s
https://minikube.sigs.k8s.io/docs/drivers/docker/

minikube start --driver=docker

kubectl get nodes
minikube status
kubectl version

#kubectl commands
kubectl get nodes
kubectl get pod
kubectl get services
kubectl create deployment server-depl --image=server
kubectl get deployment
kubectl get replicaset
kubectl edit deployment server-depl

debugging
kubectl logs {pod-name}
kubectl exec -it {pod-name} -- bin/bash

create mongo deployment
kubectl create deployment mongo-depl --image=mongo
kubectl logs mongo-depl-{pod-name}
kubectl describe pod mongo-depl-{pod-name}

delete deployment
kubectl delete deployment server-depl
kubectl delete deployment nginx-depl

#create or edit config file
https://gitlab.com/nanuchi/youtube-tutorial-series/-/tree/master/kubernetes-configuration-file-explained

vim nginx-deployment.yaml
kubectl apply -f nginx-deployment.yaml
kubectl get pod
kubectl get deployment
kubectl delete <POD>

delete with config
kubectl delete -f nginx-deployment.yaml
#Metrics
kubectl top The kubectl top command returns current CPU and memory usage for a cluster’s pods or nodes, or for a particular pod or node if specified.