// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class ServiceAccessPolicyEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccessPolicyEntryArgs Empty = new ServiceAccessPolicyEntryArgs();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @Import(name="objectId", required=true)
      private final Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId;
    }

    public ServiceAccessPolicyEntryArgs(Output<String> objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private ServiceAccessPolicyEntryArgs() {
        this.objectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccessPolicyEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder objectId(Output<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Output.of(Objects.requireNonNull(objectId));
            return this;
        }        public ServiceAccessPolicyEntryArgs build() {
            return new ServiceAccessPolicyEntryArgs(objectId);
        }
    }
}
