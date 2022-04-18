// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.CloudServiceVaultSecretGroupResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the OS profile for the cloud service.
 * 
 */
public final class CloudServiceOsProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudServiceOsProfileResponse Empty = new CloudServiceOsProfileResponse();

    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
     */
    @Import(name="secrets")
      private final @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

    public List<CloudServiceVaultSecretGroupResponse> secrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }

    public CloudServiceOsProfileResponse(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
        this.secrets = secrets;
    }

    private CloudServiceOsProfileResponse() {
        this.secrets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceOsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CloudServiceVaultSecretGroupResponse> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceOsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder secrets(@Nullable List<CloudServiceVaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(CloudServiceVaultSecretGroupResponse... secrets) {
            return secrets(List.of(secrets));
        }        public CloudServiceOsProfileResponse build() {
            return new CloudServiceOsProfileResponse(secrets);
        }
    }
}
