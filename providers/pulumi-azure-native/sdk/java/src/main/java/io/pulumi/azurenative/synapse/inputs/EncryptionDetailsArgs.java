// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.CustomerManagedKeyDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the encryption associated with the workspace
 * 
 */
public final class EncryptionDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionDetailsArgs Empty = new EncryptionDetailsArgs();

    /**
     * Customer Managed Key Details
     * 
     */
    @Import(name="cmk")
      private final @Nullable Output<CustomerManagedKeyDetailsArgs> cmk;

    public Output<CustomerManagedKeyDetailsArgs> cmk() {
        return this.cmk == null ? Codegen.empty() : this.cmk;
    }

    public EncryptionDetailsArgs(@Nullable Output<CustomerManagedKeyDetailsArgs> cmk) {
        this.cmk = cmk;
    }

    private EncryptionDetailsArgs() {
        this.cmk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomerManagedKeyDetailsArgs> cmk;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmk = defaults.cmk;
        }

        public Builder cmk(@Nullable Output<CustomerManagedKeyDetailsArgs> cmk) {
            this.cmk = cmk;
            return this;
        }
        public Builder cmk(@Nullable CustomerManagedKeyDetailsArgs cmk) {
            this.cmk = Codegen.ofNullable(cmk);
            return this;
        }        public EncryptionDetailsArgs build() {
            return new EncryptionDetailsArgs(cmk);
        }
    }
}
