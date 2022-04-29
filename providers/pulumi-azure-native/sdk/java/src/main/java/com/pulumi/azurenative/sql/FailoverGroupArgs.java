// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.inputs.FailoverGroupReadOnlyEndpointArgs;
import com.pulumi.azurenative.sql.inputs.FailoverGroupReadWriteEndpointArgs;
import com.pulumi.azurenative.sql.inputs.PartnerInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailoverGroupArgs extends ResourceArgs {

    public static final FailoverGroupArgs Empty = new FailoverGroupArgs();

    /**
     * List of databases in the failover group.
     * 
     */
    @Import(name="databases")
    private @Nullable Output<List<String>> databases;

    /**
     * @return List of databases in the failover group.
     * 
     */
    public Optional<Output<List<String>>> databases() {
        return Optional.ofNullable(this.databases);
    }

    /**
     * The name of the failover group.
     * 
     */
    @Import(name="failoverGroupName")
    private @Nullable Output<String> failoverGroupName;

    /**
     * @return The name of the failover group.
     * 
     */
    public Optional<Output<String>> failoverGroupName() {
        return Optional.ofNullable(this.failoverGroupName);
    }

    /**
     * List of partner server information for the failover group.
     * 
     */
    @Import(name="partnerServers", required=true)
    private Output<List<PartnerInfoArgs>> partnerServers;

    /**
     * @return List of partner server information for the failover group.
     * 
     */
    public Output<List<PartnerInfoArgs>> partnerServers() {
        return this.partnerServers;
    }

    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @Import(name="readOnlyEndpoint")
    private @Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint;

    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    public Optional<Output<FailoverGroupReadOnlyEndpointArgs>> readOnlyEndpoint() {
        return Optional.ofNullable(this.readOnlyEndpoint);
    }

    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @Import(name="readWriteEndpoint", required=true)
    private Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint;

    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    public Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server containing the failover group.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server containing the failover group.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FailoverGroupArgs() {}

    private FailoverGroupArgs(FailoverGroupArgs $) {
        this.databases = $.databases;
        this.failoverGroupName = $.failoverGroupName;
        this.partnerServers = $.partnerServers;
        this.readOnlyEndpoint = $.readOnlyEndpoint;
        this.readWriteEndpoint = $.readWriteEndpoint;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupArgs $;

        public Builder() {
            $ = new FailoverGroupArgs();
        }

        public Builder(FailoverGroupArgs defaults) {
            $ = new FailoverGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databases List of databases in the failover group.
         * 
         * @return builder
         * 
         */
        public Builder databases(@Nullable Output<List<String>> databases) {
            $.databases = databases;
            return this;
        }

        /**
         * @param databases List of databases in the failover group.
         * 
         * @return builder
         * 
         */
        public Builder databases(List<String> databases) {
            return databases(Output.of(databases));
        }

        /**
         * @param databases List of databases in the failover group.
         * 
         * @return builder
         * 
         */
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }

        /**
         * @param failoverGroupName The name of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverGroupName(@Nullable Output<String> failoverGroupName) {
            $.failoverGroupName = failoverGroupName;
            return this;
        }

        /**
         * @param failoverGroupName The name of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverGroupName(String failoverGroupName) {
            return failoverGroupName(Output.of(failoverGroupName));
        }

        /**
         * @param partnerServers List of partner server information for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(Output<List<PartnerInfoArgs>> partnerServers) {
            $.partnerServers = partnerServers;
            return this;
        }

        /**
         * @param partnerServers List of partner server information for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(List<PartnerInfoArgs> partnerServers) {
            return partnerServers(Output.of(partnerServers));
        }

        /**
         * @param partnerServers List of partner server information for the failover group.
         * 
         * @return builder
         * 
         */
        public Builder partnerServers(PartnerInfoArgs... partnerServers) {
            return partnerServers(List.of(partnerServers));
        }

        /**
         * @param readOnlyEndpoint Read-only endpoint of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyEndpoint(@Nullable Output<FailoverGroupReadOnlyEndpointArgs> readOnlyEndpoint) {
            $.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }

        /**
         * @param readOnlyEndpoint Read-only endpoint of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyEndpoint(FailoverGroupReadOnlyEndpointArgs readOnlyEndpoint) {
            return readOnlyEndpoint(Output.of(readOnlyEndpoint));
        }

        /**
         * @param readWriteEndpoint Read-write endpoint of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpoint(Output<FailoverGroupReadWriteEndpointArgs> readWriteEndpoint) {
            $.readWriteEndpoint = readWriteEndpoint;
            return this;
        }

        /**
         * @param readWriteEndpoint Read-write endpoint of the failover group instance.
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpoint(FailoverGroupReadWriteEndpointArgs readWriteEndpoint) {
            return readWriteEndpoint(Output.of(readWriteEndpoint));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server containing the failover group.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server containing the failover group.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FailoverGroupArgs build() {
            $.partnerServers = Objects.requireNonNull($.partnerServers, "expected parameter 'partnerServers' to be non-null");
            $.readWriteEndpoint = Objects.requireNonNull($.readWriteEndpoint, "expected parameter 'readWriteEndpoint' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
