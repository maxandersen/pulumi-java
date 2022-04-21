// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.enums.ServerLevelPermissionsGroup;
import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToSourceSqlServerTaskInputArgs Empty = new ConnectToSourceSqlServerTaskInputArgs();

    /**
     * Permission group for validations
     * 
     */
    @Import(name="checkPermissionsGroup")
    private @Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup;

    public Optional<Output<Either<String,ServerLevelPermissionsGroup>>> checkPermissionsGroup() {
        return Optional.ofNullable(this.checkPermissionsGroup);
    }

    /**
     * Flag for whether to collect agent jobs from source server.
     * 
     */
    @Import(name="collectAgentJobs")
    private @Nullable Output<Boolean> collectAgentJobs;

    public Optional<Output<Boolean>> collectAgentJobs() {
        return Optional.ofNullable(this.collectAgentJobs);
    }

    /**
     * Flag for whether to collect logins from source server.
     * 
     */
    @Import(name="collectLogins")
    private @Nullable Output<Boolean> collectLogins;

    public Optional<Output<Boolean>> collectLogins() {
        return Optional.ofNullable(this.collectLogins);
    }

    /**
     * Connection information for Source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    private ConnectToSourceSqlServerTaskInputArgs() {}

    private ConnectToSourceSqlServerTaskInputArgs(ConnectToSourceSqlServerTaskInputArgs $) {
        this.checkPermissionsGroup = $.checkPermissionsGroup;
        this.collectAgentJobs = $.collectAgentJobs;
        this.collectLogins = $.collectLogins;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToSourceSqlServerTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToSourceSqlServerTaskInputArgs $;

        public Builder() {
            $ = new ConnectToSourceSqlServerTaskInputArgs();
        }

        public Builder(ConnectToSourceSqlServerTaskInputArgs defaults) {
            $ = new ConnectToSourceSqlServerTaskInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder checkPermissionsGroup(@Nullable Output<Either<String,ServerLevelPermissionsGroup>> checkPermissionsGroup) {
            $.checkPermissionsGroup = checkPermissionsGroup;
            return this;
        }

        public Builder checkPermissionsGroup(Either<String,ServerLevelPermissionsGroup> checkPermissionsGroup) {
            return checkPermissionsGroup(Output.of(checkPermissionsGroup));
        }

        public Builder collectAgentJobs(@Nullable Output<Boolean> collectAgentJobs) {
            $.collectAgentJobs = collectAgentJobs;
            return this;
        }

        public Builder collectAgentJobs(Boolean collectAgentJobs) {
            return collectAgentJobs(Output.of(collectAgentJobs));
        }

        public Builder collectLogins(@Nullable Output<Boolean> collectLogins) {
            $.collectLogins = collectLogins;
            return this;
        }

        public Builder collectLogins(Boolean collectLogins) {
            return collectLogins(Output.of(collectLogins));
        }

        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            return sourceConnectionInfo(Output.of(sourceConnectionInfo));
        }

        public ConnectToSourceSqlServerTaskInputArgs build() {
            $.collectAgentJobs = Codegen.booleanProp("collectAgentJobs").output().arg($.collectAgentJobs).def(false).getNullable();
            $.collectLogins = Codegen.booleanProp("collectLogins").output().arg($.collectLogins).def(false).getNullable();
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            return $;
        }
    }

}
