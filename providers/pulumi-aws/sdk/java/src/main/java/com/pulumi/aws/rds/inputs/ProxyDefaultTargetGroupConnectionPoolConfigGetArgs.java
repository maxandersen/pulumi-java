// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupConnectionPoolConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupConnectionPoolConfigGetArgs Empty = new ProxyDefaultTargetGroupConnectionPoolConfigGetArgs();

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
     * 
     */
    @Import(name="connectionBorrowTimeout")
    private @Nullable Output<Integer> connectionBorrowTimeout;

    public Optional<Output<Integer>> connectionBorrowTimeout() {
        return Optional.ofNullable(this.connectionBorrowTimeout);
    }

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
     * 
     */
    @Import(name="initQuery")
    private @Nullable Output<String> initQuery;

    public Optional<Output<String>> initQuery() {
        return Optional.ofNullable(this.initQuery);
    }

    /**
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    @Import(name="maxConnectionsPercent")
    private @Nullable Output<Integer> maxConnectionsPercent;

    public Optional<Output<Integer>> maxConnectionsPercent() {
        return Optional.ofNullable(this.maxConnectionsPercent);
    }

    /**
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    @Import(name="maxIdleConnectionsPercent")
    private @Nullable Output<Integer> maxIdleConnectionsPercent;

    public Optional<Output<Integer>> maxIdleConnectionsPercent() {
        return Optional.ofNullable(this.maxIdleConnectionsPercent);
    }

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
     * 
     */
    @Import(name="sessionPinningFilters")
    private @Nullable Output<List<String>> sessionPinningFilters;

    public Optional<Output<List<String>>> sessionPinningFilters() {
        return Optional.ofNullable(this.sessionPinningFilters);
    }

    private ProxyDefaultTargetGroupConnectionPoolConfigGetArgs() {}

    private ProxyDefaultTargetGroupConnectionPoolConfigGetArgs(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs $) {
        this.connectionBorrowTimeout = $.connectionBorrowTimeout;
        this.initQuery = $.initQuery;
        this.maxConnectionsPercent = $.maxConnectionsPercent;
        this.maxIdleConnectionsPercent = $.maxIdleConnectionsPercent;
        this.sessionPinningFilters = $.sessionPinningFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProxyDefaultTargetGroupConnectionPoolConfigGetArgs $;

        public Builder() {
            $ = new ProxyDefaultTargetGroupConnectionPoolConfigGetArgs();
        }

        public Builder(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs defaults) {
            $ = new ProxyDefaultTargetGroupConnectionPoolConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionBorrowTimeout(@Nullable Output<Integer> connectionBorrowTimeout) {
            $.connectionBorrowTimeout = connectionBorrowTimeout;
            return this;
        }

        public Builder connectionBorrowTimeout(Integer connectionBorrowTimeout) {
            return connectionBorrowTimeout(Output.of(connectionBorrowTimeout));
        }

        public Builder initQuery(@Nullable Output<String> initQuery) {
            $.initQuery = initQuery;
            return this;
        }

        public Builder initQuery(String initQuery) {
            return initQuery(Output.of(initQuery));
        }

        public Builder maxConnectionsPercent(@Nullable Output<Integer> maxConnectionsPercent) {
            $.maxConnectionsPercent = maxConnectionsPercent;
            return this;
        }

        public Builder maxConnectionsPercent(Integer maxConnectionsPercent) {
            return maxConnectionsPercent(Output.of(maxConnectionsPercent));
        }

        public Builder maxIdleConnectionsPercent(@Nullable Output<Integer> maxIdleConnectionsPercent) {
            $.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
            return this;
        }

        public Builder maxIdleConnectionsPercent(Integer maxIdleConnectionsPercent) {
            return maxIdleConnectionsPercent(Output.of(maxIdleConnectionsPercent));
        }

        public Builder sessionPinningFilters(@Nullable Output<List<String>> sessionPinningFilters) {
            $.sessionPinningFilters = sessionPinningFilters;
            return this;
        }

        public Builder sessionPinningFilters(List<String> sessionPinningFilters) {
            return sessionPinningFilters(Output.of(sessionPinningFilters));
        }

        public Builder sessionPinningFilters(String... sessionPinningFilters) {
            return sessionPinningFilters(List.of(sessionPinningFilters));
        }

        public ProxyDefaultTargetGroupConnectionPoolConfigGetArgs build() {
            return $;
        }
    }

}
