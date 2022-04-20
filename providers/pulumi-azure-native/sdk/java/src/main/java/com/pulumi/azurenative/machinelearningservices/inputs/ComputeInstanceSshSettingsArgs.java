// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.SshPublicAccess;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies policy and settings for SSH access.
 * 
 */
public final class ComputeInstanceSshSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeInstanceSshSettingsArgs Empty = new ComputeInstanceSshSettingsArgs();

    /**
     * Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
     * 
     */
    @Import(name="adminPublicKey")
      private final @Nullable Output<String> adminPublicKey;

    public Output<String> adminPublicKey() {
        return this.adminPublicKey == null ? Codegen.empty() : this.adminPublicKey;
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    @Import(name="sshPublicAccess")
      private final @Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess;

    public Output<Either<String,SshPublicAccess>> sshPublicAccess() {
        return this.sshPublicAccess == null ? Codegen.empty() : this.sshPublicAccess;
    }

    public ComputeInstanceSshSettingsArgs(
        @Nullable Output<String> adminPublicKey,
        @Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess) {
        this.adminPublicKey = adminPublicKey;
        this.sshPublicAccess = Codegen.stringProp("sshPublicAccess").left(SshPublicAccess.class).output().arg(sshPublicAccess).def("Disabled").getNullable();
    }

    private ComputeInstanceSshSettingsArgs() {
        this.adminPublicKey = Codegen.empty();
        this.sshPublicAccess = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceSshSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> adminPublicKey;
        private @Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceSshSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPublicKey = defaults.adminPublicKey;
    	      this.sshPublicAccess = defaults.sshPublicAccess;
        }

        public Builder adminPublicKey(@Nullable Output<String> adminPublicKey) {
            this.adminPublicKey = adminPublicKey;
            return this;
        }
        public Builder adminPublicKey(@Nullable String adminPublicKey) {
            this.adminPublicKey = Codegen.ofNullable(adminPublicKey);
            return this;
        }
        public Builder sshPublicAccess(@Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess) {
            this.sshPublicAccess = sshPublicAccess;
            return this;
        }
        public Builder sshPublicAccess(@Nullable Either<String,SshPublicAccess> sshPublicAccess) {
            this.sshPublicAccess = Codegen.ofNullable(sshPublicAccess);
            return this;
        }        public ComputeInstanceSshSettingsArgs build() {
            return new ComputeInstanceSshSettingsArgs(adminPublicKey, sshPublicAccess);
        }
    }
}
