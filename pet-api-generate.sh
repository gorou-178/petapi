#!/bin/bash

docker run --rm \
  -v "${PWD}/build/openapi:/out" \
  -v "${PWD}/petstore.yaml:/petstore.yaml" \
  openapitools/openapi-generator-cli:v7.3.0 generate \
  --generator-name spring \
  --input-spec "/petstore.yaml" \
  --output /out \
  --additional-properties hideGenerationTimestamp=true \
  --additional-properties sourceFolder=gen-src/main/java \
  --additional-properties basePackage=com.example.petapi \
  --additional-properties apiPackage=com.example.petapi.adapter.controller \
  --additional-properties modelPackage=com.example.petapi.domain.model \
  --additional-properties skipDefaultInterface=true \
  --additional-properties oas3=true \
  --additional-properties dateLibrary=java8 \
  --additional-properties delegatePattern=false \
  --additional-properties interfaceOnly=true \
  --additional-properties openApiNullable=false \
  --additional-properties useTags=true \
  --additional-properties useSpringBoot3=true \
  --additional-properties disallowAdditionalPropertiesIfNotPresent=false \
  --additional-properties useBeanValidation=true \
  --additional-properties serializableModel=true
