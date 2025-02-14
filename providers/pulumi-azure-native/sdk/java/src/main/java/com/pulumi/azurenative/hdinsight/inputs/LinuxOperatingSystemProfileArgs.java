// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.SshProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ssh username, password, and ssh public key.
 * 
 */
public final class LinuxOperatingSystemProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxOperatingSystemProfileArgs Empty = new LinuxOperatingSystemProfileArgs();

    /**
     * The password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The SSH profile.
     * 
     */
    @Import(name="sshProfile")
    private @Nullable Output<SshProfileArgs> sshProfile;

    /**
     * @return The SSH profile.
     * 
     */
    public Optional<Output<SshProfileArgs>> sshProfile() {
        return Optional.ofNullable(this.sshProfile);
    }

    /**
     * The username.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private LinuxOperatingSystemProfileArgs() {}

    private LinuxOperatingSystemProfileArgs(LinuxOperatingSystemProfileArgs $) {
        this.password = $.password;
        this.sshProfile = $.sshProfile;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxOperatingSystemProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxOperatingSystemProfileArgs $;

        public Builder() {
            $ = new LinuxOperatingSystemProfileArgs();
        }

        public Builder(LinuxOperatingSystemProfileArgs defaults) {
            $ = new LinuxOperatingSystemProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param sshProfile The SSH profile.
         * 
         * @return builder
         * 
         */
        public Builder sshProfile(@Nullable Output<SshProfileArgs> sshProfile) {
            $.sshProfile = sshProfile;
            return this;
        }

        /**
         * @param sshProfile The SSH profile.
         * 
         * @return builder
         * 
         */
        public Builder sshProfile(SshProfileArgs sshProfile) {
            return sshProfile(Output.of(sshProfile));
        }

        /**
         * @param username The username.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public LinuxOperatingSystemProfileArgs build() {
            return $;
        }
    }

}
