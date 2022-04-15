// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecretResponse {
    /**
     * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number}/secrets/{secret_id}/versions/{version_id}.
     * 
     */
    private final String cloudSecret;

    @CustomType.Constructor
    private SecretResponse(@CustomType.Parameter("cloudSecret") String cloudSecret) {
        this.cloudSecret = cloudSecret;
    }

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number}/secrets/{secret_id}/versions/{version_id}.
     * 
    */
    public String cloudSecret() {
        return this.cloudSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder cloudSecret(String cloudSecret) {
            this.cloudSecret = Objects.requireNonNull(cloudSecret);
            return this;
        }        public SecretResponse build() {
            return new SecretResponse(cloudSecret);
        }
    }
}
