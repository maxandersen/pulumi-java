// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.azurenative.connectedvmwarevsphere.enums.IdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Managed service identity.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The type of managed service identity.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> type() {
        return this.type;
    }

    public IdentityArgs(Output<Either<String,IdentityType>> type) {
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
        private Output<Either<String,IdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<Either<String,IdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,IdentityType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public IdentityArgs build() {
            return new IdentityArgs(type);
        }
    }
}
