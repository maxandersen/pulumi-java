// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the operating system settings for the HANA instance.
 * 
 */
public final class OSProfileArgs extends ResourceArgs {

    public static final OSProfileArgs Empty = new OSProfileArgs();

    /**
     * Specifies the host OS name of the HANA instance.
     * 
     */
    @Import(name="computerName")
    private @Nullable Output<String> computerName;

    /**
     * @return Specifies the host OS name of the HANA instance.
     * 
     */
    public Optional<Output<String>> computerName() {
        return Optional.ofNullable(this.computerName);
    }

    /**
     * Specifies the SSH public key used to access the operating system.
     * 
     */
    @Import(name="sshPublicKey")
    private @Nullable Output<String> sshPublicKey;

    /**
     * @return Specifies the SSH public key used to access the operating system.
     * 
     */
    public Optional<Output<String>> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }

    private OSProfileArgs() {}

    private OSProfileArgs(OSProfileArgs $) {
        this.computerName = $.computerName;
        this.sshPublicKey = $.sshPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSProfileArgs $;

        public Builder() {
            $ = new OSProfileArgs();
        }

        public Builder(OSProfileArgs defaults) {
            $ = new OSProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computerName Specifies the host OS name of the HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder computerName(@Nullable Output<String> computerName) {
            $.computerName = computerName;
            return this;
        }

        /**
         * @param computerName Specifies the host OS name of the HANA instance.
         * 
         * @return builder
         * 
         */
        public Builder computerName(String computerName) {
            return computerName(Output.of(computerName));
        }

        /**
         * @param sshPublicKey Specifies the SSH public key used to access the operating system.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(@Nullable Output<String> sshPublicKey) {
            $.sshPublicKey = sshPublicKey;
            return this;
        }

        /**
         * @param sshPublicKey Specifies the SSH public key used to access the operating system.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(String sshPublicKey) {
            return sshPublicKey(Output.of(sshPublicKey));
        }

        public OSProfileArgs build() {
            return $;
        }
    }

}
