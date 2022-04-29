// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notebooks;

import com.pulumi.azurenative.notebooks.inputs.NotebookResourceSystemDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookProxyArgs extends ResourceArgs {

    public static final NotebookProxyArgs Empty = new NotebookProxyArgs();

    /**
     * The friendly string identifier of the creator of the NotebookProxy resource.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The friendly string identifier of the creator of the NotebookProxy resource.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The public DNS name
     * 
     */
    @Import(name="publicDns")
    private @Nullable Output<String> publicDns;

    /**
     * @return The public DNS name
     * 
     */
    public Optional<Output<String>> publicDns() {
        return Optional.ofNullable(this.publicDns);
    }

    /**
     * Allow public network access on a V-Net locked notebook resource
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<String> publicNetworkAccess;

    /**
     * @return Allow public network access on a V-Net locked notebook resource
     * 
     */
    public Optional<Output<String>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The region of the NotebookProxy resource.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the NotebookProxy resource.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * The alternate application ID used for auth token request in the data plane
     * 
     */
    @Import(name="secondaryAppId")
    private @Nullable Output<String> secondaryAppId;

    /**
     * @return The alternate application ID used for auth token request in the data plane
     * 
     */
    public Optional<Output<String>> secondaryAppId() {
        return Optional.ofNullable(this.secondaryAppId);
    }

    /**
     * System data for notebook resource
     * 
     */
    @Import(name="systemData")
    private @Nullable Output<NotebookResourceSystemDataArgs> systemData;

    /**
     * @return System data for notebook resource
     * 
     */
    public Optional<Output<NotebookResourceSystemDataArgs>> systemData() {
        return Optional.ofNullable(this.systemData);
    }

    private NotebookProxyArgs() {}

    private NotebookProxyArgs(NotebookProxyArgs $) {
        this.hostname = $.hostname;
        this.publicDns = $.publicDns;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.secondaryAppId = $.secondaryAppId;
        this.systemData = $.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotebookProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotebookProxyArgs $;

        public Builder() {
            $ = new NotebookProxyArgs();
        }

        public Builder(NotebookProxyArgs defaults) {
            $ = new NotebookProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The friendly string identifier of the creator of the NotebookProxy resource.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The friendly string identifier of the creator of the NotebookProxy resource.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param publicDns The public DNS name
         * 
         * @return builder
         * 
         */
        public Builder publicDns(@Nullable Output<String> publicDns) {
            $.publicDns = publicDns;
            return this;
        }

        /**
         * @param publicDns The public DNS name
         * 
         * @return builder
         * 
         */
        public Builder publicDns(String publicDns) {
            return publicDns(Output.of(publicDns));
        }

        /**
         * @param publicNetworkAccess Allow public network access on a V-Net locked notebook resource
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<String> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Allow public network access on a V-Net locked notebook resource
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param region The region of the NotebookProxy resource.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the NotebookProxy resource.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param secondaryAppId The alternate application ID used for auth token request in the data plane
         * 
         * @return builder
         * 
         */
        public Builder secondaryAppId(@Nullable Output<String> secondaryAppId) {
            $.secondaryAppId = secondaryAppId;
            return this;
        }

        /**
         * @param secondaryAppId The alternate application ID used for auth token request in the data plane
         * 
         * @return builder
         * 
         */
        public Builder secondaryAppId(String secondaryAppId) {
            return secondaryAppId(Output.of(secondaryAppId));
        }

        /**
         * @param systemData System data for notebook resource
         * 
         * @return builder
         * 
         */
        public Builder systemData(@Nullable Output<NotebookResourceSystemDataArgs> systemData) {
            $.systemData = systemData;
            return this;
        }

        /**
         * @param systemData System data for notebook resource
         * 
         * @return builder
         * 
         */
        public Builder systemData(NotebookResourceSystemDataArgs systemData) {
            return systemData(Output.of(systemData));
        }

        public NotebookProxyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
