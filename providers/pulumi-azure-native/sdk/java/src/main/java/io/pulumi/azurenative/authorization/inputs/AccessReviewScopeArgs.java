// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Descriptor for what needs to be reviewed
 * 
 */
public final class AccessReviewScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessReviewScopeArgs Empty = new AccessReviewScopeArgs();

    /**
     * Flag to indicate whether to expand nested memberships or not.
     * 
     */
    @Import(name="expandNestedMemberships")
      private final @Nullable Output<Boolean> expandNestedMemberships;

    public Output<Boolean> expandNestedMemberships() {
        return this.expandNestedMemberships == null ? Codegen.empty() : this.expandNestedMemberships;
    }

    /**
     * Duration users are inactive for. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds))
     * 
     */
    @Import(name="inactiveDuration")
      private final @Nullable Output<String> inactiveDuration;

    public Output<String> inactiveDuration() {
        return this.inactiveDuration == null ? Codegen.empty() : this.inactiveDuration;
    }

    public AccessReviewScopeArgs(
        @Nullable Output<Boolean> expandNestedMemberships,
        @Nullable Output<String> inactiveDuration) {
        this.expandNestedMemberships = expandNestedMemberships;
        this.inactiveDuration = inactiveDuration;
    }

    private AccessReviewScopeArgs() {
        this.expandNestedMemberships = Codegen.empty();
        this.inactiveDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> expandNestedMemberships;
        private @Nullable Output<String> inactiveDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expandNestedMemberships = defaults.expandNestedMemberships;
    	      this.inactiveDuration = defaults.inactiveDuration;
        }

        public Builder expandNestedMemberships(@Nullable Output<Boolean> expandNestedMemberships) {
            this.expandNestedMemberships = expandNestedMemberships;
            return this;
        }
        public Builder expandNestedMemberships(@Nullable Boolean expandNestedMemberships) {
            this.expandNestedMemberships = Codegen.ofNullable(expandNestedMemberships);
            return this;
        }
        public Builder inactiveDuration(@Nullable Output<String> inactiveDuration) {
            this.inactiveDuration = inactiveDuration;
            return this;
        }
        public Builder inactiveDuration(@Nullable String inactiveDuration) {
            this.inactiveDuration = Codegen.ofNullable(inactiveDuration);
            return this;
        }        public AccessReviewScopeArgs build() {
            return new AccessReviewScopeArgs(expandNestedMemberships, inactiveDuration);
        }
    }
}
