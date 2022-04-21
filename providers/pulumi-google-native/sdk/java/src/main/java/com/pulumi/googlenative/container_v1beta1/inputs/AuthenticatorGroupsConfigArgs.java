// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for returning group information from authenticators.
 * 
 */
public final class AuthenticatorGroupsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticatorGroupsConfigArgs Empty = new AuthenticatorGroupsConfigArgs();

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    @Import(name="securityGroup")
    private @Nullable Output<String> securityGroup;

    public Optional<Output<String>> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    private AuthenticatorGroupsConfigArgs() {}

    private AuthenticatorGroupsConfigArgs(AuthenticatorGroupsConfigArgs $) {
        this.enabled = $.enabled;
        this.securityGroup = $.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticatorGroupsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticatorGroupsConfigArgs $;

        public Builder() {
            $ = new AuthenticatorGroupsConfigArgs();
        }

        public Builder(AuthenticatorGroupsConfigArgs defaults) {
            $ = new AuthenticatorGroupsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder securityGroup(@Nullable Output<String> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        public Builder securityGroup(String securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        public AuthenticatorGroupsConfigArgs build() {
            return $;
        }
    }

}
