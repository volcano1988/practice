## 初始化器
#### Spring文件加载顺序简介
1. XmlBeanFactory

2. ClassPathResource 
spring加载配置文件的主要实现类，详见```umls/ClassPathResource.uml```
这个层级主要是根据加载的配置文件，进行处理，包括资源是否存在、可读性、文件状态等等做处理。详见Resource接口。
当然，Resource在spring中有众多的实现
3.