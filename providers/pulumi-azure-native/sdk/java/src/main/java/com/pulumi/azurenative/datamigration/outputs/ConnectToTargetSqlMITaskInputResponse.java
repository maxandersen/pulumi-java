// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectToTargetSqlMITaskInputResponse {
    /**
     * Connection information for target SQL Server
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @CustomType.Constructor
    private ConnectToTargetSqlMITaskInputResponse(@CustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * Connection information for target SQL Server
     * 
    */
    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public ConnectToTargetSqlMITaskInputResponse build() {
            return new ConnectToTargetSqlMITaskInputResponse(targetConnectionInfo);
        }
    }
}
