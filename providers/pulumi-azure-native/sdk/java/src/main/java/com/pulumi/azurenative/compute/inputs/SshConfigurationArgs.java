// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SshPublicKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSH configuration for Linux based VMs running on Azure
 * 
 */
public final class SshConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshConfigurationArgs Empty = new SshConfigurationArgs();

    /**
     * The list of SSH public keys used to authenticate with linux based VMs.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable Output<List<SshPublicKeyArgs>> publicKeys;

    public Output<List<SshPublicKeyArgs>> publicKeys() {
        return this.publicKeys == null ? Codegen.empty() : this.publicKeys;
    }

    public SshConfigurationArgs(@Nullable Output<List<SshPublicKeyArgs>> publicKeys) {
        this.publicKeys = publicKeys;
    }

    private SshConfigurationArgs() {
        this.publicKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SshPublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(SshConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(@Nullable Output<List<SshPublicKeyArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(@Nullable List<SshPublicKeyArgs> publicKeys) {
            this.publicKeys = Codegen.ofNullable(publicKeys);
            return this;
        }
        public Builder publicKeys(SshPublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public SshConfigurationArgs build() {
            return new SshConfigurationArgs(publicKeys);
        }
    }
}
