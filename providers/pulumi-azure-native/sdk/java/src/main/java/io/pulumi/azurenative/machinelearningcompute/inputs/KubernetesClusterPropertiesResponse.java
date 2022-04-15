// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.ServicePrincipalPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes cluster specific properties
 * 
 */
public final class KubernetesClusterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesClusterPropertiesResponse Empty = new KubernetesClusterPropertiesResponse();

    /**
     * The Azure Service Principal used by Kubernetes
     * 
     */
    @Import(name="servicePrincipal")
      private final @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    public Optional<ServicePrincipalPropertiesResponse> servicePrincipal() {
        return this.servicePrincipal == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipal);
    }

    public KubernetesClusterPropertiesResponse(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    private KubernetesClusterPropertiesResponse() {
        this.servicePrincipal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder servicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }        public KubernetesClusterPropertiesResponse build() {
            return new KubernetesClusterPropertiesResponse(servicePrincipal);
        }
    }
}
