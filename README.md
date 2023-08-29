# Extrawest-OCPI-2.2.1-CPO-Client

Current branch contains empty implementations of Extrawest-OCPI-2.2.1-CPO-Server Services. 
It is needed to be able to run server and allow OpenApi maven plugin to generate spec on http://localhost:8080/swagger-ui/index.html#/.

To generate client's classes based on OpenApi please use CLI command:

```shell
java -jar openapi-generator-cli-6.6.0.jar generate \
                -i http://localhost:8080/v3/api-docs \
                --api-package com.extrawest.ocpi.cpo.client.api \
                --model-package com.extrawest.ocpi.cpo.client.model \
                --invoker-package com.extrawest.ocpi.cpo.client.invoker \
                --group-id com.extrawest \
                --artifact-id Extrawest-OCPI-2.2.1-CPO-Client \
                --artifact-version 2023.8.28 \
                --additional-properties=useTags=true \
                -g java \
                -p java11=true \
                --library resttemplate \
                -o ./cpo-resttemplate-client
```

