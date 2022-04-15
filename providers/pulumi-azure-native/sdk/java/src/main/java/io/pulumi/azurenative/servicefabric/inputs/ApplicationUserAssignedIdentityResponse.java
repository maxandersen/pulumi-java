// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationUserAssignedIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationUserAssignedIdentityResponse Empty = new ApplicationUserAssignedIdentityResponse();

    /**
     * The friendly name of user assigned identity.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    public ApplicationUserAssignedIdentityResponse(
        String name,
        String principalId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ApplicationUserAssignedIdentityResponse() {
        this.name = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUserAssignedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }        public ApplicationUserAssignedIdentityResponse build() {
            return new ApplicationUserAssignedIdentityResponse(name, principalId);
        }
    }
}
