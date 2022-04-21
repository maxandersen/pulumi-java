// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationArgs Empty = new GetConfigurationArgs();

    /**
     * The name of the server configuration.
     * 
     */
    @Import(name="configurationName", required=true)
    private String configurationName;

    public String configurationName() {
        return this.configurationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    public String serverName() {
        return this.serverName;
    }

    private GetConfigurationArgs() {}

    private GetConfigurationArgs(GetConfigurationArgs $) {
        this.configurationName = $.configurationName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationArgs $;

        public Builder() {
            $ = new GetConfigurationArgs();
        }

        public Builder(GetConfigurationArgs defaults) {
            $ = new GetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder configurationName(String configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetConfigurationArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
