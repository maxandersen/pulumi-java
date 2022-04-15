// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.enums.IdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<IdentityType> type;

    public Output<IdentityType> type() {
        return this.type;
    }

    public IdentityArgs(Output<IdentityType> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<IdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(IdentityType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public IdentityArgs build() {
            return new IdentityArgs(type);
        }
    }
}
