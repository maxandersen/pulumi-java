// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlWorkloadTypeUpdateSettingsResponse {
    /**
     * SQL Server workload type.
     * 
     */
    private final @Nullable String sqlWorkloadType;

    @CustomType.Constructor
    private SqlWorkloadTypeUpdateSettingsResponse(@CustomType.Parameter("sqlWorkloadType") @Nullable String sqlWorkloadType) {
        this.sqlWorkloadType = sqlWorkloadType;
    }

    /**
     * SQL Server workload type.
     * 
    */
    public Optional<String> sqlWorkloadType() {
        return Optional.ofNullable(this.sqlWorkloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlWorkloadTypeUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sqlWorkloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlWorkloadTypeUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlWorkloadType = defaults.sqlWorkloadType;
        }

        public Builder sqlWorkloadType(@Nullable String sqlWorkloadType) {
            this.sqlWorkloadType = sqlWorkloadType;
            return this;
        }        public SqlWorkloadTypeUpdateSettingsResponse build() {
            return new SqlWorkloadTypeUpdateSettingsResponse(sqlWorkloadType);
        }
    }
}
