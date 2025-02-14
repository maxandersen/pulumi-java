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
import java.util.Optional;
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
    private @Nullable Output<String> adminPublicKey;

    /**
     * @return Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
     * 
     */
    public Optional<Output<String>> adminPublicKey() {
        return Optional.ofNullable(this.adminPublicKey);
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    @Import(name="sshPublicAccess")
    private @Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess;

    /**
     * @return State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    public Optional<Output<Either<String,SshPublicAccess>>> sshPublicAccess() {
        return Optional.ofNullable(this.sshPublicAccess);
    }

    private ComputeInstanceSshSettingsArgs() {}

    private ComputeInstanceSshSettingsArgs(ComputeInstanceSshSettingsArgs $) {
        this.adminPublicKey = $.adminPublicKey;
        this.sshPublicAccess = $.sshPublicAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeInstanceSshSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeInstanceSshSettingsArgs $;

        public Builder() {
            $ = new ComputeInstanceSshSettingsArgs();
        }

        public Builder(ComputeInstanceSshSettingsArgs defaults) {
            $ = new ComputeInstanceSshSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminPublicKey Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
         * 
         * @return builder
         * 
         */
        public Builder adminPublicKey(@Nullable Output<String> adminPublicKey) {
            $.adminPublicKey = adminPublicKey;
            return this;
        }

        /**
         * @param adminPublicKey Specifies the SSH rsa public key file as a string. Use &#34;ssh-keygen -t rsa -b 2048&#34; to generate your SSH key pairs.
         * 
         * @return builder
         * 
         */
        public Builder adminPublicKey(String adminPublicKey) {
            return adminPublicKey(Output.of(adminPublicKey));
        }

        /**
         * @param sshPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicAccess(@Nullable Output<Either<String,SshPublicAccess>> sshPublicAccess) {
            $.sshPublicAccess = sshPublicAccess;
            return this;
        }

        /**
         * @param sshPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicAccess(Either<String,SshPublicAccess> sshPublicAccess) {
            return sshPublicAccess(Output.of(sshPublicAccess));
        }

        /**
         * @param sshPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicAccess(String sshPublicAccess) {
            return sshPublicAccess(Either.ofLeft(sshPublicAccess));
        }

        /**
         * @param sshPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicAccess(SshPublicAccess sshPublicAccess) {
            return sshPublicAccess(Either.ofRight(sshPublicAccess));
        }

        public ComputeInstanceSshSettingsArgs build() {
            $.sshPublicAccess = Codegen.stringProp("sshPublicAccess").left(SshPublicAccess.class).output().arg($.sshPublicAccess).def("Disabled").getNullable();
            return $;
        }
    }

}
