// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceRoleProfilePropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceRoleProfileResponse {
    /**
     * List of roles for the cloud service.
     * 
     */
    private final @Nullable List<CloudServiceRoleProfilePropertiesResponse> roles;

    @CustomType.Constructor
    private CloudServiceRoleProfileResponse(@CustomType.Parameter("roles") @Nullable List<CloudServiceRoleProfilePropertiesResponse> roles) {
        this.roles = roles;
    }

    /**
     * List of roles for the cloud service.
     * 
    */
    public List<CloudServiceRoleProfilePropertiesResponse> roles() {
        return this.roles == null ? List.of() : this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CloudServiceRoleProfilePropertiesResponse> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
        }

        public Builder roles(@Nullable List<CloudServiceRoleProfilePropertiesResponse> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(CloudServiceRoleProfilePropertiesResponse... roles) {
            return roles(List.of(roles));
        }        public CloudServiceRoleProfileResponse build() {
            return new CloudServiceRoleProfileResponse(roles);
        }
    }
}
