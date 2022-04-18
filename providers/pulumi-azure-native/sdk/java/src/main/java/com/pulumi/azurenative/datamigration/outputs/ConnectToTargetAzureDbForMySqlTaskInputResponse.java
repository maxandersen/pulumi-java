// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.MySqlConnectionInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectToTargetAzureDbForMySqlTaskInputResponse {
    /**
     * Connection information for source MySQL server
     * 
     */
    private final MySqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for target Azure Database for MySQL server
     * 
     */
    private final MySqlConnectionInfoResponse targetConnectionInfo;

    @CustomType.Constructor
    private ConnectToTargetAzureDbForMySqlTaskInputResponse(
        @CustomType.Parameter("sourceConnectionInfo") MySqlConnectionInfoResponse sourceConnectionInfo,
        @CustomType.Parameter("targetConnectionInfo") MySqlConnectionInfoResponse targetConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * Connection information for source MySQL server
     * 
    */
    public MySqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for target Azure Database for MySQL server
     * 
    */
    public MySqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
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
