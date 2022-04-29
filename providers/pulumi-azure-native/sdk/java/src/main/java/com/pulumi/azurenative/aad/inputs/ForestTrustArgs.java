// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Forest Trust Setting
 * 
 */
public final class ForestTrustArgs extends ResourceArgs {

    public static final ForestTrustArgs Empty = new ForestTrustArgs();

    /**
     * Friendly Name
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Friendly Name
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Remote Dns ips
     * 
     */
    @Import(name="remoteDnsIps")
    private @Nullable Output<String> remoteDnsIps;

    /**
     * @return Remote Dns ips
     * 
     */
    public Optional<Output<String>> remoteDnsIps() {
        return Optional.ofNullable(this.remoteDnsIps);
    }

    /**
     * Trust Direction
     * 
     */
    @Import(name="trustDirection")
    private @Nullable Output<String> trustDirection;

    /**
     * @return Trust Direction
     * 
     */
    public Optional<Output<String>> trustDirection() {
        return Optional.ofNullable(this.trustDirection);
    }

    /**
     * Trust Password
     * 
     */
    @Import(name="trustPassword")
    private @Nullable Output<String> trustPassword;

    /**
     * @return Trust Password
     * 
     */
    public Optional<Output<String>> trustPassword() {
        return Optional.ofNullable(this.trustPassword);
    }

    /**
     * Trusted Domain FQDN
     * 
     */
    @Import(name="trustedDomainFqdn")
    private @Nullable Output<String> trustedDomainFqdn;

    /**
     * @return Trusted Domain FQDN
     * 
     */
    public Optional<Output<String>> trustedDomainFqdn() {
        return Optional.ofNullable(this.trustedDomainFqdn);
    }

    private ForestTrustArgs() {}

    private ForestTrustArgs(ForestTrustArgs $) {
        this.friendlyName = $.friendlyName;
        this.remoteDnsIps = $.remoteDnsIps;
        this.trustDirection = $.trustDirection;
        this.trustPassword = $.trustPassword;
        this.trustedDomainFqdn = $.trustedDomainFqdn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForestTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForestTrustArgs $;

        public Builder() {
            $ = new ForestTrustArgs();
        }

        public Builder(ForestTrustArgs defaults) {
            $ = new ForestTrustArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param friendlyName Friendly Name
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Friendly Name
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param remoteDnsIps Remote Dns ips
         * 
         * @return builder
         * 
         */
        public Builder remoteDnsIps(@Nullable Output<String> remoteDnsIps) {
            $.remoteDnsIps = remoteDnsIps;
            return this;
        }

        /**
         * @param remoteDnsIps Remote Dns ips
         * 
         * @return builder
         * 
         */
        public Builder remoteDnsIps(String remoteDnsIps) {
            return remoteDnsIps(Output.of(remoteDnsIps));
        }

        /**
         * @param trustDirection Trust Direction
         * 
         * @return builder
         * 
         */
        public Builder trustDirection(@Nullable Output<String> trustDirection) {
            $.trustDirection = trustDirection;
            return this;
        }

        /**
         * @param trustDirection Trust Direction
         * 
         * @return builder
         * 
         */
        public Builder trustDirection(String trustDirection) {
            return trustDirection(Output.of(trustDirection));
        }

        /**
         * @param trustPassword Trust Password
         * 
         * @return builder
         * 
         */
        public Builder trustPassword(@Nullable Output<String> trustPassword) {
            $.trustPassword = trustPassword;
            return this;
        }

        /**
         * @param trustPassword Trust Password
         * 
         * @return builder
         * 
         */
        public Builder trustPassword(String trustPassword) {
            return trustPassword(Output.of(trustPassword));
        }

        /**
         * @param trustedDomainFqdn Trusted Domain FQDN
         * 
         * @return builder
         * 
         */
        public Builder trustedDomainFqdn(@Nullable Output<String> trustedDomainFqdn) {
            $.trustedDomainFqdn = trustedDomainFqdn;
            return this;
        }

        /**
         * @param trustedDomainFqdn Trusted Domain FQDN
         * 
         * @return builder
         * 
         */
        public Builder trustedDomainFqdn(String trustedDomainFqdn) {
            return trustedDomainFqdn(Output.of(trustedDomainFqdn));
        }

        public ForestTrustArgs build() {
            return $;
        }
    }

}
