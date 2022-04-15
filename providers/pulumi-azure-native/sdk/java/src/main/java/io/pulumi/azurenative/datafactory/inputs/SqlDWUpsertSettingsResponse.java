// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sql DW upsert option settings
 * 
 */
public final class SqlDWUpsertSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlDWUpsertSettingsResponse Empty = new SqlDWUpsertSettingsResponse();

    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="interimSchemaName")
      private final @Nullable Object interimSchemaName;

    public Optional<Object> interimSchemaName() {
        return this.interimSchemaName == null ? Optional.empty() : Optional.ofNullable(this.interimSchemaName);
    }

    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="keys")
      private final @Nullable Object keys;

    public Optional<Object> keys() {
        return this.keys == null ? Optional.empty() : Optional.ofNullable(this.keys);
    }

    public SqlDWUpsertSettingsResponse(
        @Nullable Object interimSchemaName,
        @Nullable Object keys) {
        this.interimSchemaName = interimSchemaName;
        this.keys = keys;
    }

    private SqlDWUpsertSettingsResponse() {
        this.interimSchemaName = null;
        this.keys = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWUpsertSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object interimSchemaName;
        private @Nullable Object keys;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWUpsertSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interimSchemaName = defaults.interimSchemaName;
    	      this.keys = defaults.keys;
        }

        public Builder interimSchemaName(@Nullable Object interimSchemaName) {
            this.interimSchemaName = interimSchemaName;
            return this;
        }
        public Builder keys(@Nullable Object keys) {
            this.keys = keys;
            return this;
        }        public SqlDWUpsertSettingsResponse build() {
            return new SqlDWUpsertSettingsResponse(interimSchemaName, keys);
        }
    }
}
