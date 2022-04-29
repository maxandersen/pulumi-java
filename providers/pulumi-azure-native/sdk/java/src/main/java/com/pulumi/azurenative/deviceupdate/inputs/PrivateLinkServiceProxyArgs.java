// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.azurenative.deviceupdate.inputs.GroupConnectivityInformationArgs;
import com.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private link service proxy details.
 * 
 */
public final class PrivateLinkServiceProxyArgs extends ResourceArgs {

    public static final PrivateLinkServiceProxyArgs Empty = new PrivateLinkServiceProxyArgs();

    /**
     * Group connectivity information.
     * 
     */
    @Import(name="groupConnectivityInformation")
    private @Nullable Output<List<GroupConnectivityInformationArgs>> groupConnectivityInformation;

    /**
     * @return Group connectivity information.
     * 
     */
    public Optional<Output<List<GroupConnectivityInformationArgs>>> groupConnectivityInformation() {
        return Optional.ofNullable(this.groupConnectivityInformation);
    }

    /**
     * NRP resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return NRP resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Remote private link service connection state
     * 
     */
    @Import(name="remotePrivateLinkServiceConnectionState")
    private @Nullable Output<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState;

    /**
     * @return Remote private link service connection state
     * 
     */
    public Optional<Output<PrivateLinkServiceConnectionStateArgs>> remotePrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.remotePrivateLinkServiceConnectionState);
    }

    private PrivateLinkServiceProxyArgs() {}

    private PrivateLinkServiceProxyArgs(PrivateLinkServiceProxyArgs $) {
        this.groupConnectivityInformation = $.groupConnectivityInformation;
        this.id = $.id;
        this.remotePrivateLinkServiceConnectionState = $.remotePrivateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceProxyArgs $;

        public Builder() {
            $ = new PrivateLinkServiceProxyArgs();
        }

        public Builder(PrivateLinkServiceProxyArgs defaults) {
            $ = new PrivateLinkServiceProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupConnectivityInformation Group connectivity information.
         * 
         * @return builder
         * 
         */
        public Builder groupConnectivityInformation(@Nullable Output<List<GroupConnectivityInformationArgs>> groupConnectivityInformation) {
            $.groupConnectivityInformation = groupConnectivityInformation;
            return this;
        }

        /**
         * @param groupConnectivityInformation Group connectivity information.
         * 
         * @return builder
         * 
         */
        public Builder groupConnectivityInformation(List<GroupConnectivityInformationArgs> groupConnectivityInformation) {
            return groupConnectivityInformation(Output.of(groupConnectivityInformation));
        }

        /**
         * @param groupConnectivityInformation Group connectivity information.
         * 
         * @return builder
         * 
         */
        public Builder groupConnectivityInformation(GroupConnectivityInformationArgs... groupConnectivityInformation) {
            return groupConnectivityInformation(List.of(groupConnectivityInformation));
        }

        /**
         * @param id NRP resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id NRP resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param remotePrivateLinkServiceConnectionState Remote private link service connection state
         * 
         * @return builder
         * 
         */
        public Builder remotePrivateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> remotePrivateLinkServiceConnectionState) {
            $.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param remotePrivateLinkServiceConnectionState Remote private link service connection state
         * 
         * @return builder
         * 
         */
        public Builder remotePrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs remotePrivateLinkServiceConnectionState) {
            return remotePrivateLinkServiceConnectionState(Output.of(remotePrivateLinkServiceConnectionState));
        }

        public PrivateLinkServiceProxyArgs build() {
            return $;
        }
    }

}
