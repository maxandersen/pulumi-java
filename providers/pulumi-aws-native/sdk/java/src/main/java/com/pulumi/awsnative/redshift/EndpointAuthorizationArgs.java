// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointAuthorizationArgs Empty = new EndpointAuthorizationArgs();

    /**
     * The target AWS account ID to grant or revoke access for.
     * 
     */
    @Import(name="account", required=true)
    private Output<String> account;

    /**
     * @return The target AWS account ID to grant or revoke access for.
     * 
     */
    public Output<String> account() {
        return this.account;
    }

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     *  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
     */
    @Import(name="vpcIds")
    private @Nullable Output<List<String>> vpcIds;

    /**
     * @return The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
     */
    public Optional<Output<List<String>>> vpcIds() {
        return Optional.ofNullable(this.vpcIds);
    }

    private EndpointAuthorizationArgs() {}

    private EndpointAuthorizationArgs(EndpointAuthorizationArgs $) {
        this.account = $.account;
        this.clusterIdentifier = $.clusterIdentifier;
        this.force = $.force;
        this.vpcIds = $.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointAuthorizationArgs $;

        public Builder() {
            $ = new EndpointAuthorizationArgs();
        }

        public Builder(EndpointAuthorizationArgs defaults) {
            $ = new EndpointAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account The target AWS account ID to grant or revoke access for.
         * 
         * @return builder
         * 
         */
        public Builder account(Output<String> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account The target AWS account ID to grant or revoke access for.
         * 
         * @return builder
         * 
         */
        public Builder account(String account) {
            return account(Output.of(account));
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The cluster identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param force  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param vpcIds The virtual private cloud (VPC) identifiers to grant or revoke access to.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(@Nullable Output<List<String>> vpcIds) {
            $.vpcIds = vpcIds;
            return this;
        }

        /**
         * @param vpcIds The virtual private cloud (VPC) identifiers to grant or revoke access to.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(List<String> vpcIds) {
            return vpcIds(Output.of(vpcIds));
        }

        /**
         * @param vpcIds The virtual private cloud (VPC) identifiers to grant or revoke access to.
         * 
         * @return builder
         * 
         */
        public Builder vpcIds(String... vpcIds) {
            return vpcIds(List.of(vpcIds));
        }

        public EndpointAuthorizationArgs build() {
            $.account = Objects.requireNonNull($.account, "expected parameter 'account' to be non-null");
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}
