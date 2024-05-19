# Build
custom_build(
    # Name of the container image
    ref = 'catalog-service-ms',
    # Command to build the container image
    # On Windows, replace $EXPECTED_REF with %EXPECTED_REF%
    command = './gradlew bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['build.gradle', 'src']
)

# Deploy
k8s_yaml(['src/main/k8s/deployment.yml', 'src/main/k8s/service.yml'])

# Manage
k8s_resource('catalog-service', port_forwards=['8080'])
