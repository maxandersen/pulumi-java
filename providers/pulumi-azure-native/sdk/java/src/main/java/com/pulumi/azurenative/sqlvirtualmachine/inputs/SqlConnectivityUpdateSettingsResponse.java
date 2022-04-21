// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set the access level and network port settings for SQL Server.
 * 
 */
public final class SqlConnectivityUpdateSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlConnectivityUpdateSettingsResponse Empty = new SqlConnectivityUpdateSettingsResponse();

    /**
     * SQL Server connectivity option.
     * 
     */
    @Import(name="connectivityType")
    private @Nullable String connectivityType;

    public Optional<String> connectivityType() {
        return Optional.ofNullable(this.connectivityType);
    }

    /**
     * SQL Server port.
     * 
     */
    @Import(name="port")
    private @Nullable Integer port;

    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    private SqlConnectivityUpdateSettingsResponse() {}

    private SqlConnectivityUpdateSettingsResponse(SqlConnectivityUpdateSettingsResponse $) {
        this.connectivityType = $.connectivityType;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlConnectivityUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlConnectivityUpdateSettingsResponse $;

        public Builder() {
            $ = new SqlConnectivityUpdateSettingsResponse();
        }

        public Builder(SqlConnectivityUpdateSettingsResponse defaults) {
            $ = new SqlConnectivityUpdateSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder connectivityType(@Nullable String connectivityType) {
            $.connectivityType = connectivityType;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            $.port = port;
            return this;
        }

        public SqlConnectivityUpdateSettingsResponse build() {
            return $;
        }
    }

}
