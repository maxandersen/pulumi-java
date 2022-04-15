// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MySqlConnectionInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure Database for MySQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForMySqlTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetAzureDbForMySqlTaskInputArgs Empty = new ConnectToTargetAzureDbForMySqlTaskInputArgs();

    /**
     * Connection information for source MySQL server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final Output<MySqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<MySqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target Azure Database for MySQL server
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final Output<MySqlConnectionInfoArgs> targetConnectionInfo;

    public Output<MySqlConnectionInfoArgs> targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetAzureDbForMySqlTaskInputArgs(
        Output<MySqlConnectionInfoArgs> sourceConnectionInfo,
        Output<MySqlConnectionInfoArgs> targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetAzureDbForMySqlTaskInputArgs() {
        this.sourceConnectionInfo = Codegen.empty();
        this.targetConnectionInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MySqlConnectionInfoArgs> sourceConnectionInfo;
        private Output<MySqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder sourceConnectionInfo(Output<MySqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder sourceConnectionInfo(MySqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Output.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }
        public Builder targetConnectionInfo(Output<MySqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(MySqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Output.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }        public ConnectToTargetAzureDbForMySqlTaskInputArgs build() {
            return new ConnectToTargetAzureDbForMySqlTaskInputArgs(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
