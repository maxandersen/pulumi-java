// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerKeyArgs Empty = new GetServerKeyArgs();

    /**
     * The name of the server key to be retrieved.
     * 
     */
    @Import(name="keyName", required=true)
      private final String keyName;

    public String keyName() {
        return this.keyName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String serverName() {
        return this.serverName;
    }

    public GetServerKeyArgs(
        String keyName,
        String resourceGroupName,
        String serverName) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetServerKeyArgs() {
        this.keyName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetServerKeyArgs build() {
            return new GetServerKeyArgs(keyName, resourceGroupName, serverName);
        }
    }
}
