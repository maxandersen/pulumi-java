// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.JobTargetGroupMembershipType;
import com.pulumi.azurenative.sql.enums.JobTargetType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A job target, for example a specific database or a container of databases that is evaluated during job execution.
 * 
 */
public final class JobTargetArgs extends ResourceArgs {

    public static final JobTargetArgs Empty = new JobTargetArgs();

    /**
     * The target database name.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The target database name.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The target elastic pool name.
     * 
     */
    @Import(name="elasticPoolName")
    private @Nullable Output<String> elasticPoolName;

    /**
     * @return The target elastic pool name.
     * 
     */
    public Optional<Output<String>> elasticPoolName() {
        return Optional.ofNullable(this.elasticPoolName);
    }

    /**
     * Whether the target is included or excluded from the group.
     * 
     */
    @Import(name="membershipType")
    private @Nullable Output<JobTargetGroupMembershipType> membershipType;

    /**
     * @return Whether the target is included or excluded from the group.
     * 
     */
    public Optional<Output<JobTargetGroupMembershipType>> membershipType() {
        return Optional.ofNullable(this.membershipType);
    }

    /**
     * The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    @Import(name="refreshCredential")
    private @Nullable Output<String> refreshCredential;

    /**
     * @return The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    public Optional<Output<String>> refreshCredential() {
        return Optional.ofNullable(this.refreshCredential);
    }

    /**
     * The target server name.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The target server name.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * The target shard map.
     * 
     */
    @Import(name="shardMapName")
    private @Nullable Output<String> shardMapName;

    /**
     * @return The target shard map.
     * 
     */
    public Optional<Output<String>> shardMapName() {
        return Optional.ofNullable(this.shardMapName);
    }

    /**
     * The target type.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,JobTargetType>> type;

    /**
     * @return The target type.
     * 
     */
    public Output<Either<String,JobTargetType>> type() {
        return this.type;
    }

    private JobTargetArgs() {}

    private JobTargetArgs(JobTargetArgs $) {
        this.databaseName = $.databaseName;
        this.elasticPoolName = $.elasticPoolName;
        this.membershipType = $.membershipType;
        this.refreshCredential = $.refreshCredential;
        this.serverName = $.serverName;
        this.shardMapName = $.shardMapName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTargetArgs $;

        public Builder() {
            $ = new JobTargetArgs();
        }

        public Builder(JobTargetArgs defaults) {
            $ = new JobTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The target database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The target database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param elasticPoolName The target elastic pool name.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolName(@Nullable Output<String> elasticPoolName) {
            $.elasticPoolName = elasticPoolName;
            return this;
        }

        /**
         * @param elasticPoolName The target elastic pool name.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolName(String elasticPoolName) {
            return elasticPoolName(Output.of(elasticPoolName));
        }

        /**
         * @param membershipType Whether the target is included or excluded from the group.
         * 
         * @return builder
         * 
         */
        public Builder membershipType(@Nullable Output<JobTargetGroupMembershipType> membershipType) {
            $.membershipType = membershipType;
            return this;
        }

        /**
         * @param membershipType Whether the target is included or excluded from the group.
         * 
         * @return builder
         * 
         */
        public Builder membershipType(JobTargetGroupMembershipType membershipType) {
            return membershipType(Output.of(membershipType));
        }

        /**
         * @param refreshCredential The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
         * 
         * @return builder
         * 
         */
        public Builder refreshCredential(@Nullable Output<String> refreshCredential) {
            $.refreshCredential = refreshCredential;
            return this;
        }

        /**
         * @param refreshCredential The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
         * 
         * @return builder
         * 
         */
        public Builder refreshCredential(String refreshCredential) {
            return refreshCredential(Output.of(refreshCredential));
        }

        /**
         * @param serverName The target server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The target server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param shardMapName The target shard map.
         * 
         * @return builder
         * 
         */
        public Builder shardMapName(@Nullable Output<String> shardMapName) {
            $.shardMapName = shardMapName;
            return this;
        }

        /**
         * @param shardMapName The target shard map.
         * 
         * @return builder
         * 
         */
        public Builder shardMapName(String shardMapName) {
            return shardMapName(Output.of(shardMapName));
        }

        /**
         * @param type The target type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,JobTargetType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The target type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,JobTargetType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The target type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The target type.
         * 
         * @return builder
         * 
         */
        public Builder type(JobTargetType type) {
            return type(Either.ofRight(type));
        }

        public JobTargetArgs build() {
            $.membershipType = Codegen.objectProp("membershipType", JobTargetGroupMembershipType.class).output().arg($.membershipType).def(JobTargetGroupMembershipType.Include).getNullable();
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
