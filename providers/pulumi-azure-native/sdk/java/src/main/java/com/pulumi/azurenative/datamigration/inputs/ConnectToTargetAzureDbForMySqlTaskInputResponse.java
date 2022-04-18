// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MySqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure Database for MySQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForMySqlTaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetAzureDbForMySqlTaskInputResponse Empty = new ConnectToTargetAzureDbForMySqlTaskInputResponse();

    /**
     * Connection information for source MySQL server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final MySqlConnectionInfoResponse sourceConnectionInfo;

    public MySqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target Azure Database for MySQL server
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final MySqlConnectionInfoResponse targetConnectionInfo;

    public MySqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetAzureDbForMySqlTaskInputResponse(
        MySqlConnectionInfoResponse sourceConnectionInfo,
        MySqlConnectionInfoResponse targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetAzureDbForMySqlTaskInputResponse() {
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MySqlConnectionInfoResponse sourceConnectionInfo;
        private MySqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder sourceConnectionInfo(MySqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(MySqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public ConnectToTargetAzureDbForMySqlTaskInputResponse build() {
            return new ConnectToTargetAzureDbForMySqlTaskInputResponse(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
