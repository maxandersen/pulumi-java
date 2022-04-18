// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyStatusProperties extends com.pulumi.resources.InvokeArgs {

    public static final PolicyStatusProperties Empty = new PolicyStatusProperties();

    /**
     * Specifies whether the Object lambda Access Point Policy is Public or not. Object lambda Access Points are private by default.
     * 
     */
    @Import(name="isPublic")
      private final @Nullable Boolean isPublic;

    public Optional<Boolean> isPublic() {
        return this.isPublic == null ? Optional.empty() : Optional.ofNullable(this.isPublic);
    }

    public PolicyStatusProperties(@Nullable Boolean isPublic) {
        this.isPublic = isPublic;
    }

    private PolicyStatusProperties() {
        this.isPublic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStatusProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isPublic;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStatusProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPublic = defaults.isPublic;
        }

        public Builder isPublic(@Nullable Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }        public PolicyStatusProperties build() {
            return new PolicyStatusProperties(isPublic);
        }
    }
}
