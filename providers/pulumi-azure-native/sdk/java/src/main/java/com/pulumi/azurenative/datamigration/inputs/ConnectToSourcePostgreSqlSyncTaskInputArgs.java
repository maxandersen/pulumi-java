// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.PostgreSqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to PostgreSQL and source server requirements
 * 
 */
public final class ConnectToSourcePostgreSqlSyncTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskInputArgs Empty = new ConnectToSourcePostgreSqlSyncTaskInputArgs();

    /**
     * Connection information for source PostgreSQL server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private Output<PostgreSqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<PostgreSqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    private ConnectToSourcePostgreSqlSyncTaskInputArgs() {}

    private ConnectToSourcePostgreSqlSyncTaskInputArgs(ConnectToSourcePostgreSqlSyncTaskInputArgs $) {
        this.sourceConnectionInfo = $.sourceConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToSourcePostgreSqlSyncTaskInputArgs $;

        public Builder() {
            $ = new ConnectToSourcePostgreSqlSyncTaskInputArgs();
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskInputArgs defaults) {
            $ = new ConnectToSourcePostgreSqlSyncTaskInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder sourceConnectionInfo(Output<PostgreSqlConnectionInfoArgs> sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder sourceConnectionInfo(PostgreSqlConnectionInfoArgs sourceConnectionInfo) {
            return sourceConnectionInfo(Output.of(sourceConnectionInfo));
        }

        public ConnectToSourcePostgreSqlSyncTaskInputArgs build() {
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            return $;
        }
    }

}
