// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.inputs.ServicePrincipalPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the Azure Container Registry which contains the images deployed to the cluster.
 * 
 */
public final class ContainerServiceCredentialsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerServiceCredentialsResponse Empty = new ContainerServiceCredentialsResponse();

    /**
     * The ACS kube config file.
     * 
     */
    @Import(name="acsKubeConfig", required=true)
      private final String acsKubeConfig;

    public String acsKubeConfig() {
        return this.acsKubeConfig;
    }

    /**
     * The ACR image pull secret name which was created in Kubernetes.
     * 
     */
    @Import(name="imagePullSecretName", required=true)
      private final String imagePullSecretName;

    public String imagePullSecretName() {
        return this.imagePullSecretName;
    }

    /**
     * Service principal configuration used by Kubernetes.
     * 
     */
    @Import(name="servicePrincipalConfiguration", required=true)
      private final ServicePrincipalPropertiesResponse servicePrincipalConfiguration;

    public ServicePrincipalPropertiesResponse servicePrincipalConfiguration() {
        return this.servicePrincipalConfiguration;
    }

    public ContainerServiceCredentialsResponse(
        String acsKubeConfig,
        String imagePullSecretName,
        ServicePrincipalPropertiesResponse servicePrincipalConfiguration) {
        this.acsKubeConfig = Objects.requireNonNull(acsKubeConfig, "expected parameter 'acsKubeConfig' to be non-null");
        this.imagePullSecretName = Objects.requireNonNull(imagePullSecretName, "expected parameter 'imagePullSecretName' to be non-null");
        this.servicePrincipalConfiguration = Objects.requireNonNull(servicePrincipalConfiguration, "expected parameter 'servicePrincipalConfiguration' to be non-null");
    }

    private ContainerServiceCredentialsResponse() {
        this.acsKubeConfig = null;
        this.imagePullSecretName = null;
        this.servicePrincipalConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acsKubeConfig;
        private String imagePullSecretName;
        private ServicePrincipalPropertiesResponse servicePrincipalConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsKubeConfig = defaults.acsKubeConfig;
    	      this.imagePullSecretName = defaults.imagePullSecretName;
    	      this.servicePrincipalConfiguration = defaults.servicePrincipalConfiguration;
        }

        public Builder acsKubeConfig(String acsKubeConfig) {
            this.acsKubeConfig = Objects.requireNonNull(acsKubeConfig);
            return this;
        }
        public Builder imagePullSecretName(String imagePullSecretName) {
            this.imagePullSecretName = Objects.requireNonNull(imagePullSecretName);
            return this;
        }
        public Builder servicePrincipalConfiguration(ServicePrincipalPropertiesResponse servicePrincipalConfiguration) {
            this.servicePrincipalConfiguration = Objects.requireNonNull(servicePrincipalConfiguration);
            return this;
        }        public ContainerServiceCredentialsResponse build() {
            return new ContainerServiceCredentialsResponse(acsKubeConfig, imagePullSecretName, servicePrincipalConfiguration);
        }
    }
}
