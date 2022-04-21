// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClusterGlobalClusterMemberGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterGlobalClusterMemberGetArgs Empty = new GlobalClusterGlobalClusterMemberGetArgs();

    /**
     * Amazon Resource Name (ARN) of member DB Cluster
     * 
     */
    @Import(name="dbClusterArn")
    private @Nullable Output<String> dbClusterArn;

    public Optional<Output<String>> dbClusterArn() {
        return Optional.ofNullable(this.dbClusterArn);
    }

    /**
     * Whether the member is the primary DB Cluster
     * 
     */
    @Import(name="isWriter")
    private @Nullable Output<Boolean> isWriter;

    public Optional<Output<Boolean>> isWriter() {
        return Optional.ofNullable(this.isWriter);
    }

    private GlobalClusterGlobalClusterMemberGetArgs() {}

    private GlobalClusterGlobalClusterMemberGetArgs(GlobalClusterGlobalClusterMemberGetArgs $) {
        this.dbClusterArn = $.dbClusterArn;
        this.isWriter = $.isWriter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClusterGlobalClusterMemberGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClusterGlobalClusterMemberGetArgs $;

        public Builder() {
            $ = new GlobalClusterGlobalClusterMemberGetArgs();
        }

        public Builder(GlobalClusterGlobalClusterMemberGetArgs defaults) {
            $ = new GlobalClusterGlobalClusterMemberGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbClusterArn(@Nullable Output<String> dbClusterArn) {
            $.dbClusterArn = dbClusterArn;
            return this;
        }

        public Builder dbClusterArn(String dbClusterArn) {
            return dbClusterArn(Output.of(dbClusterArn));
        }

        public Builder isWriter(@Nullable Output<Boolean> isWriter) {
            $.isWriter = isWriter;
            return this;
        }

        public Builder isWriter(Boolean isWriter) {
            return isWriter(Output.of(isWriter));
        }

        public GlobalClusterGlobalClusterMemberGetArgs build() {
            return $;
        }
    }

}
